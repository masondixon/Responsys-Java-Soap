
/**
 * AccountFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws.client;

public class AccountFault extends java.lang.Exception{

    private static final long serialVersionUID = 1396456384117L;
    
    private com.rsys.ws.fault.AccountFault faultMessage;

    
        public AccountFault() {
            super("AccountFault");
        }

        public AccountFault(java.lang.String s) {
           super(s);
        }

        public AccountFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AccountFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.AccountFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.AccountFault getFaultMessage(){
       return faultMessage;
    }
}
    