package content;

import java.rmi.RemoteException;
import session.SessionManage;

import com.rsys.ws.ListContentLibraryFolders;
import com.rsys.ws.ListContentLibraryFoldersResponse;
import com.rsys.ws.client.FolderFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;

public class listContentLibraryFolderContents 
{
	public ListContentLibraryFoldersResponse listFolderContents( String path, Boolean showTree, SessionManage session ) throws RemoteException, FolderFault, UnexpectedErrorFault
	{
		ListContentLibraryFolders listContent_object = new ListContentLibraryFolders();
		listContent_object.setShowTree( showTree );
		listContent_object.setStartingPath( path );
		
		ResponsysWSServiceStub instance = session.getInstance();
		ListContentLibraryFoldersResponse response = instance.listContentLibraryFolders( listContent_object, session.getSessionHeader() );
		
		return response;
	}
}
