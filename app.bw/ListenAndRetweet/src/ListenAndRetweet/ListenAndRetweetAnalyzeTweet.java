package ListenAndRetweet;

public class ListenAndRetweetAnalyzeTweet{
/****** START SET/GET METHOD, DO NOT MODIFY *****/
	protected long statusId = 0;
	protected long statusid = 0;
	protected String status = "";
	protected String username = "";
	protected String OAuthOwnerName = "";
	protected String trackKeyword = "";
	protected boolean isPositive = false;
	public long getstatusId() {
		return statusId;
	}
	public void setstatusId(long val) {
		statusId = val;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String val) {
		status = val;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String val) {
		username = val;
	}
	public String gettrackKeyword() {
		return trackKeyword;
	}
	public void settrackKeyword(String val) {
		trackKeyword = val;
	}
	public boolean getisPositive() {
		return isPositive;
	}
	public void setisPositive(boolean val) {
		isPositive = val;
	}
/****** END SET/GET METHOD, DO NOT MODIFY *****/
	public ListenAndRetweetAnalyzeTweet() {
	}
	public void invoke() throws Exception {
/* Available Variables: DO NOT MODIFY
	In  : long statusId
	In  : String status
	In  : String username
	In  : String OAuthOwnerName
	In  : String trackKeyword
	Out : boolean isPositive
* Available Variables: DO NOT MODIFY *****/
	if(username.equalsIgnoreCase(OAuthOwnerName) || !status.toLowerCase().contains(trackKeyword.toLowerCase())){ 
		isPositive =  false;
	} else {
		isPositive =  true;
        }	
}
	public long getStatusid() {
			return statusid;
		}
	public void setStatusid(long val) {
			statusid = val;
		}
	public String getStatus() {
			return status;
		}
	public void setStatus(String val) {
			status = val;
		}
	public String getUsername() {
			return username;
		}
	public void setUsername(String val) {
			username = val;
		}
	public String getOAuthOwnerName() {
			return OAuthOwnerName;
		}
	public void setOAuthOwnerName(String val) {
			OAuthOwnerName = val;
		}
	public String getTrackKeyword() {
			return trackKeyword;
		}
	public void setTrackKeyword(String val) {
			trackKeyword = val;
		}
	public boolean isPositive() {
			return isPositive;
		}
	public void setPositive(boolean val) {
			isPositive = val;
		}
}
