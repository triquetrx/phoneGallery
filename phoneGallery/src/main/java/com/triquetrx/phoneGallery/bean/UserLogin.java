package com.triquetrx.phoneGallery.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Login")
public @Data @NoArgsConstructor class UserLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@Size(min = 3,message = "Minimum 3 characters")
	private String userFirstName;
	@Size(min = 3,message = "Minimum 3 characters")
	private String userLastName;
	@Size(min = 3,message = "Minimum 3 characters required")
	private String username;
	@Size(min = 4,message = "Minimum 4 characters required")
	private String user_password;
	private String user_role;
	private boolean active;
	
	public UserLogin(String username, String firstName, String lastName,String user_password, String user_role,boolean active) {
		super();
		this.username = username;
		this.userFirstName=firstName;
		this.userLastName=lastName;
		this.user_password = user_password;
		this.user_role = user_role;
		this.active = active;	
	}
	
}
