package main.java.com.sap.arquillian.container.nw.remote;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import main.java.com.sap._2009._11._24.deployws.Application;
import main.java.com.sap._2009._11._24.deployws.ArchiveFile;
import main.java.com.sap._2009._11._24.deployws.DeployFault;
import main.java.com.sap._2009._11._24.deployws.DeployWSPortType;
import main.java.com.sap._2009._11._24.deployws.DeployWSServiceLocator;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.container.spi.client.container.DeploymentException;
import org.jboss.arquillian.container.spi.client.container.LifecycleException;
import org.jboss.arquillian.container.spi.client.deployment.Validate;
import org.jboss.arquillian.container.spi.client.protocol.ProtocolDescription;
import org.jboss.arquillian.container.spi.client.protocol.metadata.ProtocolMetaData;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;

public class NetWeaverRemoteContainer implements
		DeployableContainer<NetWeaverRemoteConfiguration> {

	private NetWeaverRemoteConfiguration config;

	@Override
	public Class<NetWeaverRemoteConfiguration> getConfigurationClass() {
		return NetWeaverRemoteConfiguration.class;
	}

	@Override
	public void setup(NetWeaverRemoteConfiguration configuration) {
		config = configuration;

	}

	@Override
	public void start() throws LifecycleException {
		// no-op
	}

	@Override
	public void stop() throws LifecycleException {
		// no-op
	}

	@Override
	public ProtocolDescription getDefaultProtocol() {
		return new ProtocolDescription("Servlet 2.5");
	}

	@Override
	public ProtocolMetaData deploy(Archive<?> archive)
			throws DeploymentException {
		Validate.notNull(archive, "Archive must not be null");
		System.out.println(archive.toString(true));

		ArchiveFile af = new ArchiveFile();
		af.setFileName(archive.getName());

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		archive.as(ZipExporter.class).exportTo(out);
		af.setContent(out.toByteArray());
		try {
			out.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		QName portQN = config.getWSQName();

		DeployWSServiceLocator locator = new DeployWSServiceLocator();

		DeployWSPortType svc = null;
		try {
			svc = (DeployWSPortType) locator.getPort(portQN,
					DeployWSPortType.class);
		} catch (ServiceException e) {
			throw new RuntimeException("Cannot get port for Web Service", e);
		}

		org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub) svc;
		stub.setUsername(config.getUser());
		stub.setPassword(config.getPass());

		try {
			svc.deploy(new ArchiveFile[] { af }, null);
		} catch (DeployFault e) {
			throw new RuntimeException("Unable to deploy archive "
					+ af.getFileName(), e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

		return new ProtocolMetaData();
	}

	@Override
	public void undeploy(Archive<?> archive) throws DeploymentException {
		QName portQN = config.getWSQName();

		DeployWSServiceLocator locator = new DeployWSServiceLocator();

		DeployWSPortType svc = null;
		try {
			svc = (DeployWSPortType) locator.getPort(portQN,
					DeployWSPortType.class);
		} catch (ServiceException e) {
			throw new RuntimeException("Cannot get port for Web Service", e);
		}

		org.apache.axis.client.Stub stub = (org.apache.axis.client.Stub) svc;
		stub.setUsername(config.getUser());
		stub.setPassword(config.getPass());
		
		Application app = new Application();
		app.setVersion("1"); //is it really necessary?
		app.setVendor("JavaEE");
		app.setName(archive.getName().substring(0, archive.getName().indexOf(".")));
		
		try {
			svc.undeploy(new Application[]{app}, null);
		} catch (DeployFault e) {
			throw new RuntimeException("Unable to undeploy application " + app.getName(), e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deploy(Descriptor descriptor) throws DeploymentException {
		throw new UnsupportedOperationException("Not implemented");
	}

	@Override
	public void undeploy(Descriptor descriptor) throws DeploymentException {
		throw new UnsupportedOperationException("Not implemented");
	}

}
