package com.triquetrx.phoneGallery.serviceImp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.ContactDetails;
import com.triquetrx.phoneGallery.repository.CustomerRepository;

@Service
public class ContactService {
	@Autowired
	CustomerRepository custRepo;
	

	// add new people
	public void addNewContact(String name,String phoneno, String email, boolean updates,String desc) {
		custRepo.save(new ContactDetails(name,phoneno,sqlDate(),email,updates,desc));
	}
	
	public List<ContactDetails> getAllContacts(){
		return custRepo.findAll();
	}
	
	//util.Date to sql.Date
	private java.sql.Date sqlDate() {
		Date date = new Date();
		return new java.sql.Date(date.getTime());
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		custRepo.delete(custRepo.findById(id).get());
	}
}
