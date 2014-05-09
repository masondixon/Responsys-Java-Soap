import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang.ArrayUtils;

import campaign.mergeTriggerCampaign;
import campaign.scheduleCampaignBulkLaunch;
import campaign.triggerCustomEvent;

import com.rsys.ws.CharacterEncoding;
import com.rsys.ws.CreateDocument;
import com.rsys.ws.CreateDocumentResponse;
import com.rsys.ws.InteractObject;
import com.rsys.ws.ListMergeRule;
import com.rsys.ws.MatchOperator;
import com.rsys.ws.MergeListMembersRIID;
import com.rsys.ws.MergeListMembersRIIDResponse;
import com.rsys.ws.MergeTableRecordsWithPKResponse;
import com.rsys.ws.MergeTriggerEmailResponse;
import com.rsys.ws.PermissionStatus;
import com.rsys.ws.QueryColumn;
import com.rsys.ws.RecipientResult;
import com.rsys.ws.Record;
import com.rsys.ws.RecordData;
import com.rsys.ws.RetrieveListMembersResponse;
import com.rsys.ws.RetrieveResult;
import com.rsys.ws.ScheduleCampaignLaunchResponse;
import com.rsys.ws.SetDocumentImagesResponse;
import com.rsys.ws.TriggerCustomEventResponse;
import com.rsys.ws.TriggerResult;
import com.rsys.ws.UpdateOnMatch;
import com.rsys.ws.client.CampaignFault;
import com.rsys.ws.client.CustomEventFault;
import com.rsys.ws.client.DocumentFault;
import com.rsys.ws.client.ListFault;
import com.rsys.ws.client.TableFault;
import com.rsys.ws.client.TriggeredMessageFault;
import com.rsys.ws.client.UnexpectedErrorFault;

import content.setDocumentImages;
import encryption.aes_encrypt;
import session.SessionManage;
import table.mergeTableRecordsWithPrimaryKey;
import list.listMergeRuleHelper;
import list.retrieveListMember;

public class test 
{
	/**
	 * You will need a web services enabled account and user 
	 * The account will be on either ws5.responsys.net or ws2.responsys.net
	 */
	String username = "some_user_name";
	String password = "some_pass";
	String[] pod    = { "2", "5" }; // 2 indicates ws2.responsys.net 5 indicates ws5.responsys.net
	
	
	/**
	 * Some constants to use for test calls below
	 * These will need to be changed to reflect your responsys assets
	 */
	String folderName   = "Mason";
	String campaignName = "masonTestCampaign";
	String listName     = "masonList1";
	
	String supplemental_table = "suppTable2";
	String custom_event_name  = "Welcome";

	/**
	 * Each test will have test data that needs to reflect data in your account.
	 */
	public static void main( String[] args ) 
	{
		test new_test = new test();
		//new_test.mergeListMembers();
		new_test.triggerCustomEvent();
	}
	
	public static void print( String str )
	{
		System.out.println( str );
	}
	
