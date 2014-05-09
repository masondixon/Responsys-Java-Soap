package table;

import java.rmi.RemoteException;

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
	
	public MergeIntoProfileExtensionResponse doMergeIntoProfile( String listName, String folderName, String[] fields, String[][] values, QueryColumn column, SessionManage session ) throws RemoteException, UnexpectedErrorFault, ListExtensionFault
	{
		MergeIntoProfileExtensionResponse response = null;

		ResponsysWSServiceStub instance = session.getInstance();
		
		InteractObject intObj = session.getInteractObject( listName, folderName );
		
		MergeIntoProfileExtension mergeObj = new MergeIntoProfileExtension();
		
		String[] fieldNames = new String[ fields.length ];
		Record[] records    = new Record[ values.length ];
		
		RecordData recordData = new RecordData();
		recordData.setFieldNames( fieldNames );
		recordData.setRecords( records );
		
		mergeObj.setInsertOnNoMatch( true );
		mergeObj.setMatchColumn( column );
		mergeObj.setProfileExtension( intObj );
		mergeObj.setRecordData( recordData );
		
		response = instance.mergeIntoProfileExtension( mergeObj, session.getSessionHeader() );

		return response;
		 
	}

}
