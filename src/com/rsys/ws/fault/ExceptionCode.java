
/**
 * ExceptionCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rsys.ws.fault;
            

            /**
            *  ExceptionCode bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExceptionCode
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "urn:fault.ws.rsys.com",
                "ExceptionCode",
                "ns1");

            

                        /**
                        * field for ExceptionCode
                        */

                        
                                    protected java.lang.String localExceptionCode ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected ExceptionCode(java.lang.String value, boolean isRegisterValue) {
                                    localExceptionCode = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localExceptionCode, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _API_DISABLED_FOR_USER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("API_DISABLED_FOR_USER");
                                
                                    public static final java.lang.String _INSUFFICIENT_ACCESS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INSUFFICIENT_ACCESS");
                                
                                    public static final java.lang.String _INVALID_USER_NAME =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_USER_NAME");
                                
                                    public static final java.lang.String _INVALID_PASSWORD =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_PASSWORD");
                                
                                    public static final java.lang.String _INVALID_SESSION_ID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_SESSION_ID");
                                
                                    public static final java.lang.String _INVALID_SOAP_HEADER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_SOAP_HEADER");
                                
                                    public static final java.lang.String _INVALID_NUMBER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_NUMBER");
                                
                                    public static final java.lang.String _INVALID_DATE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_DATE");
                                
                                    public static final java.lang.String _INVALID_PARAMETER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_PARAMETER");
                                
                                    public static final java.lang.String _INVALID_FIELD_NAME =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_FIELD_NAME");
                                
                                    public static final java.lang.String _INVALID_OBJECT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_OBJECT");
                                
                                    public static final java.lang.String _PASSWORD_LOCKOUT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PASSWORD_LOCKOUT");
                                
                                    public static final java.lang.String _PASSWORD_EXPIRED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PASSWORD_EXPIRED");
                                
                                    public static final java.lang.String _REQUEST_LIMIT_EXCEEDED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("REQUEST_LIMIT_EXCEEDED");
                                
                                    public static final java.lang.String _CAMPAIGN_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_NOT_FOUND");
                                
                                    public static final java.lang.String _CAMPAIGN_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _RECIPIENT_LIMIT_EXCEEDED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RECIPIENT_LIMIT_EXCEEDED");
                                
                                    public static final java.lang.String _MAX_ATTACHMENT_SIZE_EXCEEDED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MAX_ATTACHMENT_SIZE_EXCEEDED");
                                
                                    public static final java.lang.String _PROOF_LIST_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PROOF_LIST_NOT_FOUND");
                                
                                    public static final java.lang.String _CAMPAIGN_LAUNCH_IN_PROGRESS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_LAUNCH_IN_PROGRESS");
                                
                                    public static final java.lang.String _CAMPAIGN_NOT_LISTENING =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_NOT_LISTENING");
                                
                                    public static final java.lang.String _CAMPAIGN_LAUNCH_NOT_SCHEDULED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_LAUNCH_NOT_SCHEDULED");
                                
                                    public static final java.lang.String _CAMPAIGN_LAUNCH_NOT_UNSCHEDULED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_LAUNCH_NOT_UNSCHEDULED");
                                
                                    public static final java.lang.String _CAMPAIGN_NOT_APPROVED_FOR_LAUNCH =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_NOT_APPROVED_FOR_LAUNCH");
                                
                                    public static final java.lang.String _SCHEDULED_LAUNCH_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SCHEDULED_LAUNCH_NOT_FOUND");
                                
                                    public static final java.lang.String _CAMPAIGN_IS_INVALID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAMPAIGN_IS_INVALID");
                                
                                    public static final java.lang.String _MOBILE_CAMPAIGN_DISABLED_FOR_USER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MOBILE_CAMPAIGN_DISABLED_FOR_USER");
                                
                                    public static final java.lang.String _FOLDER_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FOLDER_NOT_FOUND");
                                
                                    public static final java.lang.String _FOLDER_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FOLDER_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _NO_OPEN_LAUNCHES_FOR_THIS_ACCOUNT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NO_OPEN_LAUNCHES_FOR_THIS_ACCOUNT");
                                
                                    public static final java.lang.String _NO_LAUNCHES_FOR_THIS_CAMPAIGN =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NO_LAUNCHES_FOR_THIS_CAMPAIGN");
                                
                                    public static final java.lang.String _NO_CAMPAIGNS_IN_THIS_FOLDER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NO_CAMPAIGNS_IN_THIS_FOLDER");
                                
                                    public static final java.lang.String _NO_OBJECTS_IN_THIS_FOLDER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NO_OBJECTS_IN_THIS_FOLDER");
                                
                                    public static final java.lang.String _LIST_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LIST_NOT_FOUND");
                                
                                    public static final java.lang.String _LIST_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LIST_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _LINK_TABLE_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LINK_TABLE_NOT_FOUND");
                                
                                    public static final java.lang.String _LINK_TABLE_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LINK_TABLE_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _TABLE_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TABLE_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _TABLE_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TABLE_NOT_FOUND");
                                
                                    public static final java.lang.String _CUSTOM_EVENT_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CUSTOM_EVENT_NOT_FOUND");
                                
                                    public static final java.lang.String _RECORD_LIMIT_EXCEEDED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RECORD_LIMIT_EXCEEDED");
                                
                                    public static final java.lang.String _RECORD_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RECORD_NOT_FOUND");
                                
                                    public static final java.lang.String _OBJECT_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OBJECT_NOT_FOUND");
                                
                                    public static final java.lang.String _OBJECT_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OBJECT_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _OPERATION_NOT_SUPPORTED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OPERATION_NOT_SUPPORTED");
                                
                                    public static final java.lang.String _MULTIPLE_OBJECTS_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MULTIPLE_OBJECTS_FOUND");
                                
                                    public static final java.lang.String _DOCUMENT_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DOCUMENT_NOT_FOUND");
                                
                                    public static final java.lang.String _DOCUMENT_ALREADY_EXISTS =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DOCUMENT_ALREADY_EXISTS");
                                
                                    public static final java.lang.String _IMAGES_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IMAGES_NOT_FOUND");
                                
                                    public static final java.lang.String _UNEXPECTED_EXCEPTION =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UNEXPECTED_EXCEPTION");
                                
                                    public static final java.lang.String _UNRECOVERABLE_EXCEPTION =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UNRECOVERABLE_EXCEPTION");
                                
                                    public static final java.lang.String _INVALID_AUTHENTICATION_OPTION =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INVALID_AUTHENTICATION_OPTION");
                                
                                    public static final java.lang.String _AUTHENTICATION_FAILED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AUTHENTICATION_FAILED");
                                
                                    public static final java.lang.String _CLIENT_CERTIFICATE_EXPIRED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CLIENT_CERTIFICATE_EXPIRED");
                                
                                    public static final java.lang.String _CLIENT_CERTIFICATE_NOT_YET_VALID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CLIENT_CERTIFICATE_NOT_YET_VALID");
                                
                                    public static final java.lang.String _CLIENT_CERTIFICATE_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CLIENT_CERTIFICATE_NOT_FOUND");
                                
                                    public static final java.lang.String _SERVER_CERTIFICATE_EXPIRED =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SERVER_CERTIFICATE_EXPIRED");
                                
                                    public static final java.lang.String _SERVER_CERTIFICATE_NOT_YET_VALID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SERVER_CERTIFICATE_NOT_YET_VALID");
                                
                                    public static final java.lang.String _SERVER_CERTIFICATE_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SERVER_CERTIFICATE_NOT_FOUND");
                                
                                    public static final java.lang.String _CONNECT_JOB_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_JOB_NOT_FOUND");
                                
                                    public static final java.lang.String _CONNECT_JOB_ALREADY_RUNNING =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_JOB_ALREADY_RUNNING");
                                
                                    public static final java.lang.String _CONNECT_JOB_INACTIVE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_JOB_INACTIVE");
                                
                                    public static final java.lang.String _CONNECT_JOB_RUN_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_JOB_RUN_NOT_FOUND");
                                
                                    public static final java.lang.String _NO_CONNECT_JOBS_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NO_CONNECT_JOBS_FOUND");
                                
                                    public static final java.lang.String _CONNECT_JOB_RUN_LOG_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_JOB_RUN_LOG_NOT_FOUND");
                                
                                    public static final java.lang.String _CONNECT_DISABLED_FOR_USER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CONNECT_DISABLED_FOR_USER");
                                
                                    public static final java.lang.String _CANNOT_RUN_CONNECT_JOB =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CANNOT_RUN_CONNECT_JOB");
                                
                                    public static final java.lang.String _PROFILE_EXTENSION_NOT_FOUND =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PROFILE_EXTENSION_NOT_FOUND");
                                
                                public static final ExceptionCode API_DISABLED_FOR_USER =
                                    new ExceptionCode(_API_DISABLED_FOR_USER,true);
                            
                                public static final ExceptionCode INSUFFICIENT_ACCESS =
                                    new ExceptionCode(_INSUFFICIENT_ACCESS,true);
                            
                                public static final ExceptionCode INVALID_USER_NAME =
                                    new ExceptionCode(_INVALID_USER_NAME,true);
                            
                                public static final ExceptionCode INVALID_PASSWORD =
                                    new ExceptionCode(_INVALID_PASSWORD,true);
                            
                                public static final ExceptionCode INVALID_SESSION_ID =
                                    new ExceptionCode(_INVALID_SESSION_ID,true);
                            
                                public static final ExceptionCode INVALID_SOAP_HEADER =
                                    new ExceptionCode(_INVALID_SOAP_HEADER,true);
                            
                                public static final ExceptionCode INVALID_NUMBER =
                                    new ExceptionCode(_INVALID_NUMBER,true);
                            
                                public static final ExceptionCode INVALID_DATE =
                                    new ExceptionCode(_INVALID_DATE,true);
                            
                                public static final ExceptionCode INVALID_PARAMETER =
                                    new ExceptionCode(_INVALID_PARAMETER,true);
                            
                                public static final ExceptionCode INVALID_FIELD_NAME =
                                    new ExceptionCode(_INVALID_FIELD_NAME,true);
                            
                                public static final ExceptionCode INVALID_OBJECT =
                                    new ExceptionCode(_INVALID_OBJECT,true);
                            
                                public static final ExceptionCode PASSWORD_LOCKOUT =
                                    new ExceptionCode(_PASSWORD_LOCKOUT,true);
                            
                                public static final ExceptionCode PASSWORD_EXPIRED =
                                    new ExceptionCode(_PASSWORD_EXPIRED,true);
                            
                                public static final ExceptionCode REQUEST_LIMIT_EXCEEDED =
                                    new ExceptionCode(_REQUEST_LIMIT_EXCEEDED,true);
                            
                                public static final ExceptionCode CAMPAIGN_NOT_FOUND =
                                    new ExceptionCode(_CAMPAIGN_NOT_FOUND,true);
                            
                                public static final ExceptionCode CAMPAIGN_ALREADY_EXISTS =
                                    new ExceptionCode(_CAMPAIGN_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode RECIPIENT_LIMIT_EXCEEDED =
                                    new ExceptionCode(_RECIPIENT_LIMIT_EXCEEDED,true);
                            
                                public static final ExceptionCode MAX_ATTACHMENT_SIZE_EXCEEDED =
                                    new ExceptionCode(_MAX_ATTACHMENT_SIZE_EXCEEDED,true);
                            
                                public static final ExceptionCode PROOF_LIST_NOT_FOUND =
                                    new ExceptionCode(_PROOF_LIST_NOT_FOUND,true);
                            
                                public static final ExceptionCode CAMPAIGN_LAUNCH_IN_PROGRESS =
                                    new ExceptionCode(_CAMPAIGN_LAUNCH_IN_PROGRESS,true);
                            
                                public static final ExceptionCode CAMPAIGN_NOT_LISTENING =
                                    new ExceptionCode(_CAMPAIGN_NOT_LISTENING,true);
                            
                                public static final ExceptionCode CAMPAIGN_LAUNCH_NOT_SCHEDULED =
                                    new ExceptionCode(_CAMPAIGN_LAUNCH_NOT_SCHEDULED,true);
                            
                                public static final ExceptionCode CAMPAIGN_LAUNCH_NOT_UNSCHEDULED =
                                    new ExceptionCode(_CAMPAIGN_LAUNCH_NOT_UNSCHEDULED,true);
                            
                                public static final ExceptionCode CAMPAIGN_NOT_APPROVED_FOR_LAUNCH =
                                    new ExceptionCode(_CAMPAIGN_NOT_APPROVED_FOR_LAUNCH,true);
                            
                                public static final ExceptionCode SCHEDULED_LAUNCH_NOT_FOUND =
                                    new ExceptionCode(_SCHEDULED_LAUNCH_NOT_FOUND,true);
                            
                                public static final ExceptionCode CAMPAIGN_IS_INVALID =
                                    new ExceptionCode(_CAMPAIGN_IS_INVALID,true);
                            
                                public static final ExceptionCode MOBILE_CAMPAIGN_DISABLED_FOR_USER =
                                    new ExceptionCode(_MOBILE_CAMPAIGN_DISABLED_FOR_USER,true);
                            
                                public static final ExceptionCode FOLDER_NOT_FOUND =
                                    new ExceptionCode(_FOLDER_NOT_FOUND,true);
                            
                                public static final ExceptionCode FOLDER_ALREADY_EXISTS =
                                    new ExceptionCode(_FOLDER_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode NO_OPEN_LAUNCHES_FOR_THIS_ACCOUNT =
                                    new ExceptionCode(_NO_OPEN_LAUNCHES_FOR_THIS_ACCOUNT,true);
                            
                                public static final ExceptionCode NO_LAUNCHES_FOR_THIS_CAMPAIGN =
                                    new ExceptionCode(_NO_LAUNCHES_FOR_THIS_CAMPAIGN,true);
                            
                                public static final ExceptionCode NO_CAMPAIGNS_IN_THIS_FOLDER =
                                    new ExceptionCode(_NO_CAMPAIGNS_IN_THIS_FOLDER,true);
                            
                                public static final ExceptionCode NO_OBJECTS_IN_THIS_FOLDER =
                                    new ExceptionCode(_NO_OBJECTS_IN_THIS_FOLDER,true);
                            
                                public static final ExceptionCode LIST_NOT_FOUND =
                                    new ExceptionCode(_LIST_NOT_FOUND,true);
                            
                                public static final ExceptionCode LIST_ALREADY_EXISTS =
                                    new ExceptionCode(_LIST_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode LINK_TABLE_NOT_FOUND =
                                    new ExceptionCode(_LINK_TABLE_NOT_FOUND,true);
                            
                                public static final ExceptionCode LINK_TABLE_ALREADY_EXISTS =
                                    new ExceptionCode(_LINK_TABLE_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode TABLE_ALREADY_EXISTS =
                                    new ExceptionCode(_TABLE_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode TABLE_NOT_FOUND =
                                    new ExceptionCode(_TABLE_NOT_FOUND,true);
                            
                                public static final ExceptionCode CUSTOM_EVENT_NOT_FOUND =
                                    new ExceptionCode(_CUSTOM_EVENT_NOT_FOUND,true);
                            
                                public static final ExceptionCode RECORD_LIMIT_EXCEEDED =
                                    new ExceptionCode(_RECORD_LIMIT_EXCEEDED,true);
                            
                                public static final ExceptionCode RECORD_NOT_FOUND =
                                    new ExceptionCode(_RECORD_NOT_FOUND,true);
                            
                                public static final ExceptionCode OBJECT_NOT_FOUND =
                                    new ExceptionCode(_OBJECT_NOT_FOUND,true);
                            
                                public static final ExceptionCode OBJECT_ALREADY_EXISTS =
                                    new ExceptionCode(_OBJECT_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode OPERATION_NOT_SUPPORTED =
                                    new ExceptionCode(_OPERATION_NOT_SUPPORTED,true);
                            
                                public static final ExceptionCode MULTIPLE_OBJECTS_FOUND =
                                    new ExceptionCode(_MULTIPLE_OBJECTS_FOUND,true);
                            
                                public static final ExceptionCode DOCUMENT_NOT_FOUND =
                                    new ExceptionCode(_DOCUMENT_NOT_FOUND,true);
                            
                                public static final ExceptionCode DOCUMENT_ALREADY_EXISTS =
                                    new ExceptionCode(_DOCUMENT_ALREADY_EXISTS,true);
                            
                                public static final ExceptionCode IMAGES_NOT_FOUND =
                                    new ExceptionCode(_IMAGES_NOT_FOUND,true);
                            
                                public static final ExceptionCode UNEXPECTED_EXCEPTION =
                                    new ExceptionCode(_UNEXPECTED_EXCEPTION,true);
                            
                                public static final ExceptionCode UNRECOVERABLE_EXCEPTION =
                                    new ExceptionCode(_UNRECOVERABLE_EXCEPTION,true);
                            
                                public static final ExceptionCode INVALID_AUTHENTICATION_OPTION =
                                    new ExceptionCode(_INVALID_AUTHENTICATION_OPTION,true);
                            
                                public static final ExceptionCode AUTHENTICATION_FAILED =
                                    new ExceptionCode(_AUTHENTICATION_FAILED,true);
                            
                                public static final ExceptionCode CLIENT_CERTIFICATE_EXPIRED =
                                    new ExceptionCode(_CLIENT_CERTIFICATE_EXPIRED,true);
                            
                                public static final ExceptionCode CLIENT_CERTIFICATE_NOT_YET_VALID =
                                    new ExceptionCode(_CLIENT_CERTIFICATE_NOT_YET_VALID,true);
                            
                                public static final ExceptionCode CLIENT_CERTIFICATE_NOT_FOUND =
                                    new ExceptionCode(_CLIENT_CERTIFICATE_NOT_FOUND,true);
                            
                                public static final ExceptionCode SERVER_CERTIFICATE_EXPIRED =
                                    new ExceptionCode(_SERVER_CERTIFICATE_EXPIRED,true);
                            
                                public static final ExceptionCode SERVER_CERTIFICATE_NOT_YET_VALID =
                                    new ExceptionCode(_SERVER_CERTIFICATE_NOT_YET_VALID,true);
                            
                                public static final ExceptionCode SERVER_CERTIFICATE_NOT_FOUND =
                                    new ExceptionCode(_SERVER_CERTIFICATE_NOT_FOUND,true);
                            
                                public static final ExceptionCode CONNECT_JOB_NOT_FOUND =
                                    new ExceptionCode(_CONNECT_JOB_NOT_FOUND,true);
                            
                                public static final ExceptionCode CONNECT_JOB_ALREADY_RUNNING =
                                    new ExceptionCode(_CONNECT_JOB_ALREADY_RUNNING,true);
                            
                                public static final ExceptionCode CONNECT_JOB_INACTIVE =
                                    new ExceptionCode(_CONNECT_JOB_INACTIVE,true);
                            
                                public static final ExceptionCode CONNECT_JOB_RUN_NOT_FOUND =
                                    new ExceptionCode(_CONNECT_JOB_RUN_NOT_FOUND,true);
                            
                                public static final ExceptionCode NO_CONNECT_JOBS_FOUND =
                                    new ExceptionCode(_NO_CONNECT_JOBS_FOUND,true);
                            
                                public static final ExceptionCode CONNECT_JOB_RUN_LOG_NOT_FOUND =
                                    new ExceptionCode(_CONNECT_JOB_RUN_LOG_NOT_FOUND,true);
                            
                                public static final ExceptionCode CONNECT_DISABLED_FOR_USER =
                                    new ExceptionCode(_CONNECT_DISABLED_FOR_USER,true);
                            
                                public static final ExceptionCode CANNOT_RUN_CONNECT_JOB =
                                    new ExceptionCode(_CANNOT_RUN_CONNECT_JOB,true);
                            
                                public static final ExceptionCode PROFILE_EXTENSION_NOT_FOUND =
                                    new ExceptionCode(_PROFILE_EXTENSION_NOT_FOUND,true);
                            

                                public java.lang.String getValue() { return localExceptionCode;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localExceptionCode.toString();
                                    

                                }

                        

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String _localName = parentQName.getLocalPart();
                        
                            writeStartElement(null, namespace, _localName, xmlWriter);

                            // add the type details if this is used in a simple type
                               if (serializeType){
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:fault.ws.rsys.com");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":ExceptionCode",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "ExceptionCode",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localExceptionCode==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("ExceptionCode cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localExceptionCode);
                                            
                                         }
                                    
                            xmlWriter.writeEndElement();
                    

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:fault.ws.rsys.com")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExceptionCode)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static ExceptionCode fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    ExceptionCode enumeration = (ExceptionCode)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static ExceptionCode fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static ExceptionCode fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return ExceptionCode.Factory.fromString(content,namespaceUri);
                    } else {
                       return ExceptionCode.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ExceptionCode parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ExceptionCode object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();
            

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ExceptionCode" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = ExceptionCode.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = ExceptionCode.Factory.fromString(content,"");
                                        }
                                        
                                        
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    