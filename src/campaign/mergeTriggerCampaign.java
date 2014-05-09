package campaign;

import session.SessionManage;
import java.rmi.RemoteException;
import java.util.List;

import com.rsys.ws.client.TriggeredMessageFault;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.OptionalData;
import com.rsys.ws.ListMergeRule;
import com.rsys.ws.InteractObject;
import com.rsys.ws.MergeTriggerEmail;
import com.rsys.ws.MergeTriggerEmailResponse;
import com.rsys.ws.TriggerData;
import com.rsys.ws.RecordData;
import com.rsys.ws.Record;
import com.rsys.ws.client.ResponsysWSServiceStub;

public class mergeTriggerCampaign
{
	public MergeTriggerEmailResponse mergeAndSend( InteractObject campaignObject, String[] fields, List<String[]> data, List<String[]> optionals, ListMergeRule list_merge_rule, SessionManage session ) throws RemoteException, UnexpectedErrorFault, TriggeredMessageFault
	{
		Record[] records = new Record[ data.size() ];
		
		TriggerData[] triggerData = null;
		triggerData = new TriggerData[ data.size() ];
		
		OptionalData[] optionalData = null;
		optionalData = new OptionalData[ optionals.size() ];
		
		for( int d = 0; d < data.size(); d++ )
		{
			
			Record rec = new Record();
			rec.setFieldValues( data.get(d) );
			records[d] = rec;
			
			for( int f = 0; f < optionals.size() ; f++ )
			{
				String[] optionalDataPair = optionals.get(f);
				
				optionalData[f] = new OptionalData();
				optionalData[f].setName(  optionalDataPair[0] );
				optionalData[f].setValue( optionalDataPair[1] );
			}
			
			triggerData[d] = new TriggerData();
			triggerData[d].setOptionalData( optionalData );
		}
		
		RecordData recordData = new RecordData();
		recordData.setFieldNames( fields );
		recordData.setRecords( records );
		
		MergeTriggerEmail triggerEmail = new MergeTriggerEmail();
		triggerEmail.setCampaign(campaignObject);
		triggerEmail.setRecordData( recordData );
		triggerEmail.setTriggerData( triggerData );
		triggerEmail.setMergeRule( list_merge_rule );
		
		ResponsysWSServiceStub instance = session.getInstance();
		MergeTriggerEmailResponse result = new MergeTriggerEmailResponse();
		result  = instance.mergeTriggerEmail( triggerEmail, session.getSessionHeader() );
		
		return result;
	}
}
