package com.triquetrx.phoneGallery.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.Product;

@Service
public class CartService {
	private List<Product> cartItems = new ArrayList<>();
	
	
	public List<Product> getCartItems() {
		return cartItems;
	}


	public void addToCart(int id) {
		ProductService productService = new ProductService();
		cartItems.add(productService.retriveProduct(id));
	}
	
	public void deleteFromCart(int id) {
		Iterator<Product> itr = cartItems.iterator();
		while(itr.hasNext()) {
			if(itr.next().getId()==id) {
				itr.remove();
			}
		}
	}


	@Override
	public String toString() {
		return "CartService [cartItems=" + cartItems + "]";
	}
}
