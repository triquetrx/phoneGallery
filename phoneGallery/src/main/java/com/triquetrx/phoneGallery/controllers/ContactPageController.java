package com.triquetrx.phoneGallery.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.triquetrx.phoneGallery.bean.ContactDetails;
import com.triquetrx.phoneGallery.serviceImp.AlertServices;
import com.triquetrx.phoneGallery.serviceImp.ContactService;

@Controller
public class ContactPageController {

	@Autowired
	private ContactService contactService;
	@Autowired
	private AlertServices alert;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contactFormPage(ModelMap model) {
		model.put("contactData", new ContactDetails());
		model.addAttribute("isSuccess", alert.isContactSaved());
		return "contact";
	}

	@RequestMapping(value ="/contact", method = RequestMethod.POST)
	public String contactFormSubmit(ModelMap model, @Valid @ModelAttribute("contactData")ContactDetails contactData, BindingResult result) {
		if (result.hasErrors()) {
			return "contact";
		}
		Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
		contactService.addNewContact(contactData.getName(), contactData.getPhoneno(), contactData.getEmail(), contactData.getUpdates(),
				contactData.getDesc());
		log.info(contactService.toString());
		alert.setContactSaved(true);
		return "redirect:contact";
	}
}