	/**
	 * This call is for inserting records and then sending them email, all in one fell swoop
	 * Replaces need to mergeListMembers then triggerCampaignMessage
	 * 
	 * The record data is data that will be written to Responsys db's
	 * TriggerData is data that is meant to be relayed to campaign
	 * 
	 */
	public void mergeTriggerEmail()
	{
		SessionManage session = new SessionManage();
		try
		{
				boolean loggedIn = session.login( username, password, pod[1] );
				if(loggedIn)
				{
					mergeTriggerCampaign merge_trigger = new mergeTriggerCampaign();
					
					InteractObject campaignObject = new InteractObject();
					campaignObject.setFolderName("Welcome_Message");
					campaignObject.setObjectName("Welcome_Message5");
					
					String[] fields     = { "EMAIL_ADDRESS_", "GENDER" };
					String[] somedata2  = { "email@email.com", "M" };
					String[] somedata   = { "mdixon@gmail.com", "M" };
					
					String[] optionals  = { "FIRST_NAME", folderName };
					String[] optionals2 = { "LAST_NAME", "Nosam" };
					
					List<String[]> optionalValues = new ArrayList<String[]>();
					optionalValues.add( optionals );
					optionalValues.add( optionals2 );
					
					List<String[]> data = new ArrayList<String[]>();
					data.add(somedata);
					data.add(somedata2);
					
					listMergeRuleHelper helper = new listMergeRuleHelper();
					ListMergeRule list_merge_rule = helper.defineListMergeRule( PermissionStatus.OPTIN , true, UpdateOnMatch.REPLACE_ALL,  "EMAIL_ADDRESS_", null, MatchOperator.NONE , "E" );

					MergeTriggerEmailResponse response = merge_trigger.mergeAndSend( campaignObject, fields, data, optionalValues, list_merge_rule, session);
					
					if ( response != null )
					{
						TriggerResult[] tRes = response.getResult();
						for ( TriggerResult res : tRes )
						{
							
							if( res.getSuccess() )
							{
								System.out.println(" SUCCESS -> RecipientId: " + res.getRecipientId() ) ;
							}
							else
							{
								System.out.println( " ERROR: " + res.getErrorMessage() );
							}
						}
					}
					
				}
			}
			catch ( TriggeredMessageFault triggerFault )
			{
		        System.out.println("Fault detail element Code:  " + triggerFault.getFaultMessage().getExceptionCode() + " Detail: " + triggerFault.getFaultMessage().getExceptionMessage() );
			}
			catch ( UnexpectedErrorFault unFault )
			{
				System.out.println("Fault detail element = " + unFault.getFaultMessage().getExceptionCode() + " Detail: " + unFault.getFaultMessage().getExceptionMessage() );
			}
			catch ( RemoteException remote )
			{
				System.out.println("Remote Exception detail element = " + remote.getMessage() );
			}
			finally
			{
				session.logout( );
			}
	}
	
	
	/**
	 * This call is for scheduling bulk launch campaigns in the future
	 */
	public void scheduleLaunchCampaign()
	{
		
		SessionManage session = new SessionManage();
		
		boolean loggedIn = session.login( username, password, pod[1] );
		
		if(loggedIn)
		{
		
			scheduleCampaignBulkLaunch new_launch = new scheduleCampaignBulkLaunch();
			
			Date date = new Date();
			long now_milliseconds = date.getTime();
			long send_time = now_milliseconds + 600000;
			
			date.setTime(send_time);
			
			try 
			{
				ScheduleCampaignLaunchResponse response = new_launch.doLaunch( folderName, "masonTestCampaign", date, session );
				boolean result = response.getResult();
				
				if( result )
				{
					print( "Campaign Launch Scheduled" );
				}
				else
				{
					print( "Scheduling failed for some reason - no details" );
				}
				
			} 
			catch (RemoteException e) 
			{
				
				e.printStackTrace();
			} 
			catch (CampaignFault e) 
			{
				System.out.println( "Campaign Fault: " + e.getFaultMessage().getExceptionMessage() );
				
				e.printStackTrace();
			} 
			catch (UnexpectedErrorFault e) 
			{
				System.out.println( "UnexpectedErrorFault: " + e.getFaultMessage().getExceptionCode() );
				
				e.printStackTrace();
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				session.logout( );
			}
		}
		
	}

	
	/**
	 * This call is for inserting or updating records to a contact list
	 * The platform is list centric, meaning that an email has to belong to a list to receive a message
	 */
	public void mergeListMembers()
	{
		SessionManage session = new SessionManage();
		
		if ( session.login( username, password, pod[1] ) )
		{
			
			listMergeRuleHelper merge_rule = new listMergeRuleHelper();
			ListMergeRule list_merge_rule = merge_rule.defineListMergeRule( PermissionStatus.OPTIN, true, UpdateOnMatch.REPLACE_ALL, "EMAIL_ADDRESS_", null, MatchOperator.NONE, "E" );
			
			String[] field_names = new String[ 3 ];
			field_names[0] = "EMAIL_ADDRESS_";
			field_names[1] = "MOBILE_NUMBER_";
			field_names[2] = "FIRSTNAME";
			
			String[] field_values = new String[field_names.length];
			field_values[0] = "mdixon@gmail.com";
			field_values[1] = "5106507777";
			field_values[2] = "Nosam";
			
			Record record = new Record();
			record.setFieldValues( field_values );
	
			RecordData record_data = new RecordData();
			record_data.setRecords( new Record[] { record } );
			record_data.setFieldNames( field_names );
			
			MergeListMembersRIID merge_list_members = new MergeListMembersRIID();
			merge_list_members.setList( session.getInteractObject( listName, folderName ) );
			merge_list_members.setMergeRule( list_merge_rule );
			merge_list_members.setRecordData( record_data );
	
			System.out.println( "Making mergeListMembers call" );
			
			MergeListMembersRIIDResponse merge_list_members_response;
			
			try 
			{
				
				merge_list_members_response = session.getInstance().mergeListMembersRIID( merge_list_members, session.getSessionHeader() );
				
				RecipientResult[] results = merge_list_members_response.getRecipientResult();
				System.out.println( "Received " + results.length + " recipient result(s)" );
				
				for ( RecipientResult result : results )
				{
					print( "Recipient Id: " + result.getRecipientId() );
				}
			} 
			catch (RemoteException e) 
			{
				print( "Remote Exception " + e.getMessage() );
				e.printStackTrace();
			} 
			catch (ListFault e) 
			{
				print( "ListFault " + e.getFaultMessage().getExceptionCode() );
				e.printStackTrace();
			} 
			catch (UnexpectedErrorFault e) 
			{
				print( "UnexpectedErrorFault " + e.getFaultMessage().getExceptionCode());
				e.printStackTrace();
			}
			finally
			{
				session.logout( );
			}
		}
		
	}

