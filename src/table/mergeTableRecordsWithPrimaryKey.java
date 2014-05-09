package table;

import java.rmi.RemoteException;
import java.util.List;
import session.SessionManage;

import com.rsys.ws.*;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.TableFault;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.InteractObject;
import com.rsys.ws.RecordData;
import com.rsys.ws.Record;

public class mergeTableRecordsWithPrimaryKey 
{

	public MergeTableRecordsWithPKResponse doMergeRecords( String tableName, String folderName, String[] fields, List<String[]> values,  SessionManage session ) throws RemoteException, UnexpectedErrorFault, TableFault
	{
		MergeTableRecordsWithPKResponse response = null;
		ResponsysWSServiceStub instance = session.getInstance();
		
		InteractObject intObj = session.getInteractObject( tableName, folderName );
		MergeTableRecordsWithPK mergeObj = new MergeTableRecordsWithPK();
		
		RecordData recordData = new RecordData();
		for( String field : fields)
		{
			recordData.addFieldNames( field );
		}
		
		int valuesLength = values.size();
		
		for( int i = 0; i < valuesLength; i++ )
		{	
			Record record = new Record();
			String[] arr = values.get(i);
			record.setFieldValues( arr );
			recordData.addRecords( record );

		}
		
		mergeObj.setTable( intObj );
		mergeObj.setRecordData( recordData );
		mergeObj.setUpdateOnMatch( UpdateOnMatch.REPLACE_ALL );
		mergeObj.setInsertOnNoMatch(true);
		
		response = instance.mergeTableRecordsWithPK( mergeObj, session.getSessionHeader() );

		return response;
	}

}
