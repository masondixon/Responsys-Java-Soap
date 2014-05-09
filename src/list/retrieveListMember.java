package list;

import java.rmi.RemoteException;

import session.SessionManage;

import com.rsys.ws.InteractObject;
import com.rsys.ws.QueryColumn;
import com.rsys.ws.RetrieveListMembers;
import com.rsys.ws.RetrieveListMembersResponse;
import com.rsys.ws.client.ListFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;

public class retrieveListMember
{
	
	public RetrieveListMembersResponse retrieveContactListRecords( String folderName, String objectName, QueryColumn queryColumn, String[] fields, String[] ids_to_retrieve, SessionManage session ) throws RemoteException, ListFault, UnexpectedErrorFault
	{
		RetrieveListMembersResponse response = null;
		RetrieveListMembers retrieve_object  = new RetrieveListMembers();
		ResponsysWSServiceStub instance = session.getInstance(); 
		InteractObject interact_object  = session.getInteractObject( objectName, folderName );
		
		retrieve_object.setList( interact_object );
		retrieve_object.setFieldList( fields );
		retrieve_object.setIdsToRetrieve( ids_to_retrieve );
		retrieve_object.setQueryColumn( queryColumn );

		response = instance.retrieveListMembers( retrieve_object, session.getSessionHeader() );
		
		return response;
	}

}
