package list;

import session.SessionManage;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis2.*;

import com.rsys.ws.*;
import com.rsys.ws.client.ListFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.MergeListMembersRIID;

public class mergeMemberRIID 
{
	
	public MergeListMembersRIIDResponse mergeMember( InteractObject interact_object, ListMergeRule rule, String[] fields, List<String[]> values, SessionManage session ) throws RemoteException, ListFault, UnexpectedErrorFault
	{
		
		MergeListMembersRIIDResponse mergeResponse = null;

			ResponsysWSServiceStub instance = session.getInstance();
			
			MergeListMembersRIID mlmRiid = new MergeListMembersRIID();

			
			mlmRiid.setList( interact_object );			
			mlmRiid.setMergeRule( rule );
			
			RecordData recordData = new RecordData();
			
			for( String field : fields)
			{
				recordData.addFieldNames( field );
			}
			
			int valuesLength = values.size();
			for( int i = 0; i < valuesLength; i++ )
			{
			//	String innerValue = values.get(i);
				
				Record record = new Record();
				
				String[] arr = values.get(i);
				record.setFieldValues( arr );
				
				recordData.addRecords( record );
				
				/*for( String innerValue : innerValues )
				{
					System.out.println( innerValue );
				}*/
			}
			
			mlmRiid.setRecordData( recordData );
			
			mergeResponse = instance.mergeListMembersRIID( mlmRiid, session.getSessionHeader() );
		
		return mergeResponse;
	}

}
