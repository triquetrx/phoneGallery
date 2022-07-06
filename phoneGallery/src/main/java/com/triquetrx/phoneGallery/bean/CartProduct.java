package com.triquetrx.phoneGallery.bean;

public class CartProduct {
	private int cartItemId;
	private Product cartProduct;

	public CartProduct(int cartItemId, Product cartProduct) {
		super();
		this.cartItemId = cartItemId;
		this.cartProduct = cartProduct;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Product getCartProduct() {
		return cartProduct;
	}

	public void setCartProduct(Product cartProduct) {
		this.cartProduct = cartProduct;
	}

	@Override
	public String toString() {
		return "CartProduct [cartItemId=" + cartItemId + ", cartProduct=" + cartProduct + "]";
	}

}
