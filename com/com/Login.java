package com.com;
// Generated Oct 2, 2018 11:33:41 PM by Hibernate Tools 4.3.5.Final

/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

	private int id;
	private String username;
	private String password;

	public Login() {
	}

	public Login(int id) {
		this.id = id;
	}

	public Login(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
