/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.accessibility.Accessible;



/**
 *
 * @author fabio
 */


@WebService(serviceName = "PrintMessage")
public class PrintMessage {

    @WebMethod(operationName = "print")
    @Oneway
    public void print(@WebParam(name = "name") String param) {
        System.out.println("Message: " +param);
    }
}



 /**
     * This is a sample web service operation
     */

