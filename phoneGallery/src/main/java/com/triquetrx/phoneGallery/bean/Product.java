package com.triquetrx.phoneGallery.bean;

public class Product {
	private int id;
	private String productName;
	private String productType;
	private String desc;
	private double price;
	private String imageUrl;

	public Product() {
		super();
	}

	public Product(int id, String productName, String productType, String desc, double price,String imageUrl) {
		super();
		this.id = id;
		this.productName = productName;
		this.productType = productType;
		this.desc = desc;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUrl() {
		return imageUrl;
	}

	public void setUrl(String url) {
		this.imageUrl = url;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productType=" + productType + ", desc=" + desc
				+ ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}

}
