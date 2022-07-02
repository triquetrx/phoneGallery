package com.triquetrx.phoneGallery.controllers;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.triquetrx.phoneGallery.bean.ContactDetails;
import com.triquetrx.phoneGallery.service.ContactService;

@Controller
public class ContactPageController {
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping(value = {"contact-form","contact"}, method=RequestMethod.GET)
	public String contactFormPage(ModelMap model) {
		model.put("contact", new ContactDetails());
		return "contact";
	}
	
	@RequestMapping(value = {"contact-form","contact"}, method=RequestMethod.POST)
	public String contactFormSubmit(ModelMap model,ContactDetails contact,BindingResult result) {
		if(result.hasErrors()) {
			return "contact";
		}
		Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
		contactService.addNewContact(contact.getName(), contact.getPhoneno(), contact.getEmail());
		log.info(contactService.toString());
		return "success";
	}
	
	@RequestMapping(value="/success")
	private String successPage() {
		return "success";
	}
}
