/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws.basic;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author fabio
 */
@WebService(serviceName = "HelloWorld")
public class HelloWorld {

    /**
     * This is a sample web service operation
     * @return "Hello World !"
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        return "Hello World !";
    }
}
