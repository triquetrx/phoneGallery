package com.triquetrx.phoneGallery.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.bean.UserLogin;
import com.triquetrx.phoneGallery.serviceImp.ContactService;
import com.triquetrx.phoneGallery.serviceImp.LoginService;
import com.triquetrx.phoneGallery.serviceImp.ProductService;

@Controller
public class AdminController {

	@Autowired
	LoginService login;

	@Autowired
	ContactService contact;

	@Autowired
	private ProductService products;
	
	private boolean isDeleted=false;

	@RequestMapping(value = { "index-admin" })
	public String welcomePageAdmin(ModelMap model) {
		model.put("productList", products);
		model.put("isDeleted", isDeleted);
		model.addAttribute("product", new Product());
		return "index-admin";
	}

	@RequestMapping("admin-users")
	public String adminNewUser(ModelMap model) {
		model.put("newAdminUser", new UserLogin());
		model.put("isUserCreated", false);
		return "admin-users";
	}

	@RequestMapping(value = "admin-users", method = RequestMethod.POST)
	public String createAdminUser(ModelMap model, @ModelAttribute("newAdminUser") @Valid UserLogin user,
			BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return "admin-users";
		}
		login.createNewAdmin(user.getUsername(), user.getUserFirstName(), user.getUserLastName(),
				user.getUser_password());
		model.put("isUserCreated", true);
		return "admin-users";
	}

	@RequestMapping(value = "/contacted", method = RequestMethod.GET)
	public String contacted(ModelMap model) {
		model.put("custList", contact.getAllContacts());
		return "contacted";
	}

	@RequestMapping("/completed")
	public String completed(@RequestParam("id") int id) {
		contact.delete(id);
		return "redirect:contacted";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam("id") int id, ModelMap model) {
		model.put("product", products.getProduct(id));
		model.put("productList", products.getTypesList());
		return "edit";
	}

	@RequestMapping(value="/edit",method = RequestMethod.POST)
	public String edited(ModelMap model, @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "edit";
		}
		products.update(product.getId(), product.getProductName(), product.getProductType(), product.getDesc(),
				product.getPrice(), product.getImageUrl());
		return "redirect:index-admin";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id, ModelMap model) {
		isDeleted = true;
		products.deleteProduct(id);
		return "redirect:index-admin";
	}

}
