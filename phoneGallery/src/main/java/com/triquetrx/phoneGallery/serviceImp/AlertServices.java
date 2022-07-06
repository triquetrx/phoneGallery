package com.triquetrx.phoneGallery.serviceImp;

import org.springframework.stereotype.Service;

@Service
public class AlertServices {
	private boolean isAddedToCart = false;
	private boolean isRemoved = false;
	private boolean isContactSaved = false;
	private boolean isProductAdded = false;
	
	public boolean isAddedToCart() {
		return isAddedToCart;
	}
	public void setAddedToCart(boolean isAddedToCart) {
		this.isAddedToCart = isAddedToCart;
	}
	public boolean isRemoved() {
		return isRemoved;
	}
	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}
	public boolean isContactSaved() {
		return isContactSaved;
	}
	public void setContactSaved(boolean isContactSaved) {
		this.isContactSaved = isContactSaved;
	}
	public boolean isProductAdded() {
		return isProductAdded;
	}
	public void setProductAdded(boolean isProductAdded) {
		this.isProductAdded = isProductAdded;
	}
	
}
