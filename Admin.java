

/**
 * @author d
 * @version 1.0
 * @created 05-Nov-2026 10:13:50 PM
 */
public class Admin {

	private int adminId;
	private String fullName;
	private int password;
	public Jobseeker m_Jobseeker;
	public Vacancy m_Vacancy;
	public Application m_Application;

	public Admin(){

	}

	public void finalize() throws Throwable {

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
	 * @param employerId
	 */
	public void manageEmployer(int employerId){

	}

	/**
	 * 
	 * @param userId
	 */
	public Boolean manageUser(int userId){
		return false;
	}
}//end Admin