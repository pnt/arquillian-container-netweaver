/**
 * DeployWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main.java.com.sap._2009._11._24.deployws;

public interface DeployWSPortType extends java.rmi.Remote {
	public main.java.com.sap._2009._11._24.deployws.Application[] stop(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public main.java.com.sap._2009._11._24.deployws.DeployResult deployLocal(
			java.lang.String[] archivePaths,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public main.java.com.sap._2009._11._24.deployws.DeployResult undeploy(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public main.java.com.sap._2009._11._24.deployws.DeployResult deploy(
			main.java.com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public main.java.com.sap._2009._11._24.deployws.Application[] start(
			main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public main.java.com.sap._2009._11._24.deployws.Application[] getApplications(
			main.java.com.sap._2009._11._24.deployws.Option[] options)
			throws java.rmi.RemoteException,
			main.java.com.sap._2009._11._24.deployws.DeployFault;

	public java.lang.String getVersion() throws java.rmi.RemoteException;
}
