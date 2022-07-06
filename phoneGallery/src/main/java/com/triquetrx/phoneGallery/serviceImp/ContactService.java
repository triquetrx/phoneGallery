package com.triquetrx.phoneGallery.serviceImp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.ContactDetails;

@Service
public class ContactService {
	private List<ContactDetails> contactList = new ArrayList<>();
	



	// add new people
	public void addNewContact(String name,String phoneno, String email, boolean updates,String desc) {
		contactList.add(new ContactDetails(name,phoneno,new Date(),email,updates,desc));
	}




	@Override
	public String toString() {
		return "ContactService [contactList=" + contactList + "]";
	}
}
