package list;

import session.SessionManage;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis2.*;

import com.rsys.ws.*;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.MergeListMembersRIID;

public class mergeMemberRIID 
{
	
	public MergeListMembersRIIDResponse mergeMember( String folderName, String objectName, String[] fields, List<String[]> values, SessionManage session )
	{
		
		MergeListMembersRIIDResponse mergeResponse = null;
		
		try
		{
			ResponsysWSServiceStub instance = session.getInstance();
			
			MergeListMembersRIID mlmRiid = new MergeListMembersRIID();
			
			InteractObject intObj = session.getInteractObject(  objectName, folderName );
			
			mlmRiid.setList( intObj );
			
			ListMergeRule mlRule = new ListMergeRule();
			mlRule.setHtmlValue("H");
			mlRule.setMatchColumnName1( "EMAIL_ADDRESS_" );
			mlRule.setMatchColumnName2( "MOBILE_NUMBER_" );
			mlRule.setDefaultPermissionStatus( PermissionStatus.OPTIN );
			mlRule.setInsertOnNoMatch(true);
			mlRule.setMatchOperator( MatchOperator.AND );
			mlRule.setOptinValue("I");
			mlRule.setOptoutValue("O");
			mlRule.setUpdateOnMatch( UpdateOnMatch.REPLACE_ALL);
			
			mlmRiid.setMergeRule(mlRule);
			
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
			
		}
		catch( RemoteException remoteEx )
		{
			if (remoteEx instanceof AxisFault) 
			{
		        AxisFault axisFault = (AxisFault) remoteEx;
		        System.out.println("Fault detail element = " + axisFault.getFaultDetailElement().getText());
		    }
	
			System.out.println( "remote exception type : " + remoteEx.getMessage() );
		}
		catch( Exception exception )
		{
			if (exception instanceof AxisFault) 
			{
		        AxisFault axisFault = (AxisFault) exception;
		       System.out.println("Fault detail element = " + axisFault.getFaultDetailElement().getText());
		    }
			else
			{
				System.out.println( this.getClass().toString() + " Generic Exception Caught : " + exception.getMessage() );
			
				//System.out.println( this.getClass().toString() + " Generic Exception cause : " +  exception.getCause().toString() );
			}
		}
		
		return mergeResponse;
	}

}
