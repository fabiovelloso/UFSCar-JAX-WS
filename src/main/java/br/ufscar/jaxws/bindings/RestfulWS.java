/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.jaxws.bindings;

import java.io.ByteArrayInputStream;
import java.util.StringTokenizer;
import javax.annotation.Resource;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.BindingType;
import javax.xml.ws.Provider;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.WebServiceProvider;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;

/**
 *
 * @author fabio
 */
@WebServiceProvider(serviceName = "RestfulWS")
@BindingType(value = HTTPBinding.HTTP_BINDING)
public class RestfulWS implements Provider<Source> {
 @Override
 public Source invoke(Source source) {
  try {
   MessageContext messageContext = wsContext.getMessageContext();
   String requestMethod = (String) messageContext.get(MessageContext.HTTP_REQUEST_METHOD);
   String query = (String) messageContext.get(MessageContext.QUERY_STRING);
   String path = (String) messageContext.get(MessageContext.PATH_INFO);

   if (requestMethod.equals("GET")) {
    if (query != null && query.contains("i=") && query.contains("j=")) {
     return processRequest(query);
    } else {
     return processRequest(path);
    }
   } else {
    throw new Exception("Unsupported operation");
   }

  } catch (Exception e) {
   e.printStackTrace();
   return createSource(1, e.getMessage());
  }
 }

 private Source processRequest(String queryString) {
  StringTokenizer st = new StringTokenizer(queryString, "=&/");
  st.nextToken();
  int i = Integer.parseInt(st.nextToken());
  st.nextToken();
  int j = Integer.parseInt(st.nextToken());

  return createSource(i + j, "Sum");
 }

 private Source createSource(int status, String errorMessage) {
  String result = null;
  result = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\" ?><Response><StatusCode>" + status
      + "</StatusCode><StatusMessage>" + errorMessage + "</StatusMessage></Response>";
  return new StreamSource(new ByteArrayInputStream(result.getBytes()));
 }

 @Resource(type = Object.class)
 protected WebServiceContext wsContext;
}