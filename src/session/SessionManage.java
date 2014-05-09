package session;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.rsys.ws.*;
import com.rsys.ws.client.ResponsysWSServiceStub;
import com.rsys.ws.client.UnexpectedErrorFault;

public class SessionManage 
{
	ResponsysWSServiceStub instance;
	SessionHeader sessionHeader;
	String SessionId;
	
	boolean debug;	
	boolean loggedIn = false;

	
	public void setInstanceTimeout( int hours )
	{
		instance._getServiceClient().getOptions().setTimeOutInMilliSeconds( 1000 * 60 * hours );
	}
	
	public SessionHeader getSessionHeader()
	{
		return sessionHeader;
	}
	
	public String getSessionId()
	{
		return SessionId;
	}
	
	public ResponsysWSServiceStub getInstance()
	{
		return instance;
	}
	
	public InteractObject getInteractObject( String listName, String folderName )
	{
		InteractObject intObj = new InteractObject();
		intObj.setObjectName( listName );
		intObj.setFolderName( folderName );
		
		return intObj;
	}
	
	public boolean login( String username, String password, String pod )
	{
		boolean result = false;
		
		try
		{
				SessionId = null;
				
				String endpoint = "https://ws" + pod + ".responsys.net/webservices/services/ResponsysWSService";
				System.out.println(" Starting WebServices Transaction on : " + endpoint );
				instance = new ResponsysWSServiceStub( endpoint );
				instance._getServiceClient().getOptions().setManageSession( true );
				
				Login login = new Login();
				login.setUsername( username );
				login.setPassword( password );
	
				LoginResponse loginResponse = new LoginResponse();
				loginResponse = null;
				loginResponse = instance.login( login );
				
				LoginResult loginResult = new LoginResult();
				loginResult = loginResponse.getResult();
				
				String sessionId = new String();
				sessionId    	 = null;
				sessionId        = loginResult.getSessionId();
				
				if (sessionId != null) 
				{
					SessionId = sessionId;
					sessionHeader = new SessionHeader();
					sessionHeader.setSessionId( sessionId );
					loggedIn = true;
					result   = true;
				}
			
		}
		catch( RemoteException remoteException )
		{
			
			if (remoteException instanceof AxisFault) 
			{
		        AxisFault axisFault = (AxisFault) remoteException;
		       System.out.println("Fault detail element = " + axisFault.toString() );
		    }
			
			System.out.println( "Remote Exception : " +  remoteException.getMessage() );
			
			System.out.println( "Remote Exception cause : " +  remoteException.getCause().toString() );
			
			String cause = remoteException.getCause().toString();
			
			if( cause.toLowerCase().contains( "java.net.socketexception"))
			{	
				System.out.println( "Socket Exception trapped....");
			}
			
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
				System.out.println( "Login : " + this.getClass().toString() + " Generic Exception Caught : " + exception.getMessage() + " - " + exception.getStackTrace().toString() );
			}
		}
		
		return result;
	}
	
	public boolean logout()
	{
		boolean result = false;
		
		try
		{
			Logout logout = new Logout();
			LogoutResponse logoutResponse = new LogoutResponse();
			logoutResponse = this.instance.logout( logout, this.getSessionHeader() );
			result = logoutResponse.getResult();
		}
		catch( RemoteException remoteException )
		{
			System.out.println( "Remote Exception : " +  remoteException.getMessage() );
		} catch (UnexpectedErrorFault e) 
		{
			System.out.println( "UnexpectedErrorFault : " +  e.getFaultMessage().getExceptionCode() );
			e.printStackTrace();
		}
		
		System.out.println( "Logging Out.." + result );
		return result;
	}
	
	
	
	
}
