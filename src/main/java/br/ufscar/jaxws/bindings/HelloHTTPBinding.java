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
import javax.xml.ws.http.HTTPBinding;

/**
 *
 * @author fabio
 */
@WebService(serviceName = "HelloHTTPBinding")
//@BindingType(HTTPBinding.HTTP_BINDING)
public class HelloHTTPBinding {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
