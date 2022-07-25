package com.triquetrx.phoneGallery.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.triquetrx.phoneGallery.bean.UserLogin;
import com.triquetrx.phoneGallery.serviceImp.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService login;
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.GET)
	public String signup(ModelMap model) {
		model.put("newUser", new UserLogin());
		return "signup";
	}
	
	@RequestMapping(value="signup",method = RequestMethod.POST)
	public String newUser(ModelMap model,@Valid @ModelAttribute("newUser") UserLogin user,BindingResult result) throws Exception {
		if(result.hasErrors()) {
			return "signup";
		}
		login.createNewUser(user.getUsername(), user.getUserFirstName(), user.getUserLastName(), user.getUser_password());
		return "redirect:login";
	}
	
}
