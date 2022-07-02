package com.triquetrx.phoneGallery.bean;

import java.util.Date;

public class ContactDetails {
	private String name;
	private String phoneno;
	private Date date;
	private String email;
	
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactDetails(String name, String phoneno, Date date, String email) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.date = date;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactDetails [name=" + name + ", phoneno=" + phoneno + ", date=" + date + ", email=" + email + "]";
	}
}
