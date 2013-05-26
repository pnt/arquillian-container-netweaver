/**
 * DeployWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap._2009._11._24.deployws;

import com.sap.arquillian.container.nw.remote.NetWeaverRemoteConfiguration;

public class DeployWSServiceLocator extends org.apache.axis.client.Service
		implements com.sap._2009._11._24.deployws.DeployWSService {
	private NetWeaverRemoteConfiguration config = new NetWeaverRemoteConfiguration();
	public DeployWSServiceLocator() {
	}

	public DeployWSServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public DeployWSServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for DeployWSPort
	private java.lang.String DeployWSPort_address = "http://" + config.getServerAddress() + ":" + config.getServerPort()+ "/DeployWSService/DeployWS";

	public java.lang.String getDeployWSPortAddress() {
		return DeployWSPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String DeployWSPortWSDDServiceName = "DeployWSPort";

	public java.lang.String getDeployWSPortWSDDServiceName() {
		return DeployWSPortWSDDServiceName;
	}

	public void setDeployWSPortWSDDServiceName(java.lang.String name) {
		DeployWSPortWSDDServiceName = name;
	}

	public com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(DeployWSPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getDeployWSPort(endpoint);
	}

	public com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.sap._2009._11._24.deployws.DeployWSPortTypeBindingStub _stub = new com.sap._2009._11._24.deployws.DeployWSPortTypeBindingStub(
					portAddress, this);
			_stub.setPortName(getDeployWSPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setDeployWSPortEndpointAddress(java.lang.String address) {
		DeployWSPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (com.sap._2009._11._24.deployws.DeployWSPortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				com.sap._2009._11._24.deployws.DeployWSPortTypeBindingStub _stub = new com.sap._2009._11._24.deployws.DeployWSPortTypeBindingStub(
						new java.net.URL(DeployWSPort_address), this);
				_stub.setPortName(getDeployWSPortWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("DeployWSPort".equals(inputPortName)) {
			return getDeployWSPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "DeployWSService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://sap.com/2009/11/24/deployws", "DeployWSPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("DeployWSPort".equals(portName)) {
			setDeployWSPortEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