	/*
	 * This call is for retrieving records from a contact list
	 * You have to know what you're looking for though...
	 */
	public void retrieveListMembers()
	{
		String [] fieldNames = new String[] {"FIRSTNAME", "RIID_"};
		String [] ids        = new String[] { "mdixon@gmail.com" };
		
		SessionManage session = new SessionManage();
		
		if ( session.login( username, password, pod[1] ) )
		{
			
			retrieveListMember ret_obj = new retrieveListMember();
			try 
			{
				RetrieveListMembersResponse response = ret_obj.retrieveContactListRecords( folderName, listName, QueryColumn.EMAIL_ADDRESS, fieldNames, ids, session );
				RetrieveResult ret_result = response.getResult();
				
				RecordData record_data = ret_result.getRecordData();
				
				for( Record record : record_data.getRecords() )
				{
					int cnt = 0;
					for( String value : record.getFieldValues() )
					{
						print( "Field Name: " + fieldNames[ cnt ] + " --- Field Value: " + value );
						cnt++;
					}
				}
	
			} 
			catch (RemoteException e) 
			{	
				print( "Remote Exception " + e.getMessage() );
				e.printStackTrace();
			} 
			catch (ListFault e) 
			{	
				print( "ListFault " + e.getFaultMessage().getExceptionCode() );
				e.printStackTrace();
			} 
			catch (UnexpectedErrorFault e) 
			{
				print( "UnexpectedErrorFault " + e.getFaultMessage().getExceptionCode());
				e.printStackTrace();
			}
			finally
			{
				session.logout( );
			}
		}
		else
		{
			print( " Login Failed ");
		}
	}
	
	/**
	 * This call is for inserting or updating records in a supplemental table
	 */
	public void mergeRecordsWithPK()
	{
		SessionManage session = new SessionManage();
		
		if( session.login( username, password, pod[1] ) )
		{
		
			String [] fields = { "RIID_", "TESTINTEGER", "MAXTEXT" };
			
			List<String[]> values = new ArrayList<String[]>();
			
			String [] val_1 = { "777", "0007", "1231" }; 
			String [] val_2 = { "7777777", null, null }; 
			
			values.add( val_1 );
			values.add( val_2 );
			
			mergeTableRecordsWithPrimaryKey merge = new mergeTableRecordsWithPrimaryKey();
			
			MergeTableRecordsWithPKResponse result;
			try 
			{
				result = merge.doMergeRecords( supplemental_table, folderName, fields, values, session );
				
				if ( result.getResult().getErrorMessage() == null )
				{
					System.out.println( "Inserted count:" + result.getResult().getInsertCount() );
					System.out.println( "Rejected count:" + result.getResult().getRejectedCount() );
					System.out.println( "Updated count:"  + result.getResult().getUpdateCount() );
					System.out.println( "Total count:"    + result.getResult().getTotalCount() );
				}
				else
				{
					System.out.println( "Error Message : " + result.getResult().getErrorMessage() );
					System.out.println( "Inserted count:" + result.getResult().getInsertCount() );
					System.out.println( "Rejected count:" + result.getResult().getRejectedCount() );
					System.out.println( "Updated count:"  + result.getResult().getUpdateCount() );
					System.out.println( "Total count:"    + result.getResult().getTotalCount() );
				}
				
			}
			catch (RemoteException e)
			{
				e.printStackTrace();
			} 
			catch (UnexpectedErrorFault e) 
			{
				print( "UnexpectedErrorFault " + e.getFaultMessage().getExceptionCode());
			} 
			catch (TableFault e) 
			{
				print( "TableFault " + e.getFaultMessage().getExceptionCode());
			}
			finally
			{
				session.logout( );
			}

		}
	}
	
