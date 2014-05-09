
/**
 * CampaignProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rsys.ws;
            

            /**
            *  CampaignProperties bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CampaignProperties
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CampaignProperties
                Namespace URI = urn:ws.rsys.com
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for Campaign
                        */

                        
                                    protected com.rsys.ws.InteractObject localCampaign ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getCampaign(){
                               return localCampaign;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Campaign
                               */
                               public void setCampaign(com.rsys.ws.InteractObject param){
                            
                                            this.localCampaign=param;
                                    

                               }
                            

                        /**
                        * field for CampaignId
                        */

                        
                                    protected long localCampaignId ;
                                

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getCampaignId(){
                               return localCampaignId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignId
                               */
                               public void setCampaignId(long param){
                            
                                            this.localCampaignId=param;
                                    

                               }
                            

                        /**
                        * field for CampaignType
                        */

                        
                                    protected com.rsys.ws.CampaignType localCampaignType ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.CampaignType
                           */
                           public  com.rsys.ws.CampaignType getCampaignType(){
                               return localCampaignType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignType
                               */
                               public void setCampaignType(com.rsys.ws.CampaignType param){
                            
                                            this.localCampaignType=param;
                                    

                               }
                            

                        /**
                        * field for Description
                        */

                        
                                    protected java.lang.String localDescription ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescription(){
                               return localDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Description
                               */
                               public void setDescription(java.lang.String param){
                            
                                            this.localDescription=param;
                                    

                               }
                            

                        /**
                        * field for MarketingProgram
                        */

                        
                                    protected java.lang.String localMarketingProgram ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMarketingProgram(){
                               return localMarketingProgram;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingProgram
                               */
                               public void setMarketingProgram(java.lang.String param){
                            
                                            this.localMarketingProgram=param;
                                    

                               }
                            

                        /**
                        * field for MarketingStrategy
                        */

                        
                                    protected java.lang.String localMarketingStrategy ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMarketingStrategy(){
                               return localMarketingStrategy;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingStrategy
                               */
                               public void setMarketingStrategy(java.lang.String param){
                            
                                            this.localMarketingStrategy=param;
                                    

                               }
                            

                        /**
                        * field for List
                        */

                        
                                    protected com.rsys.ws.InteractObject localList ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getList(){
                               return localList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param List
                               */
                               public void setList(com.rsys.ws.InteractObject param){
                            
                                            this.localList=param;
                                    

                               }
                            

                        /**
                        * field for RefiningFilters
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localRefiningFilters ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getRefiningFilters(){
                               return localRefiningFilters;
                           }

                           
                        


                               
                              /**
                               * validate the array for RefiningFilters
                               */
                              protected void validateRefiningFilters(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param RefiningFilters
                              */
                              public void setRefiningFilters(com.rsys.ws.InteractObject[] param){
                              
                                   validateRefiningFilters(param);

                               
                                      this.localRefiningFilters=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addRefiningFilters(com.rsys.ws.InteractObject param){
                                   if (localRefiningFilters == null){
                                   localRefiningFilters = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localRefiningFilters);
                               list.add(param);
                               this.localRefiningFilters =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for RefiningDataSource
                        */

                        
                                    protected com.rsys.ws.InteractObject localRefiningDataSource ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getRefiningDataSource(){
                               return localRefiningDataSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RefiningDataSource
                               */
                               public void setRefiningDataSource(com.rsys.ws.InteractObject param){
                            
                                            this.localRefiningDataSource=param;
                                    

                               }
                            

                        /**
                        * field for GovernanceFilter
                        */

                        
                                    protected com.rsys.ws.InteractObject localGovernanceFilter ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getGovernanceFilter(){
                               return localGovernanceFilter;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GovernanceFilter
                               */
                               public void setGovernanceFilter(com.rsys.ws.InteractObject param){
                            
                                            this.localGovernanceFilter=param;
                                    

                               }
                            

                        /**
                        * field for SupplementalCampaignDataSources
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localSupplementalCampaignDataSources ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getSupplementalCampaignDataSources(){
                               return localSupplementalCampaignDataSources;
                           }

                           
                        


                               
                              /**
                               * validate the array for SupplementalCampaignDataSources
                               */
                              protected void validateSupplementalCampaignDataSources(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param SupplementalCampaignDataSources
                              */
                              public void setSupplementalCampaignDataSources(com.rsys.ws.InteractObject[] param){
                              
                                   validateSupplementalCampaignDataSources(param);

                               
                                      this.localSupplementalCampaignDataSources=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addSupplementalCampaignDataSources(com.rsys.ws.InteractObject param){
                                   if (localSupplementalCampaignDataSources == null){
                                   localSupplementalCampaignDataSources = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSupplementalCampaignDataSources);
                               list.add(param);
                               this.localSupplementalCampaignDataSources =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for SuppressionLists
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localSuppressionLists ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getSuppressionLists(){
                               return localSuppressionLists;
                           }

                           
                        


                               
                              /**
                               * validate the array for SuppressionLists
                               */
                              protected void validateSuppressionLists(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param SuppressionLists
                              */
                              public void setSuppressionLists(com.rsys.ws.InteractObject[] param){
                              
                                   validateSuppressionLists(param);

                               
                                      this.localSuppressionLists=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addSuppressionLists(com.rsys.ws.InteractObject param){
                                   if (localSuppressionLists == null){
                                   localSuppressionLists = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSuppressionLists);
                               list.add(param);
                               this.localSuppressionLists =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for SupplementalProofDataSources
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localSupplementalProofDataSources ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getSupplementalProofDataSources(){
                               return localSupplementalProofDataSources;
                           }

                           
                        


                               
                              /**
                               * validate the array for SupplementalProofDataSources
                               */
                              protected void validateSupplementalProofDataSources(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param SupplementalProofDataSources
                              */
                              public void setSupplementalProofDataSources(com.rsys.ws.InteractObject[] param){
                              
                                   validateSupplementalProofDataSources(param);

                               
                                      this.localSupplementalProofDataSources=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addSupplementalProofDataSources(com.rsys.ws.InteractObject param){
                                   if (localSupplementalProofDataSources == null){
                                   localSupplementalProofDataSources = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSupplementalProofDataSources);
                               list.add(param);
                               this.localSupplementalProofDataSources =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for SupplementalSeedDataSources
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localSupplementalSeedDataSources ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getSupplementalSeedDataSources(){
                               return localSupplementalSeedDataSources;
                           }

                           
                        


                               
                              /**
                               * validate the array for SupplementalSeedDataSources
                               */
                              protected void validateSupplementalSeedDataSources(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param SupplementalSeedDataSources
                              */
                              public void setSupplementalSeedDataSources(com.rsys.ws.InteractObject[] param){
                              
                                   validateSupplementalSeedDataSources(param);

                               
                                      this.localSupplementalSeedDataSources=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addSupplementalSeedDataSources(com.rsys.ws.InteractObject param){
                                   if (localSupplementalSeedDataSources == null){
                                   localSupplementalSeedDataSources = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSupplementalSeedDataSources);
                               list.add(param);
                               this.localSupplementalSeedDataSources =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for ProofList
                        */

                        
                                    protected com.rsys.ws.InteractObject localProofList ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getProofList(){
                               return localProofList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProofList
                               */
                               public void setProofList(com.rsys.ws.InteractObject param){
                            
                                            this.localProofList=param;
                                    

                               }
                            

                        /**
                        * field for SeedList
                        */

                        
                                    protected com.rsys.ws.InteractObject localSeedList ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getSeedList(){
                               return localSeedList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SeedList
                               */
                               public void setSeedList(com.rsys.ws.InteractObject param){
                            
                                            this.localSeedList=param;
                                    

                               }
                            

                        /**
                        * field for Segmentation
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localSegmentation ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getSegmentation(){
                               return localSegmentation;
                           }

                           
                        


                               
                              /**
                               * validate the array for Segmentation
                               */
                              protected void validateSegmentation(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Segmentation
                              */
                              public void setSegmentation(com.rsys.ws.InteractObject[] param){
                              
                                   validateSegmentation(param);

                               
                                      this.localSegmentation=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addSegmentation(com.rsys.ws.InteractObject param){
                                   if (localSegmentation == null){
                                   localSegmentation = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSegmentation);
                               list.add(param);
                               this.localSegmentation =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for FromName
                        */

                        
                                    protected java.lang.String localFromName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFromName(){
                               return localFromName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromName
                               */
                               public void setFromName(java.lang.String param){
                            
                                            this.localFromName=param;
                                    

                               }
                            

                        /**
                        * field for FromEmail
                        */

                        
                                    protected java.lang.String localFromEmail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFromEmail(){
                               return localFromEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromEmail
                               */
                               public void setFromEmail(java.lang.String param){
                            
                                            this.localFromEmail=param;
                                    

                               }
                            

                        /**
                        * field for ReplyToEmail
                        */

                        
                                    protected java.lang.String localReplyToEmail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReplyToEmail(){
                               return localReplyToEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplyToEmail
                               */
                               public void setReplyToEmail(java.lang.String param){
                            
                                            this.localReplyToEmail=param;
                                    

                               }
                            

                        /**
                        * field for BccEmail
                        */

                        
                                    protected java.lang.String localBccEmail ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBccEmail(){
                               return localBccEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BccEmail
                               */
                               public void setBccEmail(java.lang.String param){
                            
                                            this.localBccEmail=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for HtmlMessage
                        */

                        
                                    protected com.rsys.ws.InteractObject localHtmlMessage ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getHtmlMessage(){
                               return localHtmlMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param HtmlMessage
                               */
                               public void setHtmlMessage(com.rsys.ws.InteractObject param){
                            
                                            this.localHtmlMessage=param;
                                    

                               }
                            

                        /**
                        * field for TextMessage
                        */

                        
                                    protected com.rsys.ws.InteractObject localTextMessage ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getTextMessage(){
                               return localTextMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TextMessage
                               */
                               public void setTextMessage(com.rsys.ws.InteractObject param){
                            
                                            this.localTextMessage=param;
                                    

                               }
                            

                        /**
                        * field for EnableLinkTracking
                        */

                        
                                    protected boolean localEnableLinkTracking ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableLinkTracking(){
                               return localEnableLinkTracking;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableLinkTracking
                               */
                               public void setEnableLinkTracking(boolean param){
                            
                                            this.localEnableLinkTracking=param;
                                    

                               }
                            

                        /**
                        * field for LinkTable
                        */

                        
                                    protected com.rsys.ws.InteractObject localLinkTable ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject
                           */
                           public  com.rsys.ws.InteractObject getLinkTable(){
                               return localLinkTable;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LinkTable
                               */
                               public void setLinkTable(com.rsys.ws.InteractObject param){
                            
                                            this.localLinkTable=param;
                                    

                               }
                            

                        /**
                        * field for EnableExternalTracking
                        */

                        
                                    protected boolean localEnableExternalTracking ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEnableExternalTracking(){
                               return localEnableExternalTracking;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnableExternalTracking
                               */
                               public void setEnableExternalTracking(boolean param){
                            
                                            this.localEnableExternalTracking=param;
                                    

                               }
                            

                        /**
                        * field for ExternalTrackingParams
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.OptionalData[] localExternalTrackingParams ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.OptionalData[]
                           */
                           public  com.rsys.ws.OptionalData[] getExternalTrackingParams(){
                               return localExternalTrackingParams;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExternalTrackingParams
                               */
                              protected void validateExternalTrackingParams(com.rsys.ws.OptionalData[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExternalTrackingParams
                              */
                              public void setExternalTrackingParams(com.rsys.ws.OptionalData[] param){
                              
                                   validateExternalTrackingParams(param);

                               
                                      this.localExternalTrackingParams=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.OptionalData
                             */
                             public void addExternalTrackingParams(com.rsys.ws.OptionalData param){
                                   if (localExternalTrackingParams == null){
                                   localExternalTrackingParams = new com.rsys.ws.OptionalData[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExternalTrackingParams);
                               list.add(param);
                               this.localExternalTrackingParams =
                             (com.rsys.ws.OptionalData[])list.toArray(
                            new com.rsys.ws.OptionalData[list.size()]);

                             }
                             

                        /**
                        * field for Attachments
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.InteractObject[] localAttachments ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.InteractObject[]
                           */
                           public  com.rsys.ws.InteractObject[] getAttachments(){
                               return localAttachments;
                           }

                           
                        


                               
                              /**
                               * validate the array for Attachments
                               */
                              protected void validateAttachments(com.rsys.ws.InteractObject[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param Attachments
                              */
                              public void setAttachments(com.rsys.ws.InteractObject[] param){
                              
                                   validateAttachments(param);

                               
                                      this.localAttachments=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.InteractObject
                             */
                             public void addAttachments(com.rsys.ws.InteractObject param){
                                   if (localAttachments == null){
                                   localAttachments = new com.rsys.ws.InteractObject[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAttachments);
                               list.add(param);
                               this.localAttachments =
                             (com.rsys.ws.InteractObject[])list.toArray(
                            new com.rsys.ws.InteractObject[list.size()]);

                             }
                             

                        /**
                        * field for CampaignVariables
                        * This was an Array!
                        */

                        
                                    protected com.rsys.ws.OptionalData[] localCampaignVariables ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.OptionalData[]
                           */
                           public  com.rsys.ws.OptionalData[] getCampaignVariables(){
                               return localCampaignVariables;
                           }

                           
                        


                               
                              /**
                               * validate the array for CampaignVariables
                               */
                              protected void validateCampaignVariables(com.rsys.ws.OptionalData[] param){
                             
                              if ((param != null) && (param.length < 1)){
                                throw new java.lang.RuntimeException();
                              }
                              
                              }


                             /**
                              * Auto generated setter method
                              * @param param CampaignVariables
                              */
                              public void setCampaignVariables(com.rsys.ws.OptionalData[] param){
                              
                                   validateCampaignVariables(param);

                               
                                      this.localCampaignVariables=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rsys.ws.OptionalData
                             */
                             public void addCampaignVariables(com.rsys.ws.OptionalData param){
                                   if (localCampaignVariables == null){
                                   localCampaignVariables = new com.rsys.ws.OptionalData[]{};
                                   }

                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCampaignVariables);
                               list.add(param);
                               this.localCampaignVariables =
                             (com.rsys.ws.OptionalData[])list.toArray(
                            new com.rsys.ws.OptionalData[list.size()]);

                             }
                             

                        /**
                        * field for CampaignPurpose
                        */

                        
                                    protected com.rsys.ws.CampaignPurpose localCampaignPurpose ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.CampaignPurpose
                           */
                           public  com.rsys.ws.CampaignPurpose getCampaignPurpose(){
                               return localCampaignPurpose;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CampaignPurpose
                               */
                               public void setCampaignPurpose(com.rsys.ws.CampaignPurpose param){
                            
                                            this.localCampaignPurpose=param;
                                    

                               }
                            

                        /**
                        * field for UseUTF8
                        */

                        
                                    protected boolean localUseUTF8 ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getUseUTF8(){
                               return localUseUTF8;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UseUTF8
                               */
                               public void setUseUTF8(boolean param){
                            
                                            this.localUseUTF8=param;
                                    

                               }
                            

                        /**
                        * field for Locale
                        */

                        
                                    protected com.rsys.ws.RecipientLocale localLocale ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.RecipientLocale
                           */
                           public  com.rsys.ws.RecipientLocale getLocale(){
                               return localLocale;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Locale
                               */
                               public void setLocale(com.rsys.ws.RecipientLocale param){
                            
                                            this.localLocale=param;
                                    

                               }
                            

                        /**
                        * field for TrackHtmlOpens
                        */

                        
                                    protected boolean localTrackHtmlOpens ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTrackHtmlOpens(){
                               return localTrackHtmlOpens;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TrackHtmlOpens
                               */
                               public void setTrackHtmlOpens(boolean param){
                            
                                            this.localTrackHtmlOpens=param;
                                    

                               }
                            

                        /**
                        * field for TrackConversions
                        */

                        
                                    protected boolean localTrackConversions ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getTrackConversions(){
                               return localTrackConversions;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TrackConversions
                               */
                               public void setTrackConversions(boolean param){
                            
                                            this.localTrackConversions=param;
                                    

                               }
                            

                        /**
                        * field for SendTextIfHTMLUnknown
                        */

                        
                                    protected boolean localSendTextIfHTMLUnknown ;
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSendTextIfHTMLUnknown(){
                               return localSendTextIfHTMLUnknown;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendTextIfHTMLUnknown
                               */
                               public void setSendTextIfHTMLUnknown(boolean param){
                            
                                            this.localSendTextIfHTMLUnknown=param;
                                    

                               }
                            

                        /**
                        * field for SegmentTrackingColumnName
                        */

                        
                                    protected java.lang.String localSegmentTrackingColumnName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSegmentTrackingColumnName(){
                               return localSegmentTrackingColumnName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SegmentTrackingColumnName
                               */
                               public void setSegmentTrackingColumnName(java.lang.String param){
                            
                                            this.localSegmentTrackingColumnName=param;
                                    

                               }
                            

                        /**
                        * field for UnsubscribeOption
                        */

                        
                                    protected com.rsys.ws.UnsubscribeOption localUnsubscribeOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.UnsubscribeOption
                           */
                           public  com.rsys.ws.UnsubscribeOption getUnsubscribeOption(){
                               return localUnsubscribeOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnsubscribeOption
                               */
                               public void setUnsubscribeOption(com.rsys.ws.UnsubscribeOption param){
                            
                                            this.localUnsubscribeOption=param;
                                    

                               }
                            

                        /**
                        * field for UnsubscribeForm
                        */

                        
                                    protected java.lang.String localUnsubscribeForm ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUnsubscribeForm(){
                               return localUnsubscribeForm;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UnsubscribeForm
                               */
                               public void setUnsubscribeForm(java.lang.String param){
                            
                                            this.localUnsubscribeForm=param;
                                    

                               }
                            

                        /**
                        * field for AutoCloseOption
                        */

                        
                                    protected com.rsys.ws.AutoCloseOption localAutoCloseOption ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.rsys.ws.AutoCloseOption
                           */
                           public  com.rsys.ws.AutoCloseOption getAutoCloseOption(){
                               return localAutoCloseOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoCloseOption
                               */
                               public void setAutoCloseOption(com.rsys.ws.AutoCloseOption param){
                            
                                            this.localAutoCloseOption=param;
                                    

                               }
                            

                        /**
                        * field for AutoCloseValue
                        */

                        
                                    protected java.lang.String localAutoCloseValue ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAutoCloseValue(){
                               return localAutoCloseValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AutoCloseValue
                               */
                               public void setAutoCloseValue(java.lang.String param){
                            
                                            this.localAutoCloseValue=param;
                                    

                               }
                            

                        /**
                        * field for ClosedCampaignURL
                        */

                        
                                    protected java.lang.String localClosedCampaignURL ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClosedCampaignURL(){
                               return localClosedCampaignURL;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClosedCampaignURL
                               */
                               public void setClosedCampaignURL(java.lang.String param){
                            
                                            this.localClosedCampaignURL=param;
                                    

                               }
                            

                        /**
                        * field for ExternalCampaignCode
                        */

                        
                                    protected java.lang.String localExternalCampaignCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExternalCampaignCode(){
                               return localExternalCampaignCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExternalCampaignCode
                               */
                               public void setExternalCampaignCode(java.lang.String param){
                            
                                            this.localExternalCampaignCode=param;
                                    

                               }
                            

                        /**
                        * field for SalesForceCampaignId
                        */

                        
                                    protected java.lang.String localSalesForceCampaignId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSalesForceCampaignId(){
                               return localSalesForceCampaignId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SalesForceCampaignId
                               */
                               public void setSalesForceCampaignId(java.lang.String param){
                            
                                            this.localSalesForceCampaignId=param;
                                    

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
                           namespacePrefix+":CampaignProperties",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CampaignProperties",
                           xmlWriter);
                   }

               
                   }
               
                                    if (localCampaign==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "campaign", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaign.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","campaign"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "campaignId", xmlWriter);
                             
                                               if (localCampaignId==java.lang.Long.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCampaignId));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localCampaignType==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "campaignType", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignType.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","campaignType"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "description", xmlWriter);
                             

                                          if (localDescription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "marketingProgram", xmlWriter);
                             

                                          if (localMarketingProgram==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMarketingProgram);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "marketingStrategy", xmlWriter);
                             

                                          if (localMarketingStrategy==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMarketingStrategy);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localList==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "list", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localList.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","list"),
                                        xmlWriter);
                                    }
                                
                                       if (localRefiningFilters!=null){
                                            for (int i = 0;i < localRefiningFilters.length;i++){
                                                if (localRefiningFilters[i] != null){
                                                 localRefiningFilters[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","refiningFilters"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "refiningFilters", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "refiningFilters", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                    if (localRefiningDataSource==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "refiningDataSource", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localRefiningDataSource.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","refiningDataSource"),
                                        xmlWriter);
                                    }
                                
                                    if (localGovernanceFilter==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "governanceFilter", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localGovernanceFilter.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","governanceFilter"),
                                        xmlWriter);
                                    }
                                
                                       if (localSupplementalCampaignDataSources!=null){
                                            for (int i = 0;i < localSupplementalCampaignDataSources.length;i++){
                                                if (localSupplementalCampaignDataSources[i] != null){
                                                 localSupplementalCampaignDataSources[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalCampaignDataSources"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "supplementalCampaignDataSources", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "supplementalCampaignDataSources", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                       if (localSuppressionLists!=null){
                                            for (int i = 0;i < localSuppressionLists.length;i++){
                                                if (localSuppressionLists[i] != null){
                                                 localSuppressionLists[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","suppressionLists"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "suppressionLists", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "suppressionLists", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                       if (localSupplementalProofDataSources!=null){
                                            for (int i = 0;i < localSupplementalProofDataSources.length;i++){
                                                if (localSupplementalProofDataSources[i] != null){
                                                 localSupplementalProofDataSources[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalProofDataSources"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "supplementalProofDataSources", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "supplementalProofDataSources", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                       if (localSupplementalSeedDataSources!=null){
                                            for (int i = 0;i < localSupplementalSeedDataSources.length;i++){
                                                if (localSupplementalSeedDataSources[i] != null){
                                                 localSupplementalSeedDataSources[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalSeedDataSources"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "supplementalSeedDataSources", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "supplementalSeedDataSources", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                    if (localProofList==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "proofList", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProofList.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","proofList"),
                                        xmlWriter);
                                    }
                                
                                    if (localSeedList==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "seedList", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSeedList.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","seedList"),
                                        xmlWriter);
                                    }
                                
                                       if (localSegmentation!=null){
                                            for (int i = 0;i < localSegmentation.length;i++){
                                                if (localSegmentation[i] != null){
                                                 localSegmentation[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","segmentation"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "segmentation", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "segmentation", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "fromName", xmlWriter);
                             

                                          if (localFromName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFromName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "fromEmail", xmlWriter);
                             

                                          if (localFromEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFromEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "replyToEmail", xmlWriter);
                             

                                          if (localReplyToEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReplyToEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "bccEmail", xmlWriter);
                             

                                          if (localBccEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBccEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "subject", xmlWriter);
                             

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localHtmlMessage==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "htmlMessage", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localHtmlMessage.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","htmlMessage"),
                                        xmlWriter);
                                    }
                                
                                    if (localTextMessage==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "textMessage", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTextMessage.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","textMessage"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "enableLinkTracking", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableLinkTracking));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localLinkTable==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "linkTable", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLinkTable.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","linkTable"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "enableExternalTracking", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableExternalTracking));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                       if (localExternalTrackingParams!=null){
                                            for (int i = 0;i < localExternalTrackingParams.length;i++){
                                                if (localExternalTrackingParams[i] != null){
                                                 localExternalTrackingParams[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","externalTrackingParams"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "externalTrackingParams", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "externalTrackingParams", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                       if (localAttachments!=null){
                                            for (int i = 0;i < localAttachments.length;i++){
                                                if (localAttachments[i] != null){
                                                 localAttachments[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","attachments"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "attachments", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "attachments", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                       if (localCampaignVariables!=null){
                                            for (int i = 0;i < localCampaignVariables.length;i++){
                                                if (localCampaignVariables[i] != null){
                                                 localCampaignVariables[i].serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","campaignVariables"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "urn:ws.rsys.com", "campaignVariables", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "urn:ws.rsys.com", "campaignVariables", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 
                                    if (localCampaignPurpose==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "campaignPurpose", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCampaignPurpose.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","campaignPurpose"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "useUTF8", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseUTF8));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localLocale==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "locale", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLocale.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","locale"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "trackHtmlOpens", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrackHtmlOpens));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "trackConversions", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrackConversions));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "sendTextIfHTMLUnknown", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendTextIfHTMLUnknown));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "segmentTrackingColumnName", xmlWriter);
                             

                                          if (localSegmentTrackingColumnName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSegmentTrackingColumnName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localUnsubscribeOption==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "unsubscribeOption", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUnsubscribeOption.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","unsubscribeOption"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "unsubscribeForm", xmlWriter);
                             

                                          if (localUnsubscribeForm==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUnsubscribeForm);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    if (localAutoCloseOption==null){

                                        writeStartElement(null, "urn:ws.rsys.com", "autoCloseOption", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAutoCloseOption.serialize(new javax.xml.namespace.QName("urn:ws.rsys.com","autoCloseOption"),
                                        xmlWriter);
                                    }
                                
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "autoCloseValue", xmlWriter);
                             

                                          if (localAutoCloseValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAutoCloseValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "closedCampaignURL", xmlWriter);
                             

                                          if (localClosedCampaignURL==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClosedCampaignURL);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "externalCampaignCode", xmlWriter);
                             

                                          if (localExternalCampaignCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExternalCampaignCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "urn:ws.rsys.com";
                                    writeStartElement(null, namespace, "salesForceCampaignId", xmlWriter);
                             

                                          if (localSalesForceCampaignId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSalesForceCampaignId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
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
                                                                      "campaign"));
                            
                            
                                    elementList.add(localCampaign==null?null:
                                    localCampaign);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "campaignId"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCampaignId));
                            
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "campaignType"));
                            
                            
                                    elementList.add(localCampaignType==null?null:
                                    localCampaignType);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "description"));
                                 
                                         elementList.add(localDescription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescription));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "marketingProgram"));
                                 
                                         elementList.add(localMarketingProgram==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingProgram));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "marketingStrategy"));
                                 
                                         elementList.add(localMarketingStrategy==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingStrategy));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "list"));
                            
                            
                                    elementList.add(localList==null?null:
                                    localList);
                                
                             if (localRefiningFilters!=null) {
                                 for (int i = 0;i < localRefiningFilters.length;i++){

                                    if (localRefiningFilters[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "refiningFilters"));
                                         elementList.add(localRefiningFilters[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "refiningFilters"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "refiningFilters"));
                                        elementList.add(localRefiningFilters);
                                    
                             }

                        
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "refiningDataSource"));
                            
                            
                                    elementList.add(localRefiningDataSource==null?null:
                                    localRefiningDataSource);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "governanceFilter"));
                            
                            
                                    elementList.add(localGovernanceFilter==null?null:
                                    localGovernanceFilter);
                                
                             if (localSupplementalCampaignDataSources!=null) {
                                 for (int i = 0;i < localSupplementalCampaignDataSources.length;i++){

                                    if (localSupplementalCampaignDataSources[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalCampaignDataSources"));
                                         elementList.add(localSupplementalCampaignDataSources[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalCampaignDataSources"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalCampaignDataSources"));
                                        elementList.add(localSupplementalCampaignDataSources);
                                    
                             }

                        
                             if (localSuppressionLists!=null) {
                                 for (int i = 0;i < localSuppressionLists.length;i++){

                                    if (localSuppressionLists[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "suppressionLists"));
                                         elementList.add(localSuppressionLists[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "suppressionLists"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "suppressionLists"));
                                        elementList.add(localSuppressionLists);
                                    
                             }

                        
                             if (localSupplementalProofDataSources!=null) {
                                 for (int i = 0;i < localSupplementalProofDataSources.length;i++){

                                    if (localSupplementalProofDataSources[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalProofDataSources"));
                                         elementList.add(localSupplementalProofDataSources[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalProofDataSources"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalProofDataSources"));
                                        elementList.add(localSupplementalProofDataSources);
                                    
                             }

                        
                             if (localSupplementalSeedDataSources!=null) {
                                 for (int i = 0;i < localSupplementalSeedDataSources.length;i++){

                                    if (localSupplementalSeedDataSources[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalSeedDataSources"));
                                         elementList.add(localSupplementalSeedDataSources[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalSeedDataSources"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "supplementalSeedDataSources"));
                                        elementList.add(localSupplementalSeedDataSources);
                                    
                             }

                        
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "proofList"));
                            
                            
                                    elementList.add(localProofList==null?null:
                                    localProofList);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "seedList"));
                            
                            
                                    elementList.add(localSeedList==null?null:
                                    localSeedList);
                                
                             if (localSegmentation!=null) {
                                 for (int i = 0;i < localSegmentation.length;i++){

                                    if (localSegmentation[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "segmentation"));
                                         elementList.add(localSegmentation[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "segmentation"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "segmentation"));
                                        elementList.add(localSegmentation);
                                    
                             }

                        
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "fromName"));
                                 
                                         elementList.add(localFromName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromName));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "fromEmail"));
                                 
                                         elementList.add(localFromEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromEmail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "replyToEmail"));
                                 
                                         elementList.add(localReplyToEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyToEmail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "bccEmail"));
                                 
                                         elementList.add(localBccEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBccEmail));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "subject"));
                                 
                                         elementList.add(localSubject==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "htmlMessage"));
                            
                            
                                    elementList.add(localHtmlMessage==null?null:
                                    localHtmlMessage);
                                
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "textMessage"));
                            
                            
                                    elementList.add(localTextMessage==null?null:
                                    localTextMessage);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "enableLinkTracking"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableLinkTracking));
                            
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "linkTable"));
                            
                            
                                    elementList.add(localLinkTable==null?null:
                                    localLinkTable);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "enableExternalTracking"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableExternalTracking));
                            
                             if (localExternalTrackingParams!=null) {
                                 for (int i = 0;i < localExternalTrackingParams.length;i++){

                                    if (localExternalTrackingParams[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "externalTrackingParams"));
                                         elementList.add(localExternalTrackingParams[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "externalTrackingParams"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "externalTrackingParams"));
                                        elementList.add(localExternalTrackingParams);
                                    
                             }

                        
                             if (localAttachments!=null) {
                                 for (int i = 0;i < localAttachments.length;i++){

                                    if (localAttachments[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "attachments"));
                                         elementList.add(localAttachments[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "attachments"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "attachments"));
                                        elementList.add(localAttachments);
                                    
                             }

                        
                             if (localCampaignVariables!=null) {
                                 for (int i = 0;i < localCampaignVariables.length;i++){

                                    if (localCampaignVariables[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "campaignVariables"));
                                         elementList.add(localCampaignVariables[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "campaignVariables"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                          "campaignVariables"));
                                        elementList.add(localCampaignVariables);
                                    
                             }

                        
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "campaignPurpose"));
                            
                            
                                    elementList.add(localCampaignPurpose==null?null:
                                    localCampaignPurpose);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "useUTF8"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUseUTF8));
                            
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "locale"));
                            
                            
                                    elementList.add(localLocale==null?null:
                                    localLocale);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "trackHtmlOpens"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrackHtmlOpens));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "trackConversions"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrackConversions));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "sendTextIfHTMLUnknown"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSendTextIfHTMLUnknown));
                            
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "segmentTrackingColumnName"));
                                 
                                         elementList.add(localSegmentTrackingColumnName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSegmentTrackingColumnName));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "unsubscribeOption"));
                            
                            
                                    elementList.add(localUnsubscribeOption==null?null:
                                    localUnsubscribeOption);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "unsubscribeForm"));
                                 
                                         elementList.add(localUnsubscribeForm==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUnsubscribeForm));
                                    
                            elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "autoCloseOption"));
                            
                            
                                    elementList.add(localAutoCloseOption==null?null:
                                    localAutoCloseOption);
                                
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "autoCloseValue"));
                                 
                                         elementList.add(localAutoCloseValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutoCloseValue));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "closedCampaignURL"));
                                 
                                         elementList.add(localClosedCampaignURL==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedCampaignURL));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "externalCampaignCode"));
                                 
                                         elementList.add(localExternalCampaignCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExternalCampaignCode));
                                    
                                      elementList.add(new javax.xml.namespace.QName("urn:ws.rsys.com",
                                                                      "salesForceCampaignId"));
                                 
                                         elementList.add(localSalesForceCampaignId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSalesForceCampaignId));
                                    

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
        public static CampaignProperties parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CampaignProperties object =
                new CampaignProperties();

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
                    
                            if (!"CampaignProperties".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CampaignProperties)com.rsys.ws.fault.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list12 = new java.util.ArrayList();
                    
                        java.util.ArrayList list13 = new java.util.ArrayList();
                    
                        java.util.ArrayList list14 = new java.util.ArrayList();
                    
                        java.util.ArrayList list17 = new java.util.ArrayList();
                    
                        java.util.ArrayList list28 = new java.util.ArrayList();
                    
                        java.util.ArrayList list29 = new java.util.ArrayList();
                    
                        java.util.ArrayList list30 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","campaign").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaign(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaign(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","campaignId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCampaignId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setCampaignId(java.lang.Long.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","campaignType").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignType(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignType(com.rsys.ws.CampaignType.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","description").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescription(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","marketingProgram").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMarketingProgram(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","marketingStrategy").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMarketingStrategy(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","list").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setList(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setList(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","refiningFilters").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","refiningFilters").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setRefiningFilters((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","refiningDataSource").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setRefiningDataSource(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setRefiningDataSource(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","governanceFilter").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setGovernanceFilter(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setGovernanceFilter(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalCampaignDataSources").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list11.add(null);
                                                              reader.next();
                                                          } else {
                                                        list11.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalCampaignDataSources").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list11.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list11.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSupplementalCampaignDataSources((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","suppressionLists").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list12.add(null);
                                                              reader.next();
                                                          } else {
                                                        list12.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone12 = false;
                                                        while(!loopDone12){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone12 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","suppressionLists").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list12.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list12.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone12 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSuppressionLists((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list12));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalProofDataSources").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list13.add(null);
                                                              reader.next();
                                                          } else {
                                                        list13.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone13 = false;
                                                        while(!loopDone13){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone13 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalProofDataSources").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list13.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list13.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone13 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSupplementalProofDataSources((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list13));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalSeedDataSources").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list14.add(null);
                                                              reader.next();
                                                          } else {
                                                        list14.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone14 = false;
                                                        while(!loopDone14){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone14 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","supplementalSeedDataSources").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list14.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list14.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone14 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSupplementalSeedDataSources((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list14));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","proofList").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProofList(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProofList(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","seedList").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSeedList(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSeedList(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","segmentation").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list17.add(null);
                                                              reader.next();
                                                          } else {
                                                        list17.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone17 = false;
                                                        while(!loopDone17){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone17 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","segmentation").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list17.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list17.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone17 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSegmentation((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list17));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","fromName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFromName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","fromEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFromEmail(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","replyToEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplyToEmail(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","bccEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBccEmail(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","subject").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","htmlMessage").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setHtmlMessage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setHtmlMessage(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","textMessage").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTextMessage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTextMessage(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","enableLinkTracking").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableLinkTracking(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","linkTable").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLinkTable(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLinkTable(com.rsys.ws.InteractObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","enableExternalTracking").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnableExternalTracking(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","externalTrackingParams").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list28.add(null);
                                                              reader.next();
                                                          } else {
                                                        list28.add(com.rsys.ws.OptionalData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone28 = false;
                                                        while(!loopDone28){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone28 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","externalTrackingParams").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list28.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list28.add(com.rsys.ws.OptionalData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone28 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setExternalTrackingParams((com.rsys.ws.OptionalData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.OptionalData.class,
                                                                list28));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","attachments").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list29.add(null);
                                                              reader.next();
                                                          } else {
                                                        list29.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone29 = false;
                                                        while(!loopDone29){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone29 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","attachments").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list29.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list29.add(com.rsys.ws.InteractObject.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone29 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAttachments((com.rsys.ws.InteractObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.InteractObject.class,
                                                                list29));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","campaignVariables").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list30.add(null);
                                                              reader.next();
                                                          } else {
                                                        list30.add(com.rsys.ws.OptionalData.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone30 = false;
                                                        while(!loopDone30){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone30 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:ws.rsys.com","campaignVariables").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list30.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list30.add(com.rsys.ws.OptionalData.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone30 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCampaignVariables((com.rsys.ws.OptionalData[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rsys.ws.OptionalData.class,
                                                                list30));
                                                            
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","campaignPurpose").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCampaignPurpose(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCampaignPurpose(com.rsys.ws.CampaignPurpose.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","useUTF8").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUseUTF8(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","locale").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLocale(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLocale(com.rsys.ws.RecipientLocale.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","trackHtmlOpens").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTrackHtmlOpens(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","trackConversions").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTrackConversions(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","sendTextIfHTMLUnknown").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSendTextIfHTMLUnknown(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","segmentTrackingColumnName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSegmentTrackingColumnName(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","unsubscribeOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUnsubscribeOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUnsubscribeOption(com.rsys.ws.UnsubscribeOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","unsubscribeForm").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUnsubscribeForm(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","autoCloseOption").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAutoCloseOption(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAutoCloseOption(com.rsys.ws.AutoCloseOption.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","autoCloseValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAutoCloseValue(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","closedCampaignURL").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClosedCampaignURL(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","externalCampaignCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExternalCampaignCode(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:ws.rsys.com","salesForceCampaignId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSalesForceCampaignId(
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
           
    