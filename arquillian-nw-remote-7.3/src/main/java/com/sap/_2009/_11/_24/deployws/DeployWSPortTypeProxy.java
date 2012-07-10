package main.java.com.sap._2009._11._24.deployws;

public class DeployWSPortTypeProxy implements
		main.java.com.sap._2009._11._24.deployws.DeployWSPortType {
	private String _endpoint = null;
	private main.java.com.sap._2009._11._24.deployws.DeployWSPortType deployWSPortType = null;

	public DeployWSPortTypeProxy() {
		_initDeployWSPortTypeProxy();
	}

	public DeployWSPortTypeProxy(String endpoint) {
		_endpoint = endpoint;
		_initDeployWSPortTypeProxy();
	}

	private void _initDeployWSPortTypeProxy() {
		try {
			deployWSPortType = (new main.java.com.sap._2009._11._24.deployws.DeployWSServiceLocator())
					.getDeployWSPort();
			if (deployWSPortType != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) deployWSPortType)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) deployWSPortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (deployWSPortType != null)
			((javax.xml.rpc.Stub) deployWSPortType)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public main.java.com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPortType() {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType;
	}

	public main.java.com.sap._2009._11._24.deployws.Application[] stop(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.stop(apps, options);
	}

	public main.java.com.sap._2009._11._24.deployws.DeployResult deployLocal(
			java.lang.String[] archivePaths,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.deployLocal(archivePaths, options);
	}

	public main.java.com.sap._2009._11._24.deployws.DeployResult undeploy(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.undeploy(apps, options);
	}

	public main.java.com.sap._2009._11._24.deployws.DeployResult deploy(
			main.java.com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.deploy(archiveFiles, options);
	}

	public main.java.com.sap._2009._11._24.deployws.Application[] start(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.start(apps, options);
	}

	public main.java.com.sap._2009._11._24.deployws.Application[] getApplications(
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.getApplications(options);
	}

	public java.lang.String getVersion() throws java.rmi.RemoteException {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.getVersion();
	}

}