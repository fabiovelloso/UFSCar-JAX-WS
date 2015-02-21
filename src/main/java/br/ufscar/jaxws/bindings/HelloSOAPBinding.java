/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws.bindings;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 *
 * @author fabio
 */
@WebService(serviceName = "HelloSOAPBinding")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING) 

public class HelloSOAPBinding {

    /**
     * This is a sample web service operation
     * @param parameter
     * @return Hello + parameter
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String parameter) {
        return "Hello " + parameter + " !";
    }
}
