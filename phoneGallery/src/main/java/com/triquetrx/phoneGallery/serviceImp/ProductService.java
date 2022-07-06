package com.triquetrx.phoneGallery.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.repository.ProductRepository;

@Service
public class ProductService{
	
	@Autowired 
	private ProductRepository repos;
	
	private int productId;

	public List<Product> getProducts() {
		return repos.findAll();
	}
	
	public void addNewProduct(String productName, String productType, String desc, double price,String imageUrl) {
		productId=(int)repos.count();
		productId+=1;
		repos.save(new Product(productId,productName,productType,desc,price,imageUrl));
	}

	@Override
	public String toString() {
		String res = "ProductService [] ProductsList:";
		for(Product data:repos.findAll()) {
			res+=data.toString();
		}
		return res;
	}
	
}
