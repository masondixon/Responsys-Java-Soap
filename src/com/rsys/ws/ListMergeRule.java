
/**
 * ListMergeRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rsys.ws;
            

            /**
            *  ListMergeRule bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ListMergeRule
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ListMergeRule
                Namespace URI = urn:ws.rsys.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for InsertOnNoMatch
                        */

                        
                                    protected boolean localInsertOnNoMatch ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getInsertOnNoMatch(){
                               return localInsertOnNoMatch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InsertOnNoMatch
                               */
                               public void setInsertOnNoMatch(boolean param){
                            
                                            this.localInsertOnNoMatch=param;
                                    

                               }
                            

                        /**
                        * field for UpdateOnMatch
                        */

                        
                                    protected com.rsys.ws.UpdateOnMatch localUpdateOnMatch ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.UpdateOnMatch
                           */
                           public  com.rsys.ws.UpdateOnMatch getUpdateOnMatch(){
                               return localUpdateOnMatch;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateOnMatch
                               */
                               public void setUpdateOnMatch(com.rsys.ws.UpdateOnMatch param){
                            
                                            this.localUpdateOnMatch=param;
                                    

                               }
                            

                        /**
                        * field for MatchColumnName1
                        */

                        
                                    protected java.lang.String localMatchColumnName1 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMatchColumnName1(){
                               return localMatchColumnName1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchColumnName1
                               */
                               public void setMatchColumnName1(java.lang.String param){
                            
                                            this.localMatchColumnName1=param;
                                    

                               }
                            

                        /**
                        * field for MatchColumnName2
                        */

                        
                                    protected java.lang.String localMatchColumnName2 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMatchColumnName2(){
                               return localMatchColumnName2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchColumnName2
                               */
                               public void setMatchColumnName2(java.lang.String param){
                            
                                            this.localMatchColumnName2=param;
                                    

                               }
                            

                        /**
                        * field for MatchColumnName3
                        */

                        
                                    protected java.lang.String localMatchColumnName3 ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMatchColumnName3(){
                               return localMatchColumnName3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchColumnName3
                               */
                               public void setMatchColumnName3(java.lang.String param){
                            
                                            this.localMatchColumnName3=param;
                                    

                               }
                            

                        /**
                        * field for MatchOperator
                        */

                        
                                    protected com.rsys.ws.MatchOperator localMatchOperator ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.MatchOperator
                           */
                           public  com.rsys.ws.MatchOperator getMatchOperator(){
                               return localMatchOperator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MatchOperator
                               */
                               public void setMatchOperator(com.rsys.ws.MatchOperator param){
                            
                                            this.localMatchOperator=param;
                                    

                               }
                            

                        /**
                        * field for OptinValue
                        */

                        
                                    protected java.lang.String localOptinValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOptinValue(){
                               return localOptinValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OptinValue
                               */
                               public void setOptinValue(java.lang.String param){
                            
                                            this.localOptinValue=param;
                                    

                               }
                            

                        /**
                        * field for OptoutValue
                        */

                        
                                    protected java.lang.String localOptoutValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOptoutValue(){
                               return localOptoutValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OptoutValue
                               */
                               public void setOptoutValue(java.lang.String param){
                            
                                            this.localOptoutValue=param;
                                    

                               }
                            

                        /**
                        * field for HtmlValue
                        */

                        
                                    protected java.lang.String localHtmlValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getHtmlValue(){
                               return localHtmlValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HtmlValue
                               */
                               public void setHtmlValue(java.lang.String param){
                            
                                            this.localHtmlValue=param;
                                    

                               }
                            

                        /**
                        * field for TextValue
                        */

                        
                                    protected java.lang.String localTextValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTextValue(){
                               return localTextValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TextValue
                               */
                               public void setTextValue(java.lang.String param){
                            
                                            this.localTextValue=param;
                                    

                               }
                            

                        /**
                        * field for RejectRecordIfChannelEmpty
                        */

                        
                                    protected java.lang.String localRejectRecordIfChannelEmpty ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRejectRecordIfChannelEmpty(){
                               return localRejectRecordIfChannelEmpty;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RejectRecordIfChannelEmpty
                               */
                               public void setRejectRecordIfChannelEmpty(java.lang.String param){
                            
                                            this.localRejectRecordIfChannelEmpty=param;
                                    

                               }
                            

                        /**
                        * field for DefaultPermissionStatus
                        */

                        
                                    protected com.rsys.ws.PermissionStatus localDefaultPermissionStatus ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.PermissionStatus
                           */
                           public  com.rsys.ws.PermissionStatus getDefaultPermissionStatus(){
                               return localDefaultPermissionStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DefaultPermissionStatus
                               */
                               public void setDefaultPermissionStatus(com.rsys.ws.PermissionStatus param){
                            
                                            this.localDefaultPermissionStatus=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
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
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:ws.rsys.com");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ListMergeRule",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ListMergeRule",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "insertOnNoMatch", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertOnNoMatch));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localUpdateOnMatch==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "updateOnMatch", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUpdateOnMatch.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","updateOnMatch"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "matchColumnName1", xmlWriter);
                             

                                          if (localMatchColumnName1==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMatchColumnName1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "matchColumnName2", xmlWriter);
                             

                                          if (localMatchColumnName2==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMatchColumnName2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "matchColumnName3", xmlWriter);
                             

                                          if (localMatchColumnName3==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMatchColumnName3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localMatchOperator==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "matchOperator", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMatchOperator.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","matchOperator"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "optinValue", xmlWriter);
                             

                                          if (localOptinValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOptinValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "optoutValue", xmlWriter);
                             

                                          if (localOptoutValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOptoutValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "htmlValue", xmlWriter);
                             

                                          if (localHtmlValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localHtmlValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "textValue", xmlWriter);
                             

                                          if (localTextValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTextValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "rejectRecordIfChannelEmpty", xmlWriter);
                             

                                          if (localRejectRecordIfChannelEmpty==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRejectRecordIfChannelEmpty);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localDefaultPermissionStatus==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "defaultPermissionStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDefaultPermissionStatus.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","defaultPermissionStatus"),
                                        xmlWriter);
                                    }
                                
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:ws.rsys.com")){
                return "ns2";
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


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "insertOnNoMatch"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInsertOnNoMatch));
                            
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "updateOnMatch"));
                            
                            
                                    elementList.add(localUpdateOnMatch==null?null:
                                    localUpdateOnMatch);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "matchColumnName1"));
                                 
                                         elementList.add(localMatchColumnName1==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchColumnName1));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "matchColumnName2"));
                                 
                                         elementList.add(localMatchColumnName2==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchColumnName2));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "matchColumnName3"));
                                 
                                         elementList.add(localMatchColumnName3==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMatchColumnName3));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "matchOperator"));
                            
                            
                                    elementList.add(localMatchOperator==null?null:
                                    localMatchOperator);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "optinValue"));
                                 
                                         elementList.add(localOptinValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptinValue));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "optoutValue"));
                                 
                                         elementList.add(localOptoutValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOptoutValue));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "htmlValue"));
                                 
                                         elementList.add(localHtmlValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHtmlValue));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "textValue"));
                                 
                                         elementList.add(localTextValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTextValue));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "rejectRecordIfChannelEmpty"));
                                 
                                         elementList.add(localRejectRecordIfChannelEmpty==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRejectRecordIfChannelEmpty));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "defaultPermissionStatus"));
                            
                            
                                    elementList.add(localDefaultPermissionStatus==null?null:
                                    localDefaultPermissionStatus);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ListMergeRule parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ListMergeRule object =
                new ListMergeRule();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"ListMergeRule".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ListMergeRule)com.rsys.ws.fault.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","insertOnNoMatch").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInsertOnNoMatch(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","updateOnMatch").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUpdateOnMatch(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUpdateOnMatch(com.rsys.ws.UpdateOnMatch.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","matchColumnName1").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMatchColumnName1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","matchColumnName2").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMatchColumnName2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","matchColumnName3").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMatchColumnName3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","matchOperator").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMatchOperator(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMatchOperator(com.rsys.ws.MatchOperator.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","optinValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOptinValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","optoutValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOptoutValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","htmlValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setHtmlValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","textValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTextValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","rejectRecordIfChannelEmpty").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRejectRecordIfChannelEmpty(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","defaultPermissionStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDefaultPermissionStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDefaultPermissionStatus(com.rsys.ws.PermissionStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    