	/**
	 * This call is for invoking the triggerCustomEvent call.
	 * Records need to be merged in the programs audience list before they can be entered into the event
	 * 
	 * For this example, i am using the RIID ( see the records long variable ) value to identify the record.  You can also pass in email or customer id
	 */
	public void triggerCustomEvent()
	{
		SessionManage session = new SessionManage();
		
		if( session.login( username, password, pod[1] ) )
		{	
			
			triggerCustomEvent tcust = new triggerCustomEvent();
			
			String recipientFolder = folderName;
			String recipientList   = listName;
			
			InteractObject recipient_interact_object = session.getInteractObject(recipientList, recipientFolder);
			
			String[] fields = new String[2];
			fields[0] = "BRAND_IDENTIFIER";
			fields[1] = "FIRST_NAME";

			String[] values = new String[2];
			values[0] = "some_brand";
			values[1] = "fname_1";
			
			String[] values2 = new String[2];
			values2[0] = "some_brand2";
			values2[1] = "fname_2";
			
			List<String[]> valuesList = new ArrayList<String[]>();
			valuesList.add(values);
			valuesList.add(values2);
			
			long[] records = new long[2];
			records[0] = 12719781;
			records[1] = 12719782;
			
			try
			{
				TriggerCustomEventResponse response = tcust.doTriggerCustomEvent( custom_event_name, recipient_interact_object, records, fields, valuesList, session );
				
				if( response.getResult() != null )
				{
					TriggerResult[] res = response.getResult();
					for ( TriggerResult rez : res )
					{
						if( rez.getSuccess() )
						{
							System.out.println( "Recipient Id: " + rez.getRecipientId() );
						}
						else
						{
							System.out.println( "Error Message: " + rez.getErrorMessage() );
						}
					}
				}
			} 
			catch (RemoteException e) 
			{
				e.printStackTrace();
			} 
			catch (CustomEventFault e) 
			{
				print( "CustomEventFault " + e.getFaultMessage().getExceptionCode());
			} 
			catch (UnexpectedErrorFault e)
			{
				print( "UnexpectedErrorFault " + e.getFaultMessage().getExceptionCode());
			}
			finally
			{
				session.logout( );
			}
		}
	}
	
	/**
	 * This call will upload image files to the content library
	 * Notice that the locations are all lowercased
	 */
	public void setContentLibraryDocumentImages()
	{		
		SessionManage session = new SessionManage();

		if( session.login( username, password, pod[1] ) )
		{	
			
			setDocumentImages doc_images = new setDocumentImages();
			
			String[] files = new String[2];
			files[0] = "/Users/mdixon/Downloads/mom.jpg";
			files[1] = "/Users/mdixon/Downloads/googlescribe.jpg";
			
			try
			{
				SetDocumentImagesResponse response = doc_images.doSetImages("/contentlibrary/1_mason", "api_upload.htm", files, session );
				if( response.getResult() )
				{
					System.out.println( "Images Uploaded...");
				}
				else
				{
					System.out.println( "Fail");
				}
			}
			catch( RemoteException r_ex )
			{
				System.out.println( r_ex.getMessage() );	
			}
			catch( DocumentFault d_ex )
			{
				System.out.println( d_ex.getFaultMessage() );
			}
			catch( UnexpectedErrorFault u_ex )
			{
				System.out.println( u_ex.getFaultMessage() );
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				session.logout( );
			}
		}
		
	}
	
