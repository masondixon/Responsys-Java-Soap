package campaign;

import java.rmi.RemoteException;
import java.util.List;
import session.SessionManage;
import com.rsys.ws.EmailFormat;
import com.rsys.ws.InteractObject;
import com.rsys.ws.TriggerCampaignMessage;
import com.rsys.ws.TriggerCampaignMessageResponse;
import com.rsys.ws.RecipientData;
import com.rsys.ws.Recipient;
import com.rsys.ws.OptionalData;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.TriggeredMessageFault;
import com.rsys.ws.client.UnexpectedErrorFault;

public class triggerCampaignMessage 
{
	
	public TriggerCampaignMessageResponse trigger( String folderName, String objectName, String[] contacts, String[] fields, List<String[]> values, SessionManage session ) throws RemoteException, UnexpectedErrorFault, TriggeredMessageFault
	{
		TriggerCampaignMessageResponse response = null;

		ResponsysWSServiceStub instance = session.getInstance();
		
		TriggerCampaignMessage message = new TriggerCampaignMessage();
	
		InteractObject messageInteractObj = session.getInteractObject(  objectName, folderName );
		
		message.setCampaign( messageInteractObj );
		
		int contactCnt = contacts.length;
				
		RecipientData[] rData  = new RecipientData[ contactCnt ];
		
		for( int i = 0; i < contactCnt; i++ )
		{	
			rData[ i ] = new RecipientData();
			String[] vals = values.get( i );
			OptionalData[] optionalData = new OptionalData[fields.length];		

			for( int k = 0; k < fields.length; k++ )
			{
				//System.out.println( "Field : " + fields[k].trim() );
				//System.out.println( "Value : " + vals[k].trim() );
				OptionalData optData = new OptionalData();
				optData.setName( fields[k].trim() );
				optData.setValue( vals[k].trim() );
				optionalData[k] = optData;
			}
			
			Recipient recipient = new Recipient();
			recipient.setEmailAddress( contacts[ i ]);
			recipient.setEmailFormat( EmailFormat.NO_FORMAT );
			
			rData[ i ].setOptionalData( optionalData );
			rData[ i ].setRecipient( recipient );
		}
		
		message.setRecipientData( rData );
		
		response = instance.triggerCampaignMessage( message, session.getSessionHeader() );	
	
		return response;
	}

}
