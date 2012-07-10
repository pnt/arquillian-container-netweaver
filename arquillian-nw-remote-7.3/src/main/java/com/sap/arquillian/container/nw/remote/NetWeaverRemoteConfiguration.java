package main.java.com.sap.arquillian.container.nw.remote;

import javax.xml.namespace.QName;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.arquillian.container.spi.client.container.ContainerConfiguration;
import org.jboss.arquillian.core.spi.Validate;


public class NetWeaverRemoteConfiguration implements ContainerConfiguration {

	private String wsNamespace = "http://sap.com/2009/11/24/deployws";
	private String wsPortName = "DeployWSPortType";

	private String bindAddress = "vecb731S3V001.dhcp.wdf.sap.corp";

	private int bindHttpPort = 50000;

	private String user = "administrator";

	private String pass = "abcd1234";

	private String urlCharset = "ISO-8859-1";

	@Override
	public void validate() throws ConfigurationException {
		Validate.notNullOrEmpty(bindAddress,
				"Bind address must not be null or empty");
	}

	public String getBindAddress() {
		return bindAddress;
	}

	public void setBindAddress(String bindAddress) {
		this.bindAddress = bindAddress;
	}

	public int getBindHttpPort() {
		return bindHttpPort;
	}

	/**
	 * Set the HTTP bind port.
	 * 
	 * @param httpBindPort
	 *            HTTP bind port
	 */
	public void setBindHttpPort(int bindHttpPort) {
		this.bindHttpPort = bindHttpPort;

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

	/**
	 * @param urlCharset
	 *            the urlCharset to set
	 */
	public void setUrlCharset(String urlCharset) {
		this.urlCharset = urlCharset;
	}

	/**
	 * @return the urlCharset
	 */
	public String getUrlCharset() {
		return urlCharset;
	}

	public QName getWSQName() {
		return new QName(getWsNamespace(), getWsPortName());
	}

	public String getWsNamespace() {
		return wsNamespace;
	}

	public void setWsNamespace(String wsNamespace) {
		this.wsNamespace = wsNamespace;
	}

	public String getWsPortName() {
		return wsPortName;
	}

	public void setWsPortName(String wsPortName) {
		this.wsPortName = wsPortName;
	}

	// /**
	// * @param managerUrl the managerUrl to set
	// */
	// public void setManagerUrl(URL managerUrl)
	// {
	// this.managerUrl = managerUrl;
	// }
	//
	// /**
	// * @return the managerUrl
	// */
	// public URL getManagerUrl()
	// {
	// return managerUrl;
	// }

	// protected URL createManagerUrl() throws MalformedURLException
	// {
	// final String template = "http://%s:%d/manager";
	//
	// return new URL(String.format(template, bindAddress, bindHttpPort));
	// }

}
