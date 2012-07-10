/**
 * Start.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main.java.com.sap._2009._11._24.deployws;

public class Start implements java.io.Serializable {
	private main.java.com.sap._2009._11._24.deployws.Application[] apps;

	private main.java.com.sap._2009._11._24.deployws.Option[] options;

	public Start() {
	}

	public Start(main.java.com.sap._2009._11._24.deployws.Application[] apps,
			main.java.com.sap._2009._11._24.deployws.Option[] options) {
		this.apps = apps;
		this.options = options;
	}

	/**
	 * Gets the apps value for this Start.
	 * 
	 * @return apps
	 */
	public main.java.com.sap._2009._11._24.deployws.Application[] getApps() {
		return apps;
	}

	/**
	 * Sets the apps value for this Start.
	 * 
	 * @param apps
	 */
	public void setApps(main.java.com.sap._2009._11._24.deployws.Application[] apps) {
		this.apps = apps;
	}

	public main.java.com.sap._2009._11._24.deployws.Application getApps(int i) {
		return this.apps[i];
	}

	public void setApps(int i, main.java.com.sap._2009._11._24.deployws.Application _value) {
		this.apps[i] = _value;
	}

	/**
	 * Gets the options value for this Start.
	 * 
	 * @return options
	 */
	public main.java.com.sap._2009._11._24.deployws.Option[] getOptions() {
		return options;
	}

	/**
	 * Sets the options value for this Start.
	 * 
	 * @param options
	 */
	public void setOptions(main.java.com.sap._2009._11._24.deployws.Option[] options) {
		this.options = options;
	}

	public main.java.com.sap._2009._11._24.deployws.Option getOptions(int i) {
		return this.options[i];
	}

	public void setOptions(int i, main.java.com.sap._2009._11._24.deployws.Option _value) {
		this.options[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Start))
			return false;
		Start other = (Start) obj;
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
				&& ((this.apps == null && other.getApps() == null) || (this.apps != null && java.util.Arrays
						.equals(this.apps, other.getApps())))
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
		if (getApps() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getApps()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getApps(), i);
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
			Start.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "start"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("apps");
		elemField.setXmlName(new javax.xml.namespace.QName("", "apps"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://sap.com/2009/11/24/deployws", "application"));
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