package com.triquetrx.phoneGallery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.service.ProductService;

@Controller
public class WelcomeController {
	
	@Autowired
	private ProductService products;
	
	@RequestMapping(value={"","welcome","index"})
	public String welcomePage(ModelMap model) {
		model.put("productList",products);
		model.addAttribute("product",new Product());
		return "index";
	}
	
}
