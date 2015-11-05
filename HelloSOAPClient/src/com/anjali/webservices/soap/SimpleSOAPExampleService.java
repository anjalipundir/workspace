/**
 * SimpleSOAPExampleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.anjali.webservices.soap;

public interface SimpleSOAPExampleService extends javax.xml.rpc.Service {
    public java.lang.String getSimpleSOAPExampleAddress();

    public com.anjali.webservices.soap.SimpleSOAPExample getSimpleSOAPExample() throws javax.xml.rpc.ServiceException;

    public com.anjali.webservices.soap.SimpleSOAPExample getSimpleSOAPExample(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
