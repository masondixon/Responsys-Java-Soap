
/**
 * ListExtensionFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws.client;

public class ListExtensionFault extends java.lang.Exception{

    private static final long serialVersionUID = 1396456384135L;
    
    private com.rsys.ws.fault.ListExtensionFault faultMessage;

    
        public ListExtensionFault() {
            super("ListExtensionFault");
        }

        public ListExtensionFault(java.lang.String s) {
           super(s);
        }

        public ListExtensionFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ListExtensionFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.ListExtensionFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.ListExtensionFault getFaultMessage(){
       return faultMessage;
    }
}
    