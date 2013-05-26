package com.sap._2009._11._24.deployws;

public class DeployWSPortTypeProxy implements
		com.sap._2009._11._24.deployws.DeployWSPortType {
	private String _endpoint = null;
	private com.sap._2009._11._24.deployws.DeployWSPortType deployWSPortType = null;

	public DeployWSPortTypeProxy() {
		_initDeployWSPortTypeProxy();
	}

	public DeployWSPortTypeProxy(String endpoint) {
		_endpoint = endpoint;
		_initDeployWSPortTypeProxy();
	}

	private void _initDeployWSPortTypeProxy() {
		try {
			deployWSPortType = (new com.sap._2009._11._24.deployws.DeployWSServiceLocator())
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

	public com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPortType() {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType;
	}

	public com.sap._2009._11._24.deployws.Application[] stop(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.stop(apps, options);
	}

	public com.sap._2009._11._24.deployws.DeployResult deployLocal(
			java.lang.String[] archivePaths,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.deployLocal(archivePaths, options);
	}

	public com.sap._2009._11._24.deployws.DeployResult undeploy(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.undeploy(apps, options);
	}

	public com.sap._2009._11._24.deployws.DeployResult deploy(
			com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.deploy(archiveFiles, options);
	}

	public com.sap._2009._11._24.deployws.Application[] start(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
		if (deployWSPortType == null)
			_initDeployWSPortTypeProxy();
		return deployWSPortType.start(apps, options);
	}

	public com.sap._2009._11._24.deployws.Application[] getApplications(
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault {
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