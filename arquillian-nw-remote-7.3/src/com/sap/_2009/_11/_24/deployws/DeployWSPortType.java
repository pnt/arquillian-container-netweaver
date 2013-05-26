/**
 * DeployWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap._2009._11._24.deployws;

public interface DeployWSPortType extends java.rmi.Remote {
	public com.sap._2009._11._24.deployws.Application[] stop(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public com.sap._2009._11._24.deployws.DeployResult deployLocal(
			java.lang.String[] archivePaths,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public com.sap._2009._11._24.deployws.DeployResult undeploy(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public com.sap._2009._11._24.deployws.DeployResult deploy(
			com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public com.sap._2009._11._24.deployws.Application[] start(
			com.sap._2009._11._24.deployws.Application[] apps,
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public com.sap._2009._11._24.deployws.Application[] getApplications(
			com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			com.sap._2009._11._24.deployws.DeployFault;

	public java.lang.String getVersion() throws java.rmi.RemoteException;
}
