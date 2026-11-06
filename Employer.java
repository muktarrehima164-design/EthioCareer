

/**
 * @author d
 * @version 1.0
 * @created 05-Nov-2026 10:12:19 PM
 */
public class Employer extends User {

	private String companyAddress;
	private String companyEmail;
	private int companyId;
	private String companyName;
	public Application m_Application;

	public Employer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param jobId
	 * @param jobType
	 */
	public Boolean applyJob(int jobId, String jobType){
		return false;
	}

	/**
	 * 
	 * @param fullName
	 * @param password
	 */
	public Boolean logIn(String fullName, int password){
		return false;
	}

	/**
	 * 
	 * @param companyId
	 * @param companyEmail
	 * @param companyName
	 */
	public Boolean logIn(int companyId, String companyEmail, String companyName){
		return false;
	}

	public void logOut(){

	}

	/**
	 * 
	 * @param jobId
	 * @param jobTitle
	 * @param jobType
	 */
	public Boolean postJob(int jobId, String jobTitle, String jobType){
		return false;
	}

	/**
	 * 
	 * @param fullName
	 * @param password
	 * @param email
	 */
	public Boolean register(String fullName, int password, String email){
		return false;
	}

	/**
	 * 
	 * @param jobId
	 * @param jobTitle
	 */
	public list <jobPost> searchJob(int jobId, String jobTitle){
		return null;
	}

	/**
	 * 
	 * @param fullName
	 * @param password
	 * @param email
	 */
	public Boolean updatePrfile(String fullName, int password, String email){
		return false;
	}

	/**
	 * 
	 * @param fileName
	 */
	public Boolean uploadCv(String fileName){
		return false;
	}

	public list <application> viewApplication(){
		return null;
	}
}//end Employer