package folder;

import session.SessionManage;
import java.rmi.RemoteException;

import com.rsys.ws.*;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;
import com.rsys.ws.ListFoldersResponse;

public class listFolders
{
	public FolderResult[] doListFolders( SessionManage session ) throws RemoteException, UnexpectedErrorFault
	{
		ResponsysWSServiceStub instance = session.getInstance();
		
		ListFolders listFolders = new ListFolders();
		ListFoldersResponse listFoldersResponse = instance.listFolders( listFolders, session.getSessionHeader() );
		
		FolderResult[] folderList = listFoldersResponse.getResult();

		return folderList;	
	}
}
