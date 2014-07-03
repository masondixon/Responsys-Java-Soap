package table;

import java.rmi.RemoteException;
import java.util.List;

import session.SessionManage;

import com.rsys.ws.*;
import com.rsys.ws.client.ListExtensionFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.InteractObject;
import com.rsys.ws.RecordData;
import com.rsys.ws.Record;
import com.rsys.ws.MergeIntoProfileExtension;
import com.rsys.ws.MergeIntoProfileExtensionResponse;

public class mergeProfileExtensionRecord 
{
	
	public MergeIntoProfileExtensionResponse doMergeIntoProfile( String listName, String folderName, String[] fields, List<String[]> values, QueryColumn column, UpdateOnMatch update, SessionManage session ) throws RemoteException, UnexpectedErrorFault, ListExtensionFault
	{
		MergeIntoProfileExtensionResponse response = null;

		ResponsysWSServiceStub instance = session.getInstance();
		
		InteractObject intObj = session.getInteractObject( folderName, listName  );
		
		MergeIntoProfileExtension mergeObj = new MergeIntoProfileExtension();
		
		Record[] records    = new Record[ values.size() ];
		
		int cnt = 0;
		for( String[] value : values )
		{
			Record record = new Record();
			record.setFieldValues( value );
			records[ cnt ] = record;
			cnt++;
		}
		
		RecordData recordData = new RecordData();
		recordData.setFieldNames( fields );
		recordData.setRecords( records );
		
		mergeObj.setInsertOnNoMatch( true );
		mergeObj.setUpdateOnMatch( update );
		mergeObj.setMatchColumn( column );
		mergeObj.setProfileExtension( intObj );
		mergeObj.setRecordData( recordData );
		
		response = instance.mergeIntoProfileExtension( mergeObj, session.getSessionHeader() );

		return response;
		 
	}

}
