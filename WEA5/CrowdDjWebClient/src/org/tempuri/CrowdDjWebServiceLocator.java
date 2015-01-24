/**
 * CrowdDjWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CrowdDjWebServiceLocator extends org.apache.axis.client.Service implements org.tempuri.CrowdDjWebService {

    public CrowdDjWebServiceLocator() {
    }


    public CrowdDjWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrowdDjWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CrowdDjWebServiceSoap
    private java.lang.String CrowdDjWebServiceSoap_address = "http://localhost:30380/CrowdDjWebService.asmx";

    public java.lang.String getCrowdDjWebServiceSoapAddress() {
        return CrowdDjWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrowdDjWebServiceSoapWSDDServiceName = "CrowdDjWebServiceSoap";

    public java.lang.String getCrowdDjWebServiceSoapWSDDServiceName() {
        return CrowdDjWebServiceSoapWSDDServiceName;
    }

    public void setCrowdDjWebServiceSoapWSDDServiceName(java.lang.String name) {
        CrowdDjWebServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.CrowdDjWebServiceSoap getCrowdDjWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CrowdDjWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrowdDjWebServiceSoap(endpoint);
    }

    public org.tempuri.CrowdDjWebServiceSoap getCrowdDjWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.CrowdDjWebServiceSoapStub _stub = new org.tempuri.CrowdDjWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getCrowdDjWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrowdDjWebServiceSoapEndpointAddress(java.lang.String address) {
        CrowdDjWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.CrowdDjWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.CrowdDjWebServiceSoapStub _stub = new org.tempuri.CrowdDjWebServiceSoapStub(new java.net.URL(CrowdDjWebServiceSoap_address), this);
                _stub.setPortName(getCrowdDjWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CrowdDjWebServiceSoap".equals(inputPortName)) {
            return getCrowdDjWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CrowdDjWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CrowdDjWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CrowdDjWebServiceSoap".equals(portName)) {
            setCrowdDjWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
