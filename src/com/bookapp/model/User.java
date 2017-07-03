package com.bookapp.model;

public class User {
	private int id;
	private String userName;
	private String email;
	private String password;
	private int active;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String paasword) {
		this.password = paasword;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", userName=" + userName + ", email=" + email + ", password=" + password + ", active="
				+ active + "]";
	}

}
