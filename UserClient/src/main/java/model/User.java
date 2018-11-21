package model;

public class User {
	private int userID;
	private String userName, password;

	public User(int userID, String userName, String password) {
		this.userID = userID;
		this.userName = userName;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

}
