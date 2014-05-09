
/**
 * LaunchPreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rsys.ws;
            

            /**
            *  LaunchPreferences bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class LaunchPreferences
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = LaunchPreferences
                Namespace URI = urn:ws.rsys.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for EnableLimit
                        */

                        
                                    protected boolean localEnableLimit ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableLimit(){
                               return localEnableLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableLimit
                               */
                               public void setEnableLimit(boolean param){
                            
                                            this.localEnableLimit=param;
                                    

                               }
                            

                        /**
                        * field for RecipientLimit
                        */

                        
                                    protected long localRecipientLimit ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getRecipientLimit(){
                               return localRecipientLimit;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RecipientLimit
                               */
                               public void setRecipientLimit(long param){
                            
                                            this.localRecipientLimit=param;
                                    

                               }
                            

                        /**
                        * field for EnableNthSampling
                        */

                        
                                    protected boolean localEnableNthSampling ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableNthSampling(){
                               return localEnableNthSampling;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableNthSampling
                               */
                               public void setEnableNthSampling(boolean param){
                            
                                            this.localEnableNthSampling=param;
                                    

                               }
                            

                        /**
                        * field for SamplingNthSelection
                        */

                        
                                    protected int localSamplingNthSelection ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSamplingNthSelection(){
                               return localSamplingNthSelection;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SamplingNthSelection
                               */
                               public void setSamplingNthSelection(int param){
                            
                                            this.localSamplingNthSelection=param;
                                    

                               }
                            

                        /**
                        * field for SamplingNthInterval
                        */

                        
                                    protected int localSamplingNthInterval ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSamplingNthInterval(){
                               return localSamplingNthInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SamplingNthInterval
                               */
                               public void setSamplingNthInterval(int param){
                            
                                            this.localSamplingNthInterval=param;
                                    

                               }
                            

                        /**
                        * field for SamplingNthOffset
                        */

                        
                                    protected int localSamplingNthOffset ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSamplingNthOffset(){
                               return localSamplingNthOffset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SamplingNthOffset
                               */
                               public void setSamplingNthOffset(int param){
                            
                                            this.localSamplingNthOffset=param;
                                    

                               }
                            

                        /**
                        * field for EnableProgressAlerts
                        */

                        
                                    protected boolean localEnableProgressAlerts ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableProgressAlerts(){
                               return localEnableProgressAlerts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableProgressAlerts
                               */
                               public void setEnableProgressAlerts(boolean param){
                            
                                            this.localEnableProgressAlerts=param;
                                    

                               }
                            

                        /**
                        * field for ProgressEmailAddresses
                        */

                        
                                    protected java.lang.String localProgressEmailAddresses ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getProgressEmailAddresses(){
                               return localProgressEmailAddresses;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProgressEmailAddresses
                               */
                               public void setProgressEmailAddresses(java.lang.String param){
                            
                                            this.localProgressEmailAddresses=param;
                                    

                               }
                            

                        /**
                        * field for ProgressChunk
                        */

                        
                                    protected com.rsys.ws.ProgressChunk localProgressChunk ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.ProgressChunk
                           */
                           public  com.rsys.ws.ProgressChunk getProgressChunk(){
                               return localProgressChunk;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProgressChunk
                               */
                               public void setProgressChunk(com.rsys.ws.ProgressChunk param){
                            
                                            this.localProgressChunk=param;
                                    

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
                           namespacePrefix+":LaunchPreferences",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "LaunchPreferences",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "enableLimit", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "recipientLimit", xmlWriter);
                             
                                               if (localRecipientLimit==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientLimit));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "enableNthSampling", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableNthSampling));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "samplingNthSelection", xmlWriter);
                             
                                               if (localSamplingNthSelection==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthSelection));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "samplingNthInterval", xmlWriter);
                             
                                               if (localSamplingNthInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "samplingNthOffset", xmlWriter);
                             
                                               if (localSamplingNthOffset==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthOffset));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "enableProgressAlerts", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableProgressAlerts));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "progressEmailAddresses", xmlWriter);
                             

                                          if (localProgressEmailAddresses==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localProgressEmailAddresses);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localProgressChunk==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "progressChunk", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProgressChunk.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","progressChunk"),
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
                                                                      "enableLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableLimit));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "recipientLimit"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientLimit));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "enableNthSampling"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableNthSampling));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "samplingNthSelection"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthSelection));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "samplingNthInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthInterval));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "samplingNthOffset"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSamplingNthOffset));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "enableProgressAlerts"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableProgressAlerts));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "progressEmailAddresses"));
                                 
                                         elementList.add(localProgressEmailAddresses==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProgressEmailAddresses));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "progressChunk"));
                            
                            
                                    elementList.add(localProgressChunk==null?null:
                                    localProgressChunk);
                                

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
        public static LaunchPreferences parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            LaunchPreferences object =
                new LaunchPreferences();

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
                    
                            if (!"LaunchPreferences".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (LaunchPreferences)com.rsys.ws.fault.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","enableLimit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableLimit(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","recipientLimit").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRecipientLimit(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setRecipientLimit(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","enableNthSampling").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableNthSampling(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","samplingNthSelection").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSamplingNthSelection(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSamplingNthSelection(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","samplingNthInterval").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSamplingNthInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSamplingNthInterval(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","samplingNthOffset").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSamplingNthOffset(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSamplingNthOffset(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","enableProgressAlerts").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableProgressAlerts(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","progressEmailAddresses").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setProgressEmailAddresses(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","progressChunk").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProgressChunk(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProgressChunk(com.rsys.ws.ProgressChunk.Factory.parse(reader));
                                              
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
           
    