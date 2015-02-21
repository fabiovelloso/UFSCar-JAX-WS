/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws.bindings;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author fabio
 */
@WebService(serviceName = "HelloWorldDocumentLiteral")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL )
public class HelloWorldDocumentLiteral {

    /**
     * This is a sample web service operation
     * @param parameter
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String parameter) {
        return "Hello " + parameter + " !";
    }
}
