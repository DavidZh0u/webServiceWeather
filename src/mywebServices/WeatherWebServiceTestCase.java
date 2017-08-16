/**
 * WeatherWebServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mywebServices;

public class WeatherWebServiceTestCase extends junit.framework.TestCase {
    public WeatherWebServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testWeatherWebServiceSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new mywebServices.WeatherWebServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1WeatherWebServiceSoap12GetSupportCity() throws Exception {
        mywebServices.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap12Stub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getSupportCity(new java.lang.String());
        // TBD - validate results
    }

    public void test2WeatherWebServiceSoap12GetSupportProvince() throws Exception {
        mywebServices.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap12Stub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getSupportProvince();
        // TBD - validate results
    }

    public void test3WeatherWebServiceSoap12GetSupportDataSet() throws Exception {
        mywebServices.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap12Stub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mywebServices.GetSupportDataSetResponseGetSupportDataSetResult value = null;
        value = binding.getSupportDataSet();
        // TBD - validate results
    }

    public void test4WeatherWebServiceSoap12GetWeatherbyCityName() throws Exception {
        mywebServices.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap12Stub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getWeatherbyCityName(new java.lang.String());
        // TBD - validate results
    }

    public void test5WeatherWebServiceSoap12GetWeatherbyCityNamePro() throws Exception {
        mywebServices.WeatherWebServiceSoap12Stub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap12Stub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap12();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getWeatherbyCityNamePro(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void testWeatherWebServiceSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new mywebServices.WeatherWebServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test6WeatherWebServiceSoapGetSupportCity() throws Exception {
        mywebServices.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap_BindingStub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getSupportCity(new java.lang.String());
        // TBD - validate results
    }

    public void test7WeatherWebServiceSoapGetSupportProvince() throws Exception {
        mywebServices.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap_BindingStub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getSupportProvince();
        // TBD - validate results
    }

    public void test8WeatherWebServiceSoapGetSupportDataSet() throws Exception {
        mywebServices.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap_BindingStub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        mywebServices.GetSupportDataSetResponseGetSupportDataSetResult value = null;
        value = binding.getSupportDataSet();
        // TBD - validate results
    }

    public void test9WeatherWebServiceSoapGetWeatherbyCityName() throws Exception {
        mywebServices.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap_BindingStub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getWeatherbyCityName(new java.lang.String());
        // TBD - validate results
    }

    public void test10WeatherWebServiceSoapGetWeatherbyCityNamePro() throws Exception {
        mywebServices.WeatherWebServiceSoap_BindingStub binding;
        try {
            binding = (mywebServices.WeatherWebServiceSoap_BindingStub)
                          new mywebServices.WeatherWebServiceLocator().getWeatherWebServiceSoap();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getWeatherbyCityNamePro(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

}
