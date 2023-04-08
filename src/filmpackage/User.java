package filmpackage;

public class User extends Generic {

	private int id;
	private String userName;
	private String password;
	private String eMail;

	public User(int id, String userName, String password, String eMail) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
