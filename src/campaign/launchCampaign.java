package campaign;

import session.SessionManage;

import java.rmi.RemoteException;
import java.text.ParseException;

import com.rsys.ws.LaunchCampaign;
import com.rsys.ws.LaunchCampaignResponse;
import com.rsys.ws.LaunchPreferences;
import com.rsys.ws.ProgressChunk;
import com.rsys.ws.ProofLaunchOptions;
import com.rsys.ws.ProofLaunchType;
import com.rsys.ws.client.CampaignFault;
import com.rsys.ws.client.UnexpectedErrorFault;

public class launchCampaign
{
	
	public LaunchCampaignResponse doLaunch( String campaignFolder, String campaignName, SessionManage session ) throws RemoteException, CampaignFault, UnexpectedErrorFault, ParseException
	{
		LaunchCampaignResponse result = new LaunchCampaignResponse();
		LaunchCampaign launchObj = new LaunchCampaign();
		launchObj.setCampaign( session.getInteractObject( campaignFolder, campaignName ) );
		
		LaunchPreferences launchPrefs = new LaunchPreferences();
		launchPrefs.setEnableLimit( false );
		launchPrefs.setEnableNthSampling( false );
		launchPrefs.setEnableProgressAlerts( false );
		
		ProgressChunk chunk = ProgressChunk.CHUNK_10K;
		
		launchPrefs.setProgressChunk( chunk );
		launchPrefs.setProgressEmailAddresses( "mason.dixon@oracle.com" );
		launchPrefs.setRecipientLimit( 1 );
		launchPrefs.setSamplingNthInterval( 1 );
		launchPrefs.setSamplingNthOffset( 1 );
		launchPrefs.setSamplingNthSelection( 1 );
		
		launchObj.setLaunchPreferences( launchPrefs );
		
		//ProofLaunchOptions proofObj = new ProofLaunchOptions();
		//proofObj.setProofEmailAddress( "mdixon@responsys.com" );
		//proofObj.setProofLaunchType( ProofLaunchType.LAUNCH_TO_ADDRESS_USING_PROOFLIST);
	
		//launchObj.setProofLaunchOptions( proofObj );
	
		result = session.getInstance().launchCampaign( launchObj, session.getSessionHeader() );

		return result;
	}
}
