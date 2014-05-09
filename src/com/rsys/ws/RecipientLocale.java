
/**
 * RecipientLocale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rsys.ws;
            

            /**
            *  RecipientLocale bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class RecipientLocale
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "urn:ws.rsys.com",
                "RecipientLocale",
                "ns2");

            

                        /**
                        * field for RecipientLocale
                        */

                        
                                    protected java.lang.String localRecipientLocale ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected RecipientLocale(java.lang.String value, boolean isRegisterValue) {
                                    localRecipientLocale = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localRecipientLocale, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _en =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("en");
                                
                                    public static final java.lang.String _en_US_ASCII =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("en_US_ASCII");
                                
                                    public static final java.lang.String _nl =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("nl");
                                
                                    public static final java.lang.String _fr =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("fr");
                                
                                    public static final java.lang.String _de =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("de");
                                
                                    public static final java.lang.String _it =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("it");
                                
                                    public static final java.lang.String _pt =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("pt");
                                
                                    public static final java.lang.String _es =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("es");
                                
                                    public static final java.lang.String _et =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("et");
                                
                                    public static final java.lang.String _lv =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("lv");
                                
                                    public static final java.lang.String _lt =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("lt");
                                
                                    public static final java.lang.String _sq =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("sq");
                                
                                    public static final java.lang.String _hr =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("hr");
                                
                                    public static final java.lang.String _cs =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("cs");
                                
                                    public static final java.lang.String _hu =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("hu");
                                
                                    public static final java.lang.String _pl =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("pl");
                                
                                    public static final java.lang.String _ro =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ro");
                                
                                    public static final java.lang.String _sk =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("sk");
                                
                                    public static final java.lang.String _sl =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("sl");
                                
                                    public static final java.lang.String _zh =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("zh");
                                
                                    public static final java.lang.String _zh_TW =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("zh_TW");
                                
                                    public static final java.lang.String _el =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("el");
                                
                                    public static final java.lang.String _ja =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ja");
                                
                                    public static final java.lang.String _ko =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ko");
                                
                                    public static final java.lang.String _ru =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ru");
                                
                                    public static final java.lang.String _ru__cp1251 =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ru__cp1251");
                                
                                    public static final java.lang.String _tr =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("tr");
                                
                                    public static final java.lang.String _da =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("da");
                                
                                    public static final java.lang.String _fi =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("fi");
                                
                                    public static final java.lang.String _is =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("is");
                                
                                    public static final java.lang.String _sv =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("sv");
                                
                                public static final RecipientLocale en =
                                    new RecipientLocale(_en,true);
                            
                                public static final RecipientLocale en_US_ASCII =
                                    new RecipientLocale(_en_US_ASCII,true);
                            
                                public static final RecipientLocale nl =
                                    new RecipientLocale(_nl,true);
                            
                                public static final RecipientLocale fr =
                                    new RecipientLocale(_fr,true);
                            
                                public static final RecipientLocale de =
                                    new RecipientLocale(_de,true);
                            
                                public static final RecipientLocale it =
                                    new RecipientLocale(_it,true);
                            
                                public static final RecipientLocale pt =
                                    new RecipientLocale(_pt,true);
                            
                                public static final RecipientLocale es =
                                    new RecipientLocale(_es,true);
                            
                                public static final RecipientLocale et =
                                    new RecipientLocale(_et,true);
                            
                                public static final RecipientLocale lv =
                                    new RecipientLocale(_lv,true);
                            
                                public static final RecipientLocale lt =
                                    new RecipientLocale(_lt,true);
                            
                                public static final RecipientLocale sq =
                                    new RecipientLocale(_sq,true);
                            
                                public static final RecipientLocale hr =
                                    new RecipientLocale(_hr,true);
                            
                                public static final RecipientLocale cs =
                                    new RecipientLocale(_cs,true);
                            
                                public static final RecipientLocale hu =
                                    new RecipientLocale(_hu,true);
                            
                                public static final RecipientLocale pl =
                                    new RecipientLocale(_pl,true);
                            
                                public static final RecipientLocale ro =
                                    new RecipientLocale(_ro,true);
                            
                                public static final RecipientLocale sk =
                                    new RecipientLocale(_sk,true);
                            
                                public static final RecipientLocale sl =
                                    new RecipientLocale(_sl,true);
                            
                                public static final RecipientLocale zh =
                                    new RecipientLocale(_zh,true);
                            
                                public static final RecipientLocale zh_TW =
                                    new RecipientLocale(_zh_TW,true);
                            
                                public static final RecipientLocale el =
                                    new RecipientLocale(_el,true);
                            
                                public static final RecipientLocale ja =
                                    new RecipientLocale(_ja,true);
                            
                                public static final RecipientLocale ko =
                                    new RecipientLocale(_ko,true);
                            
                                public static final RecipientLocale ru =
                                    new RecipientLocale(_ru,true);
                            
                                public static final RecipientLocale ru__cp1251 =
                                    new RecipientLocale(_ru__cp1251,true);
                            
                                public static final RecipientLocale tr =
                                    new RecipientLocale(_tr,true);
                            
                                public static final RecipientLocale da =
                                    new RecipientLocale(_da,true);
                            
                                public static final RecipientLocale fi =
                                    new RecipientLocale(_fi,true);
                            
                                public static final RecipientLocale is =
                                    new RecipientLocale(_is,true);
                            
                                public static final RecipientLocale sv =
                                    new RecipientLocale(_sv,true);
                            

                                public java.lang.String getValue() { return localRecipientLocale;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localRecipientLocale.toString();
                                    

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
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:ws.rsys.com");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":RecipientLocale",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "RecipientLocale",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localRecipientLocale==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("RecipientLocale cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localRecipientLocale);
                                            
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


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecipientLocale)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static RecipientLocale fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    RecipientLocale enumeration = (RecipientLocale)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static RecipientLocale fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static RecipientLocale fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return RecipientLocale.Factory.fromString(content,namespaceUri);
                    } else {
                       return RecipientLocale.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static RecipientLocale parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RecipientLocale object = null;
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
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"RecipientLocale" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = RecipientLocale.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = RecipientLocale.Factory.fromString(content,"");
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
           
    