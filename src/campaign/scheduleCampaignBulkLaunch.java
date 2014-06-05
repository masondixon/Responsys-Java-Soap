package campaign;

import session.SessionManage;

import java.rmi.RemoteException;
import java.text.ParseException;

import java.util.Calendar;
import java.util.Date;

import com.rsys.ws.LaunchPreferences;
import com.rsys.ws.ProgressChunk;
import com.rsys.ws.ProofLaunchOptions;
import com.rsys.ws.ProofLaunchType;
import com.rsys.ws.ScheduleCampaignLaunch;
import com.rsys.ws.ScheduleCampaignLaunchResponse;
import com.rsys.ws.client.CampaignFault;
import com.rsys.ws.client.UnexpectedErrorFault;

public class scheduleCampaignBulkLaunch 
{
	
	public ScheduleCampaignLaunchResponse doLaunch( String campaignFolder, String campaignName, Calendar scheduleDate, SessionManage session ) throws RemoteException, CampaignFault, UnexpectedErrorFault, ParseException
	{
		ScheduleCampaignLaunchResponse result = new ScheduleCampaignLaunchResponse();
		ScheduleCampaignLaunch launchObj = new ScheduleCampaignLaunch();
		launchObj.setCampaign( session.getInteractObject( campaignFolder, campaignName ) );
		
		LaunchPreferences launchPrefs = new LaunchPreferences();
		launchPrefs.setEnableLimit( false );
		launchPrefs.setEnableNthSampling( false );
		launchPrefs.setEnableProgressAlerts( false );
		
		ProgressChunk chunk = ProgressChunk.CHUNK_10K;
		
		launchPrefs.setProgressChunk( chunk );
		launchPrefs.setProgressEmailAddresses( "someEmail@developer.com" );
		launchPrefs.setRecipientLimit( 1 );
		launchPrefs.setSamplingNthInterval( 1 );
		launchPrefs.setSamplingNthOffset( 1 );
		launchPrefs.setSamplingNthSelection( 1 );
		
		launchObj.setLaunchPreferences( launchPrefs );
		
		ProofLaunchOptions proofObj = new ProofLaunchOptions();
		proofObj.setProofEmailAddress( "mdixon@responsys.com" );
		proofObj.setProofLaunchType( ProofLaunchType.LAUNCH_TO_ADDRESS_USING_PROOFLIST);
	
		launchObj.setProofLaunchOptions( proofObj );
		
		launchObj.setScheduleDate( scheduleDate );
	
		result = session.getInstance().scheduleCampaignLaunch( launchObj, session.getSessionHeader() );

		return result;
	}
}
