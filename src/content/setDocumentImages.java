package content;

import session.SessionManage;

import com.rsys.ws.*;
import com.rsys.ws.client.DocumentFault;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;

import java.io.File;
import java.io.IOException;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

public class setDocumentImages 
{
	
	public SetDocumentImagesResponse doSetImages(String folderName, String documentName, String[] filePaths, SessionManage session ) throws DocumentFault, UnexpectedErrorFault, IOException 
	{
		SetDocumentImagesResponse response = null;
		
		int length = filePaths.length;
		
		ImageData[] images = new ImageData[ length ];
		
		int counter = 0;
		
		for( String path : filePaths )
		{
			
			FileDataSource data_source  =  new FileDataSource( path );
			DataHandler data_handler = new DataHandler( data_source );
			File file = new File( path );
			
			images[ counter ] = new ImageData();
			images[ counter ].setImage( data_handler );
			images[ counter ].setImageName( file.getName() );
			
			counter++;
		}
		
		InteractObject intObj = session.getInteractObject(documentName, folderName);
		
		ResponsysWSServiceStub instance = session.getInstance();
		
		SetDocumentImages doc_images = new SetDocumentImages();
		doc_images.setDocument( intObj );
		doc_images.setImageData( images );
		
		response = instance.setDocumentImages( doc_images, session.getSessionHeader() );
		
		return response;
	}	
	
}
