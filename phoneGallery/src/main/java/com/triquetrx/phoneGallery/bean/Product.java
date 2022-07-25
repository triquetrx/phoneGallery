package com.triquetrx.phoneGallery.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "Product Name can not be empty")
	private String productName;
	@Column(name = "product_type")
	private String productType;
	@Column(name = "description")
	@NotEmpty(message = "Description can not be empty")
	@Size(min = 4, max = 100, message = "Description should be less than 100 and more than 4")
	private String desc;
	@NotNull(message = "Price can not be empty")
	private double price;
	@Column(name = "image_url")
	@NotNull(message = "Please don't leave url empty")
	private String imageUrl;

	public Product() {
		super();
	}

	public Product(String productName, String productType, String desc, double price, String imageUrl) {
		super();
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String url) {
		this.imageUrl = url;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productType=" + productType + ", desc=" + desc
				+ ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}

}
