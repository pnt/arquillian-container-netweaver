package com.sap.arquillian.container.nw.remote;

import javax.xml.namespace.QName;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.arquillian.container.spi.client.container.ContainerConfiguration;
import org.jboss.arquillian.core.spi.Validate;

public class NetWeaverRemoteConfiguration implements ContainerConfiguration {

	private String deployWSNamespace = "http://sap.com/2009/11/24/deployws";
	private String deployWSPortName = "DeployWSPortType";

	private String serverAddress = "localhost";

	private int serverPort = 50000;

	private String user = "administrator";

	private String pass = "password";

	private String urlCharset = "ISO-8859-1";

	@Override
	public void validate() throws ConfigurationException {
		Validate.notNullOrEmpty(serverAddress,
				"Bind address must not be null or empty");
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setUrlCharset(String urlCharset) {
		this.urlCharset = urlCharset;
	}

	public String getUrlCharset() {
		return urlCharset;
	}

	public QName getWSQName() {
		return new QName(getDeployWSNamespace(), getDeployWSPortName());
	}

	public String getDeployWSNamespace() {
		return deployWSNamespace;
	}

	public void setDeployWSNamespace(String deployWSNamespace) {
		this.deployWSNamespace = deployWSNamespace;
	}

	public String getDeployWSPortName() {
		return deployWSPortName;
	}

	public void setDeployWSPortName(String deployWSPortName) {
		this.deployWSPortName = deployWSPortName;
	}

}
