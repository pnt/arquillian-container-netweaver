/**
 * Deploy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sap._2009._11._24.deployws;

public class Deploy implements java.io.Serializable {
	private com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles;

	private com.sap._2009._11._24.deployws.Option[] options;

	public Deploy() {
	}

	public Deploy(com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles,
			com.sap._2009._11._24.deployws.Option[] options) {
		this.archiveFiles = archiveFiles;
		this.options = options;
	}

	/**
	 * Gets the archiveFiles value for this Deploy.
	 * 
	 * @return archiveFiles
	 */
	public com.sap._2009._11._24.deployws.ArchiveFile[] getArchiveFiles() {
		return archiveFiles;
	}

	/**
	 * Sets the archiveFiles value for this Deploy.
	 * 
	 * @param archiveFiles
	 */
	public void setArchiveFiles(
			com.sap._2009._11._24.deployws.ArchiveFile[] archiveFiles) {
		this.archiveFiles = archiveFiles;
	}

	public com.sap._2009._11._24.deployws.ArchiveFile getArchiveFiles(int i) {
		return this.archiveFiles[i];
	}

	public void setArchiveFiles(int i,
			com.sap._2009._11._24.deployws.ArchiveFile _value) {
		this.archiveFiles[i] = _value;
	}

	/**
	 * Gets the options value for this Deploy.
	 * 
	 * @return options
	 */
	public com.sap._2009._11._24.deployws.Option[] getOptions() {
		return options;
	}

	/**
	 * Sets the options value for this Deploy.
	 * 
	 * @param options
	 */
	public void setOptions(com.sap._2009._11._24.deployws.Option[] options) {
		this.options = options;
	}

	public com.sap._2009._11._24.deployws.Option getOptions(int i) {
		return this.options[i];
	}

	public void setOptions(int i, com.sap._2009._11._24.deployws.Option _value) {
		this.options[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Deploy))
			return false;
		Deploy other = (Deploy) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.archiveFiles == null && other.getArchiveFiles() == null) || (this.archiveFiles != null && java.util.Arrays
						.equals(this.archiveFiles, other.getArchiveFiles())))
				&& ((this.options == null && other.getOptions() == null) || (this.options != null && java.util.Arrays
						.equals(this.options, other.getOptions())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getArchiveFiles() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getArchiveFiles()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getArchiveFiles(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOptions() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOptions()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOptions(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Deploy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "deploy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("archiveFiles");
		elemField.setXmlName(new javax.xml.namespace.QName("", "archiveFiles"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "archiveFile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("options");
		elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "option"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
