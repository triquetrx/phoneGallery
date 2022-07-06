package com.triquetrx.phoneGallery.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.serviceImp.AddProductServices;
import com.triquetrx.phoneGallery.serviceImp.AlertServices;
import com.triquetrx.phoneGallery.serviceImp.ProductService;

@Controller
public class WelcomeController {

	@Autowired
	private ProductService products;
	@Autowired
	private AlertServices alert;
	@Autowired
	private AddProductServices productList;

	@RequestMapping(value = { "", "welcome", "index" })
	public String welcomePage(ModelMap model) {
		model.put("productList", products);
		model.put("isAddedToCart",alert.isAddedToCart());
		model.addAttribute("product", new Product());
		return "index";
	}

	@RequestMapping(value = "admin-add-product", method = RequestMethod.GET)
	public String addNewProductPage(ModelMap map) {
		map.put("product", new Product());
		map.put("isProductAdded", alert.isProductAdded());
		return "add-products";
	}

	@RequestMapping(value = "admin-add-product", method = RequestMethod.POST)
	public String addNewProduct(ModelMap map, @ModelAttribute("product") @Valid Product products,
			BindingResult result) {
		if (result.hasErrors()) {
			return "add-products";
		}
		alert.setProductAdded(true);
		this.products.addNewProduct(products.getProductName(), products.getProductType(), products.getDesc(),
				products.getPrice(), products.getImageUrl());
		Logger log = LoggerFactory.getLogger(getClass());
		log.info(this.products.toString());
		return "redirect:admin-add-product";
	}
	
	@ModelAttribute("productList")
	public List<String> productList(){
		return productList.getTypesList();
	}

}
