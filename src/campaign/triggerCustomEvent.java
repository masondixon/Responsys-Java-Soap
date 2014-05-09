package campaign;

import session.SessionManage;
import java.rmi.RemoteException;
import java.util.List;

import com.rsys.ws.*;
import com.rsys.ws.client.CustomEventFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.TriggerCustomEventResponse;

public class triggerCustomEvent
{
	/**
	 * @param eventName
	 * @param records -> uses the RIID of the record that would be returned from the mergeListMemberRIID call
	 */
	public TriggerCustomEventResponse doTriggerCustomEvent( String eventName, InteractObject recipient_interact_object, long[] records, String[] fields, List<String[]> values, SessionManage session) throws RemoteException, CustomEventFault, UnexpectedErrorFault
	{
		TriggerCustomEventResponse response = null;

		ResponsysWSServiceStub instance = session.getInstance();
		
		CustomEvent custEvent = new CustomEvent();
		custEvent.setEventName( eventName );
		
		TriggerCustomEvent event = new TriggerCustomEvent();
		event.setCustomEvent( custEvent );

		int recordCnt = records.length;
	
		RecipientData[] rData  = new RecipientData[ recordCnt  ];
		
		for( int i = 0; i < recordCnt; i++ )
		{	
			rData[i] = new RecipientData();
			
			String[] vals = null;
			vals = values.get( i );
			
			OptionalData[] optionalData = null;
			optionalData = new OptionalData[fields.length];
			
			for( int k = 0; k < fields.length; k++ )
			{
				System.out.println( "Field : " + fields[k].trim() );
				System.out.println( "Value : " + vals[k].trim() );
				OptionalData optData = new OptionalData();
				optData.setName( fields[k].trim() );
				optData.setValue( vals[k].trim() );
				optionalData[k] = optData;
			}

			Recipient recipient = new Recipient();
			//recipient.setEmailAddress( records[ i ]);
			recipient.setRecipientId( records[ i ] );
			recipient.setEmailFormat( EmailFormat.NO_FORMAT );
			recipient.setListName( recipient_interact_object );
			
			rData[ i ].setOptionalData( optionalData );
			rData[ i ].setRecipient( recipient );
		}
		
		event.setRecipientData( rData );
		
		response = instance.triggerCustomEvent( event, session.getSessionHeader() );

		return response;
	}

}
