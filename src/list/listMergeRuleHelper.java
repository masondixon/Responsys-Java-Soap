/**
 * The ListMergeRule object is over complicated so i've broken it out into something that can be used in a modular fashion
 * There are a lot of permutations of this object that can wreak havok with business logic and resulting behavior
 */

package list;

import com.rsys.ws.ListMergeRule;
import com.rsys.ws.MatchOperator;
import com.rsys.ws.PermissionStatus;
import com.rsys.ws.UpdateOnMatch;

public class listMergeRuleHelper
{
	/**
	 * Default permission status is the permission status that a new record gets assigned ( only when its first inserted )
	 * Insert on no match means that if a match is not made to update a record, then insert a new one
	 * Match column 1 is one of the columns from the contact list - NEEDS TO BE INDEXED on the responsys side ( note that most popular fields like EMAIL and RIID are already indexed )
	 * Match column 2 is one of the columns from the contact list - NNEDS TO BE INDEXED on the responsys side ( note that most popular fields like EMAIL and RIID are already indexed )
	 * Match operator can be AND or NONE.  If you use only match column 1, then use NONE.  If you use 2 match columns, use AND.
	 * Reject channel is a parameter that can reject a merge immediately is one of the channels isn't found in the payload ( "E" for email, "M" for Mobile, and "P" for postal maybe? ) can be csv value string so "E,M" or null as well.
	 * @return
	 */
	public ListMergeRule defineListMergeRule( PermissionStatus status, boolean insert_on_no_match, UpdateOnMatch update_type, String match_1, String match_2, MatchOperator conditional_operator, String reject_channel )
	{
		ListMergeRule rule = new ListMergeRule();
		
		rule.setDefaultPermissionStatus( status );

		rule.setInsertOnNoMatch( insert_on_no_match );
		rule.setUpdateOnMatch( update_type );
		
		rule.setMatchColumnName1( match_1 );
		rule.setMatchColumnName2( match_2 );
		rule.setMatchOperator( conditional_operator );
		
		// These values seem to be system defaults
		// I have only seen buggy behavior by NOT using the values below
		rule.setHtmlValue( "H" );
		rule.setTextValue( "T" );
		rule.setOptinValue( "I" );
		rule.setOptoutValue( "O" );
		
		rule.setRejectRecordIfChannelEmpty( reject_channel );
		
		return rule;
	}
}
