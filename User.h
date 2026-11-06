

/**
 * @author d
 * @version 1.0
 * @created 05-Nov-2026 9:40:29 PM
 */
public class User extends Jobseeker {

	protected String email;
	protected String fullName;
	private int password;
	protected int userId;

	public User(){

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

	public void logOut(){

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
}//end User