package com.triquetrx.phoneGallery.bean;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContactDetails {
	@NotNull(message = "Name can not be blank")
	@Pattern(regexp = "[A-Za-z ]{3,}",message = "Name should only contain alphabets and should of minimum 3 characters")
	private String name;
	@NotNull
	@Pattern(regexp = "[0-9]{10}", message="Phone number should have only digits and should be exactly 10")
	private String phoneno;
	private Date date;
	@Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	@NotEmpty(message = "Email cannot be empty")
	private String email;
	private boolean updates;
	@NotBlank
	@Size(min = 3,message="It should of minimum 3 characters")
	private String desc;
	
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactDetails(String name, String phoneno, Date date, String email, boolean updates, String desc) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.date = date;
		this.email = email;
		this.updates = updates;
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

	public boolean getUpdates() {
		return updates;
	}

	public void setUpdates(boolean updates) {
		this.updates = updates;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ContactDetails [name=" + name + ", phoneno=" + phoneno + ", date=" + date + ", email=" + email
				+ ", updates=" + updates + "]";
	}

}
