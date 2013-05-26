/**
 * DeployWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap._2009._11._24.deployws;

public interface DeployWSService extends javax.xml.rpc.Service {
	public java.lang.String getDeployWSPortAddress();

	public com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPort()
			throws javax.xml.rpc.ServiceException;

	public com.sap._2009._11._24.deployws.DeployWSPortType getDeployWSPort(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
