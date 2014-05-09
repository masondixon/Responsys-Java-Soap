

/**
 * ResponsysWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.rsys.ws.client;

    /*
     *  ResponsysWSService java interface
     */

    public interface ResponsysWSService {
          

        /**
          * Auto generated method signature
          * Get timestamp of the server.
                    * @param getServerTimestamp
                
                    * @param sessionHeader
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetServerTimestampResponse getServerTimestamp(

                        com.rsys.ws.GetServerTimestamp getServerTimestamp,com.rsys.ws.SessionHeader sessionHeader)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get the Status of a Connect Job Run.
                    * @param getJobRunStatus
                
                    * @param sessionHeader0
                
             * @throws com.rsys.ws.client.ConnectFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetJobRunStatusResponse getJobRunStatus(

                        com.rsys.ws.GetJobRunStatus getJobRunStatus,com.rsys.ws.SessionHeader sessionHeader0)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ConnectFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * List the contents of a folder.
                    * @param listFolderObjects
                
                    * @param sessionHeader1
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.ListFolderObjectsResponse listFolderObjects(

                        com.rsys.ws.ListFolderObjects listFolderObjects,com.rsys.ws.SessionHeader sessionHeader1)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the launch info given a launch Id.
                    * @param getLaunchStatus
                
                    * @param sessionHeader2
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetLaunchStatusResponse getLaunchStatus(

                        com.rsys.ws.GetLaunchStatus getLaunchStatus,com.rsys.ws.SessionHeader sessionHeader2)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Set content to a document.
                    * @param setDocumentContent
                
                    * @param sessionHeader3
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.SetDocumentContentResponse setDocumentContent(

                        com.rsys.ws.SetDocumentContent setDocumentContent,com.rsys.ws.SessionHeader sessionHeader3)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Retrieves records from link table.
                    * @param retrieveLinkRecords
                
                    * @param sessionHeader4
                
             * @throws com.rsys.ws.client.LinkTableFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.RetrieveLinkRecordsResponse retrieveLinkRecords(

                        com.rsys.ws.RetrieveLinkRecords retrieveLinkRecords,com.rsys.ws.SessionHeader sessionHeader4)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.LinkTableFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Login to the Responsys Web Services API.
                    * @param login
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.AccountFault : 
         */

         
                     public com.rsys.ws.LoginResponse login(

                        com.rsys.ws.Login login)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.AccountFault;

        

        /**
          * Auto generated method signature
          * Deletes records from a link table.
                    * @param deleteLinkRecords
                
                    * @param sessionHeader5
                
             * @throws com.rsys.ws.client.LinkTableFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteLinkRecordsResponse deleteLinkRecords(

                        com.rsys.ws.DeleteLinkRecords deleteLinkRecords,com.rsys.ws.SessionHeader sessionHeader5)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.LinkTableFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Move asset in the Content Library.
                    * @param moveContentLibraryItem
                
                    * @param sessionHeader6
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.MoveContentLibraryItemResponse moveContentLibraryItem(

                        com.rsys.ws.MoveContentLibraryItem moveContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader6)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Delete folder in the Content Library.
                    * @param deleteContentLibraryFolder
                
                    * @param sessionHeader7
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteContentLibraryFolderResponse deleteContentLibraryFolder(

                        com.rsys.ws.DeleteContentLibraryFolder deleteContentLibraryFolder,com.rsys.ws.SessionHeader sessionHeader7)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Update asset in the Content Library.
                    * @param setContentLibraryItem
                
                    * @param sessionHeader8
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.SetContentLibraryItemResponse setContentLibraryItem(

                        com.rsys.ws.SetContentLibraryItem setContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader8)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes an existing link table.
                    * @param deleteLinkTable
                
                    * @param sessionHeader9
                
             * @throws com.rsys.ws.client.LinkTableFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteLinkTableResponse deleteLinkTable(

                        com.rsys.ws.DeleteLinkTable deleteLinkTable,com.rsys.ws.SessionHeader sessionHeader9)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.LinkTableFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * List folders in the Content Library.
                    * @param listContentLibraryFolders
                
                    * @param sessionHeader10
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.ListContentLibraryFoldersResponse listContentLibraryFolders(

                        com.rsys.ws.ListContentLibraryFolders listContentLibraryFolders,com.rsys.ws.SessionHeader sessionHeader10)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Copy asset in the Content Library.
                    * @param copyContentLibraryItem
                
                    * @param sessionHeader11
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CopyContentLibraryItemResponse copyContentLibraryItem(

                        com.rsys.ws.CopyContentLibraryItem copyContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader11)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes recipients from a list.
                    * @param deleteListMembers
                
                    * @param sessionHeader12
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteListMembersResponse deleteListMembers(

                        com.rsys.ws.DeleteListMembers deleteListMembers,com.rsys.ws.SessionHeader sessionHeader12)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get the Launches for a given Campaign.
                    * @param getLaunchesForCampaign
                
                    * @param sessionHeader13
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetLaunchesForCampaignResponse getLaunchesForCampaign(

                        com.rsys.ws.GetLaunchesForCampaign getLaunchesForCampaign,com.rsys.ws.SessionHeader sessionHeader13)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Send Triggered Message to 1 or more recipients.
                    * @param triggerCampaignMessage
                
                    * @param sessionHeader14
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TriggeredMessageFault : 
         */

         
                     public com.rsys.ws.TriggerCampaignMessageResponse triggerCampaignMessage(

                        com.rsys.ws.TriggerCampaignMessage triggerCampaignMessage,com.rsys.ws.SessionHeader sessionHeader14)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TriggeredMessageFault;

        

        /**
          * Auto generated method signature
          * Creates an empty table.
                    * @param createTable
                
                    * @param sessionHeader15
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.CreateTableResponse createTable(

                        com.rsys.ws.CreateTable createTable,com.rsys.ws.SessionHeader sessionHeader15)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Retrieves recipients from a list.
                    * @param retrieveListMembers
                
                    * @param sessionHeader16
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.RetrieveListMembersResponse retrieveListMembers(

                        com.rsys.ws.RetrieveListMembers retrieveListMembers,com.rsys.ws.SessionHeader sessionHeader16)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Logout of the Responsys Web Services API.
                    * @param logout
                
                    * @param sessionHeader17
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.LogoutResponse logout(

                        com.rsys.ws.Logout logout,com.rsys.ws.SessionHeader sessionHeader17)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Merge data into a table using primary keys.
                    * @param mergeTableRecordsWithPK
                
                    * @param sessionHeader18
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.MergeTableRecordsWithPKResponse mergeTableRecordsWithPK(

                        com.rsys.ws.MergeTableRecordsWithPK mergeTableRecordsWithPK,com.rsys.ws.SessionHeader sessionHeader18)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Create folder in the Content Library.
                    * @param createContentLibraryFolder
                
                    * @param sessionHeader19
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateContentLibraryFolderResponse createContentLibraryFolder(

                        com.rsys.ws.CreateContentLibraryFolder createContentLibraryFolder,com.rsys.ws.SessionHeader sessionHeader19)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Creates an empty table with primary keys.
                    * @param createTableWithPK
                
                    * @param sessionHeader20
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.CreateTableWithPKResponse createTableWithPK(

                        com.rsys.ws.CreateTableWithPK createTableWithPK,com.rsys.ws.SessionHeader sessionHeader20)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Creates a new folder.
                    * @param createFolder
                
                    * @param sessionHeader21
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateFolderResponse createFolder(

                        com.rsys.ws.CreateFolder createFolder,com.rsys.ws.SessionHeader sessionHeader21)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get asset in the Content Library.
                    * @param getContentLibraryItem
                
                    * @param sessionHeader22
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetContentLibraryItemResponse getContentLibraryItem(

                        com.rsys.ws.GetContentLibraryItem getContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader22)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes an existing table.
                    * @param deleteTable
                
                    * @param sessionHeader23
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.DeleteTableResponse deleteTable(

                        com.rsys.ws.DeleteTable deleteTable,com.rsys.ws.SessionHeader sessionHeader23)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Merge And Send Triggered Message for 1 or more recipients.
                    * @param mergeTriggerEmail
                
                    * @param sessionHeader24
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TriggeredMessageFault : 
         */

         
                     public com.rsys.ws.MergeTriggerEmailResponse mergeTriggerEmail(

                        com.rsys.ws.MergeTriggerEmail mergeTriggerEmail,com.rsys.ws.SessionHeader sessionHeader24)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TriggeredMessageFault;

        

        /**
          * Auto generated method signature
          * Create asset in the Content Library.
                    * @param createContentLibraryItem
                
                    * @param sessionHeader25
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateContentLibraryItemResponse createContentLibraryItem(

                        com.rsys.ws.CreateContentLibraryItem createContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader25)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Copying an object.
                    * @param copy
                
                    * @param sessionHeader26
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ObjectFault : 
         */

         
                     public com.rsys.ws.CopyResponse copy(

                        com.rsys.ws.Copy copy,com.rsys.ws.SessionHeader sessionHeader26)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ObjectFault;

        

        /**
          * Auto generated method signature
          * Creates a document.
                    * @param createDocument
                
                    * @param sessionHeader27
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateDocumentResponse createDocument(

                        com.rsys.ws.CreateDocument createDocument,com.rsys.ws.SessionHeader sessionHeader27)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Moving an object.
                    * @param move
                
                    * @param sessionHeader28
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ObjectFault : 
         */

         
                     public com.rsys.ws.MoveResponse move(

                        com.rsys.ws.Move move,com.rsys.ws.SessionHeader sessionHeader28)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ObjectFault;

        

        /**
          * Auto generated method signature
          * Closes a campaign.
                    * @param closeCampaign
                
                    * @param sessionHeader29
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CloseCampaignResponse closeCampaign(

                        com.rsys.ws.CloseCampaign closeCampaign,com.rsys.ws.SessionHeader sessionHeader29)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Delete asset in the Content Library.
                    * @param deleteContentLibraryItem
                
                    * @param sessionHeader30
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteContentLibraryItemResponse deleteContentLibraryItem(

                        com.rsys.ws.DeleteContentLibraryItem deleteContentLibraryItem,com.rsys.ws.SessionHeader sessionHeader30)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Set images to a document.
                    * @param setDocumentImages
                
                    * @param sessionHeader31
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.SetDocumentImagesResponse setDocumentImages(

                        com.rsys.ws.SetDocumentImages setDocumentImages,com.rsys.ws.SessionHeader sessionHeader31)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get campaign properties.
                    * @param getCampaignProperties
                
                    * @param sessionHeader32
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetCampaignPropertiesResponse getCampaignProperties(

                        com.rsys.ws.GetCampaignProperties getCampaignProperties,com.rsys.ws.SessionHeader sessionHeader32)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Auhenticate the server.
                    * @param authenticateServer
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.AccountFault : 
         */

         
                     public com.rsys.ws.AuthenticateServerResponse authenticateServer(

                        com.rsys.ws.AuthenticateServer authenticateServer)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.AccountFault;

        

        /**
          * Auto generated method signature
          * Merge data into a link table.
                    * @param mergeLinkRecords
                
                    * @param sessionHeader33
                
             * @throws com.rsys.ws.client.LinkTableFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.MergeLinkRecordsResponse mergeLinkRecords(

                        com.rsys.ws.MergeLinkRecords mergeLinkRecords,com.rsys.ws.SessionHeader sessionHeader33)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.LinkTableFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Create a campaign.
                    * @param createCampaign
                
                    * @param sessionHeader34
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateCampaignResponse createCampaign(

                        com.rsys.ws.CreateCampaign createCampaign,com.rsys.ws.SessionHeader sessionHeader34)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Merge data into a table.
                    * @param mergeTableRecords
                
                    * @param sessionHeader35
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.MergeTableRecordsResponse mergeTableRecords(

                        com.rsys.ws.MergeTableRecords mergeTableRecords,com.rsys.ws.SessionHeader sessionHeader35)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Set campaign properties.
                    * @param setCampaignProperties
                
                    * @param sessionHeader36
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.SetCampaignPropertiesResponse setCampaignProperties(

                        com.rsys.ws.SetCampaignProperties setCampaignProperties,com.rsys.ws.SessionHeader sessionHeader36)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Launch a Campaign Immediately.
                    * @param launchCampaign
                
                    * @param sessionHeader37
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.LaunchCampaignResponse launchCampaign(

                        com.rsys.ws.LaunchCampaign launchCampaign,com.rsys.ws.SessionHeader sessionHeader37)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Merge And Send Triggered Message for 1 or more recipients.
                    * @param haMergeTriggerEmail
                
                    * @param sessionHeader38
                
             * @throws com.rsys.ws.client.UnrecoverableErrorFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TriggeredMessageFault : 
         */

         
                     public com.rsys.ws.HaMergeTriggerEmailResponse haMergeTriggerEmail(

                        com.rsys.ws.HaMergeTriggerEmail haMergeTriggerEmail,com.rsys.ws.SessionHeader sessionHeader38)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnrecoverableErrorFault
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TriggeredMessageFault;

        

        /**
          * Auto generated method signature
          * Retrieves records from a list extension.
                    * @param retrieveProfileExtensionRecords
                
                    * @param sessionHeader39
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ListExtensionFault : 
         */

         
                     public com.rsys.ws.RetrieveProfileExtensionRecordsResponse retrieveProfileExtensionRecords(

                        com.rsys.ws.RetrieveProfileExtensionRecords retrieveProfileExtensionRecords,com.rsys.ws.SessionHeader sessionHeader39)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ListExtensionFault;

        

        /**
          * Auto generated method signature
          * Deletes a document.
                    * @param deleteDocument
                
                    * @param sessionHeader40
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteDocumentResponse deleteDocument(

                        com.rsys.ws.DeleteDocument deleteDocument,com.rsys.ws.SessionHeader sessionHeader40)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes an existing list.
                    * @param deleteList
                
                    * @param sessionHeader41
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteListResponse deleteList(

                        com.rsys.ws.DeleteList deleteList,com.rsys.ws.SessionHeader sessionHeader41)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Schedule a Campaign Launch.
                    * @param scheduleCampaignLaunch
                
                    * @param sessionHeader42
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.ScheduleCampaignLaunchResponse scheduleCampaignLaunch(

                        com.rsys.ws.ScheduleCampaignLaunch scheduleCampaignLaunch,com.rsys.ws.SessionHeader sessionHeader42)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Creates a view from the given SQL query.
                    * @param createSQLView
                
                    * @param sessionHeader43
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.CreateSQLViewResponse createSQLView(

                        com.rsys.ws.CreateSQLView createSQLView,com.rsys.ws.SessionHeader sessionHeader43)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Get content of a document.
                    * @param getDocumentContent
                
                    * @param sessionHeader44
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetDocumentContentResponse getDocumentContent(

                        com.rsys.ws.GetDocumentContent getDocumentContent,com.rsys.ws.SessionHeader sessionHeader44)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the Job Runs for a Job.
                    * @param getJobRuns
                
                    * @param sessionHeader45
                
             * @throws com.rsys.ws.client.ConnectFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetJobRunsResponse getJobRuns(

                        com.rsys.ws.GetJobRuns getJobRuns,com.rsys.ws.SessionHeader sessionHeader45)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ConnectFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Truncate data in existing table.
                    * @param truncateTable
                
                    * @param sessionHeader46
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.TruncateTableResponse truncateTable(

                        com.rsys.ws.TruncateTable truncateTable,com.rsys.ws.SessionHeader sessionHeader46)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Unschedules a campaign.
                    * @param unscheduleCampaignLaunch
                
                    * @param sessionHeader47
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.UnscheduleCampaignLaunchResponse unscheduleCampaignLaunch(

                        com.rsys.ws.UnscheduleCampaignLaunch unscheduleCampaignLaunch,com.rsys.ws.SessionHeader sessionHeader47)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Describe Objects.
                    * @param describeObjects
                
                    * @param sessionHeader48
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ObjectFault : 
         */

         
                     public com.rsys.ws.DescribeObjectsResponse describeObjects(

                        com.rsys.ws.DescribeObjects describeObjects,com.rsys.ws.SessionHeader sessionHeader48)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ObjectFault;

        

        /**
          * Auto generated method signature
          * Changes the table schema.
                    * @param changeTableSchema
                
                    * @param sessionHeader49
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.ChangeTableSchemaResponse changeTableSchema(

                        com.rsys.ws.ChangeTableSchema changeTableSchema,com.rsys.ws.SessionHeader sessionHeader49)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Trigger Custom Event to 1 or more recipients.
                    * @param triggerCustomEvent
                
                    * @param sessionHeader50
                
             * @throws com.rsys.ws.client.CustomEventFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.TriggerCustomEventResponse triggerCustomEvent(

                        com.rsys.ws.TriggerCustomEvent triggerCustomEvent,com.rsys.ws.SessionHeader sessionHeader50)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CustomEventFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Run a Connect Job.
                    * @param runJob
                
                    * @param sessionHeader51
                
             * @throws com.rsys.ws.client.ConnectFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.RunJobResponse runJob(

                        com.rsys.ws.RunJob runJob,com.rsys.ws.SessionHeader sessionHeader51)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ConnectFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes records from a table.
                    * @param deleteTableRecords
                
                    * @param sessionHeader52
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.DeleteTableRecordsResponse deleteTableRecords(

                        com.rsys.ws.DeleteTableRecords deleteTableRecords,com.rsys.ws.SessionHeader sessionHeader52)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * List folders in the Responsys account.
                    * @param listFolders
                
                    * @param sessionHeader53
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.ListFoldersResponse listFolders(

                        com.rsys.ws.ListFolders listFolders,com.rsys.ws.SessionHeader sessionHeader53)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Check if folder exists in the Content Library.
                    * @param doesContentLibraryFolderExist
                
                    * @param sessionHeader54
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DoesContentLibraryFolderExistResponse doesContentLibraryFolderExist(

                        com.rsys.ws.DoesContentLibraryFolderExist doesContentLibraryFolderExist,com.rsys.ws.SessionHeader sessionHeader54)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get open launches for an account.
                    * @param getOpenLaunches
                
                    * @param sessionHeader55
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.AccountFault : 
         */

         
                     public com.rsys.ws.GetOpenLaunchesResponse getOpenLaunches(

                        com.rsys.ws.GetOpenLaunches getOpenLaunches,com.rsys.ws.SessionHeader sessionHeader55)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.AccountFault;

        

        /**
          * Auto generated method signature
          * Merge data into a list extension returning the recipient ids.
                    * @param mergeIntoProfileExtension
                
                    * @param sessionHeader56
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ListExtensionFault : 
         */

         
                     public com.rsys.ws.MergeIntoProfileExtensionResponse mergeIntoProfileExtension(

                        com.rsys.ws.MergeIntoProfileExtension mergeIntoProfileExtension,com.rsys.ws.SessionHeader sessionHeader56)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ListExtensionFault;

        

        /**
          * Auto generated method signature
          * Creates an empty link table.
                    * @param createLinkTable
                
                    * @param sessionHeader57
                
             * @throws com.rsys.ws.client.LinkTableFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateLinkTableResponse createLinkTable(

                        com.rsys.ws.CreateLinkTable createLinkTable,com.rsys.ws.SessionHeader sessionHeader57)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.LinkTableFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the Log for a Job Run.
                    * @param getJobRunLog
                
                    * @param sessionHeader58
                
             * @throws com.rsys.ws.client.ConnectFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetJobRunLogResponse getJobRunLog(

                        com.rsys.ws.GetJobRunLog getJobRunLog,com.rsys.ws.SessionHeader sessionHeader58)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ConnectFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes a campaign.
                    * @param deleteCampaign
                
                    * @param sessionHeader59
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteCampaignResponse deleteCampaign(

                        com.rsys.ws.DeleteCampaign deleteCampaign,com.rsys.ws.SessionHeader sessionHeader59)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Merge data into a list.
                    * @param mergeListMembers
                
                    * @param sessionHeader60
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.MergeListMembersResponse mergeListMembers(

                        com.rsys.ws.MergeListMembers mergeListMembers,com.rsys.ws.SessionHeader sessionHeader60)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Creates an empty list.
                    * @param createList
                
                    * @param sessionHeader61
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.CreateListResponse createList(

                        com.rsys.ws.CreateList createList,com.rsys.ws.SessionHeader sessionHeader61)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the campaign Id given a campaign name.
                    * @param getCampaignId
                
                    * @param sessionHeader62
                
             * @throws com.rsys.ws.client.CampaignFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetCampaignIdResponse getCampaignId(

                        com.rsys.ws.GetCampaignId getCampaignId,com.rsys.ws.SessionHeader sessionHeader62)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.CampaignFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Login to the Responsys Web Services API using Certificate.
                    * @param loginWithCertificate
                
                    * @param authSessionHeader
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.AccountFault : 
         */

         
                     public com.rsys.ws.LoginWithCertificateResponse loginWithCertificate(

                        com.rsys.ws.LoginWithCertificate loginWithCertificate,com.rsys.ws.AuthSessionHeader authSessionHeader)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.AccountFault;

        

        /**
          * Auto generated method signature
          * Deletes recipients from a list extension.
                    * @param deleteProfileExtensionMembers
                
                    * @param sessionHeader63
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.ListExtensionFault : 
         */

         
                     public com.rsys.ws.DeleteProfileExtensionMembersResponse deleteProfileExtensionMembers(

                        com.rsys.ws.DeleteProfileExtensionMembers deleteProfileExtensionMembers,com.rsys.ws.SessionHeader sessionHeader63)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.ListExtensionFault;

        

        /**
          * Auto generated method signature
          * Retrieves records from table.
                    * @param retrieveTableRecords
                
                    * @param sessionHeader64
                
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
             * @throws com.rsys.ws.client.TableFault : 
         */

         
                     public com.rsys.ws.RetrieveTableRecordsResponse retrieveTableRecords(

                        com.rsys.ws.RetrieveTableRecords retrieveTableRecords,com.rsys.ws.SessionHeader sessionHeader64)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.UnexpectedErrorFault
          ,com.rsys.ws.client.TableFault;

        

        /**
          * Auto generated method signature
          * Changes the list schema.
                    * @param changeListSchema
                
                    * @param sessionHeader65
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.ChangeListSchemaResponse changeListSchema(

                        com.rsys.ws.ChangeListSchema changeListSchema,com.rsys.ws.SessionHeader sessionHeader65)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Get images from a document.
                    * @param getDocumentImages
                
                    * @param sessionHeader66
                
             * @throws com.rsys.ws.client.DocumentFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetDocumentImagesResponse getDocumentImages(

                        com.rsys.ws.GetDocumentImages getDocumentImages,com.rsys.ws.SessionHeader sessionHeader66)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.DocumentFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the Jobs for the account.
                    * @param getJobs
                
                    * @param sessionHeader67
                
             * @throws com.rsys.ws.client.ConnectFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetJobsResponse getJobs(

                        com.rsys.ws.GetJobs getJobs,com.rsys.ws.SessionHeader sessionHeader67)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ConnectFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Merge data into a list returning the recipient ids.
                    * @param mergeListMembersRIID
                
                    * @param sessionHeader68
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.MergeListMembersRIIDResponse mergeListMembersRIID(

                        com.rsys.ws.MergeListMembersRIID mergeListMembersRIID,com.rsys.ws.SessionHeader sessionHeader68)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Gets the updated ids between two dates.
                    * @param getUpdated
                
                    * @param sessionHeader69
                
             * @throws com.rsys.ws.client.ListFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.GetUpdatedResponse getUpdated(

                        com.rsys.ws.GetUpdated getUpdated,com.rsys.ws.SessionHeader sessionHeader69)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.ListFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        /**
          * Auto generated method signature
          * Deletes an existing folder.
                    * @param deleteFolder
                
                    * @param sessionHeader70
                
             * @throws com.rsys.ws.client.FolderFault : 
             * @throws com.rsys.ws.client.UnexpectedErrorFault : 
         */

         
                     public com.rsys.ws.DeleteFolderResponse deleteFolder(

                        com.rsys.ws.DeleteFolder deleteFolder,com.rsys.ws.SessionHeader sessionHeader70)
                        throws java.rmi.RemoteException
             
          ,com.rsys.ws.client.FolderFault
          ,com.rsys.ws.client.UnexpectedErrorFault;

        

        
       //
       }
    