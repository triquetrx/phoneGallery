package com.triquetrx.phoneGallery.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repos;
	private List<String> productTypesList = new ArrayList<>();

	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
		productTypesList.add("Phones");
	}

	public List<String> getTypesList() {
		return productTypesList;
	}

	public List<Product> getProducts() {
		return repos.findAll();
	}

	public void addNewProduct(String productName, String productType, String desc, double price, String imageUrl) {
		repos.save(new Product(productName, productType, desc, price, imageUrl));
	}

	public Product getProduct(int id) {
		return repos.findById(id).get();
	}
	
	public void deleteProduct(int id) {
		repos.delete(repos.findById(id).get());
	}

	public void update(int id, String productName, String productType, String desc, double price, String imageUrl) {
		Product product = getProduct(id);
		product.setProductName(productName);
		product.setDesc(desc);
		product.setProductType(productType);
		product.setPrice(price);
		product.setImageUrl(imageUrl);
		repos.save(product);
	}

	@Override
	public String toString() {
		String res = "ProductService [] ProductsList:";
		for (Product data : repos.findAll()) {
			res += data.toString();
		}
		return res;
	}

}
