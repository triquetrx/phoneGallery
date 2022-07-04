package com.triquetrx.phoneGallery.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.triquetrx.phoneGallery.service.CartService;

@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping("cart")
	public String loadCart(ModelMap model) {
		model.put("cartList", cartService.getCartItems());
		return "cart";
	}

	@RequestMapping(value = "addToCart", method = RequestMethod.GET)
	public String addToCart(ModelMap model, @RequestParam int id) {
		cartService.addToCart(id);
		Logger log = LoggerFactory.getLogger(getClass());
		log.info("Product added to the cart");
		return "redirect:index";
	}

	@RequestMapping(value = "delete-from-cart", method = RequestMethod.GET)
	public String deleteFromCart(ModelMap model, @RequestParam int id) {
		cartService.deleteFromCart(id);
		Logger log = LoggerFactory.getLogger(getClass());
		log.info("Product Deleted with id="+id);
		return "redirect:cart";
	}
}
