package com.triquetrx.phoneGallery.serviceImp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.CartProduct;
import com.triquetrx.phoneGallery.repository.ProductRepository;

@Service
public class CartService {

	@Autowired 
	private ProductRepository repos;
	
	private List<CartProduct> cartItems = new ArrayList<>();
	private int id=0;
	
	public List<CartProduct> getCartItems() {
		return cartItems;
	}


	public void addToCart(long id) {
		cartItems.add(new CartProduct(this.id,repos.findById((int) id).get()));
		Logger log = LoggerFactory.getLogger(getClass());
		log.info(cartItems.toString());
		this.id++;
	}
	
	public void deleteFromCart(int id) {
		Iterator<CartProduct> itr = cartItems.iterator();
		while(itr.hasNext()) {
			if(itr.next().getCartItemId()==id) {
				itr.remove();
			}
		}
	}
	
	public double totalValue() {
		Iterator<CartProduct> itr = cartItems.iterator();
		double res = 0;
		while(itr.hasNext()) {
			res+=itr.next().getCartProduct().getPrice();
		}
		return res;
	}


	@Override
	public String toString() {
		return "CartService [cartItems=" + cartItems + "]";
	}
}
