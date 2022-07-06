package com.triquetrx.phoneGallery.serviceImp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.ContactDetails;
import com.triquetrx.phoneGallery.repository.CustomerRepository;

@Service
public class ContactService {
	@Autowired
	CustomerRepository custRepo;
	
	private int id;



	// add new people
	public void addNewContact(String name,String phoneno, String email, boolean updates,String desc) {
		this.id=(int)custRepo.count();
		custRepo.save(new ContactDetails(this.id,name,phoneno,sqlDate(),email,updates,desc));
	}
	
	//util.Date to sql.Date
	private java.sql.Date sqlDate() {
		Date date = new Date();
		return new java.sql.Date(date.getTime());
	}
}