	/**
	 * This call creates a document in the content library
	 */
	public void createContentLibraryDocument()
	{
		SessionManage session = new SessionManage();
		
		if( session.login( username, password, pod[1] ) )
		{	
			try 
			{
				CreateDocumentResponse response = null;
	
				InteractObject doc_obj = new InteractObject();
				doc_obj.setFolderName("/contentlibrary/1_mason");
				doc_obj.setObjectName("Masons_New_document.htm");
				
				CreateDocument new_doc = new CreateDocument();
				new_doc.setCharacterEncoding( CharacterEncoding.UTF_8 );
				new_doc.setContent("test");
				new_doc.setDocument( doc_obj );
				response = session.getInstance().createDocument( new_doc, session.getSessionHeader() );
				
				if( response.getResult() )
				{
					System.out.println( "Document Uploaded...");
					System.out.println( response.getResult() );
				}
				else
				{
					System.out.println( "Fail");
				}
				
			} 
			catch (RemoteException e) 
			{
				e.printStackTrace();
			} 
			catch (DocumentFault e) 
			{
				System.out.println( e.getFaultMessage().getExceptionMessage() );
				e.printStackTrace();
			} 
			catch (UnexpectedErrorFault e) 
			{
				System.out.println( e.getFaultMessage().getExceptionMessage() );
			}
			finally
			{
				session.logout( );
			}
		}
	}
	
	/**
	 * This call is for display encryption pixel creation
	 * The call requires the account be setup by Responsys first.
	 * The call requires 256 bit AES encryption ( see JCE libs )
	 * There will be 3 parameters needed from the sysadmin or responsys helper which consist of an account key of 64 hex characters ( 256 bit key ), an account prefix of 32 hex characters, and a pixel url.
	 */
	public void displayEncryptionPixel()
	{
		String account_key       = "KEY OBTAINED FROM RESPONSYS";
		String account_prefix    = "PREFIX OBTAINED FROM RESPONSYS";
		String data              = "SHOULD BE A TEST EMAIL HERE";
		String email_pixel_url_1 = "PIXEL TO BE OBTAINED FROM RESPONSYS - SHOULD BE A URL PATH SPECIFIC TO YOUR ACCOUNT";
		String email_pixel_url_2 = "/_";

		try 
		{
			aes_encrypt encryption_obj = new aes_encrypt();
			
			SecureRandom random = new SecureRandom();
		    byte init_vector[]  = random.generateSeed( 16 );
			
		    byte[] key = Hex.decodeHex( account_key.toCharArray() );
	        
	        byte[] prefix_bytes = Hex.decodeHex( account_prefix.toCharArray() );
	        byte[] data_bytes   = data.getBytes("UTF-8");
	        
	        byte[] concat_bytes = ArrayUtils.addAll( prefix_bytes, data_bytes );
		    
			byte[] encrypted_data = encryption_obj.encrypt( key, init_vector, concat_bytes );
			
			String pixel = email_pixel_url_1 + Hex.encodeHexString( init_vector ) + Hex.encodeHexString( encrypted_data ) + email_pixel_url_2;
			System.out.println( pixel );
			
		} 
		catch (InvalidKeyException e) 
		{
			e.printStackTrace();
		} 
		catch (NoSuchAlgorithmException e) 
		{	
			e.printStackTrace();
		} 
		catch (NoSuchPaddingException e) 
		{
			e.printStackTrace();
		} 
		catch (IllegalBlockSizeException e) 
		{	
			e.printStackTrace();
		} 
		catch (BadPaddingException e) 
		{
			e.printStackTrace();
		} 
		catch (InvalidAlgorithmParameterException e) 
		{	
			e.printStackTrace();
		} 
		catch (UnsupportedEncodingException e) 
		{	
			e.printStackTrace();
		} 
		catch (NoSuchProviderException e) 
		{	
			e.printStackTrace();
		} 
		catch (DecoderException e) 
		{
			e.printStackTrace();
		} 
	}
	
}
