package Day4;

public class User {
	private int  UserId;
	private String UserName;
	private String eMail;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public User(int userId, String userName, String eMail) {
		super();
		UserId = userId;
		UserName = userName;
		this.eMail = eMail;
	}
	

}
