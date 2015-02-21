/**
 * Copyright 2015 Fabio Velloso <github@fabiovelloso.com.br>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.ufscar.jaxws.basic;

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

