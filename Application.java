

/**
 * @author d
 * @version 1.0
 * @created 05-Nov-2026 10:07:13 PM
 */
public class Application {

	private int applicatioDate;
	private int applicationId;
	private String applicationStatus;
	public Vacancy m_Vacancy;

	public Application(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param applicationId
	 */
	public Boolean acceptApplication(int applicationId){
		return false;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public Boolean rejectApplication(int applicationId){
		return false;
	}

	/**
	 * 
	 * @param jobsekeerId
	 * @param jobId
	 * @param cvId
	 */
	public Boolean submitApplication(int jobsekeerId, int jobId, int cvId){
		return false;
	}

	/**
	 * 
	 * @param applicationId
	 */
	public list <application> viewApplication(int applicationId){
		return null;
	}
}//end Application