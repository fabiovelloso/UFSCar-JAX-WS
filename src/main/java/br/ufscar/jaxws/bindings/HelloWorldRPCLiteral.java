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
 * 
 * parameterStyle must be SOAPBinding.ParameterStyle.WRAPPED
 */
@WebService(serviceName = "HelloWorldRPCLiteral")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL,
        parameterStyle =SOAPBinding.ParameterStyle.WRAPPED )
public class HelloWorldRPCLiteral {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String parameter) {
        return "Hello " + parameter + " !";
    }
}
