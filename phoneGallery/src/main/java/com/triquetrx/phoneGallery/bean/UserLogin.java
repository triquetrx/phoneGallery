package com.triquetrx.phoneGallery.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class UserLogin {
	@Id
	private int user_id;
	private String username;
	private String user_password;
	private String user_role;
	
	
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLogin(int user_id, String username, String user_password, String user_role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.user_password = user_password;
		this.user_role = user_role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
}
