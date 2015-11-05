package com.anjali.webservices.soap;

public class SimpleSOAPExampleProxy implements com.anjali.webservices.soap.SimpleSOAPExample {
  private String _endpoint = null;
  private com.anjali.webservices.soap.SimpleSOAPExample simpleSOAPExample = null;
  
  public SimpleSOAPExampleProxy() {
    _initSimpleSOAPExampleProxy();
  }
  
  public SimpleSOAPExampleProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimpleSOAPExampleProxy();
  }
  
  private void _initSimpleSOAPExampleProxy() {
    try {
      simpleSOAPExample = (new com.anjali.webservices.soap.SimpleSOAPExampleServiceLocator()).getSimpleSOAPExample();
      if (simpleSOAPExample != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simpleSOAPExample)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simpleSOAPExample)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simpleSOAPExample != null)
      ((javax.xml.rpc.Stub)simpleSOAPExample)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.anjali.webservices.soap.SimpleSOAPExample getSimpleSOAPExample() {
    if (simpleSOAPExample == null)
      _initSimpleSOAPExampleProxy();
    return simpleSOAPExample;
  }
  
  public java.lang.String sayHelloWorld(java.lang.String name) throws java.rmi.RemoteException{
    if (simpleSOAPExample == null)
      _initSimpleSOAPExampleProxy();
    return simpleSOAPExample.sayHelloWorld(name);
  }
  
  
}