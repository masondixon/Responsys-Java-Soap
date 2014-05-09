
/**
 * TriggeredMessageFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rsys.ws.client;

public class TriggeredMessageFault extends java.lang.Exception{

    private static final long serialVersionUID = 1396456384192L;
    
    private com.rsys.ws.fault.TriggeredMessageFault faultMessage;

    
        public TriggeredMessageFault() {
            super("TriggeredMessageFault");
        }

        public TriggeredMessageFault(java.lang.String s) {
           super(s);
        }

        public TriggeredMessageFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TriggeredMessageFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rsys.ws.fault.TriggeredMessageFault msg){
       faultMessage = msg;
    }
    
    public com.rsys.ws.fault.TriggeredMessageFault getFaultMessage(){
       return faultMessage;
    }
}
    