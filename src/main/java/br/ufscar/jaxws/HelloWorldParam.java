/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author fabio
 */
@WebService(serviceName = "HelloWorldParam")
public class HelloWorldParam {

    /**
     * This is a sample web service operation
     * @param param
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String param) {
        return "Hello " + param + " !";
    }
}
