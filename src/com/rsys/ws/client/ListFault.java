
/**
 * ListFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws.client;

public class ListFault extends java.lang.Exception{

    private static final long serialVersionUID = 1396456384086L;
    
    private com.rsys.ws.fault.ListFault faultMessage;

    
        public ListFault() {
            super("ListFault");
        }

        public ListFault(java.lang.String s) {
           super(s);
        }

        public ListFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ListFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.ListFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.ListFault getFaultMessage(){
       return faultMessage;
    }
}
    