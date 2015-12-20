package org.panda.fw.blank.domain.model;

import java.io.Serializable;

public class Account implements Serializable {

	private String userId = null;
	private String password = null;
	private String userName = null;

	public Account(String userId, String password, String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
