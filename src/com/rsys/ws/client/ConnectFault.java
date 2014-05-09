
/**
 * ConnectFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws.client;

public class ConnectFault extends java.lang.Exception{

    private static final long serialVersionUID = 1396456384108L;
    
    private com.rsys.ws.fault.ConnectFault faultMessage;

    
        public ConnectFault() {
            super("ConnectFault");
        }

        public ConnectFault(java.lang.String s) {
           super(s);
        }

        public ConnectFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ConnectFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.ConnectFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.ConnectFault getFaultMessage(){
       return faultMessage;
    }
}
    