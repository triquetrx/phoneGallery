package com.triquetrx.phoneGallery;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.repository.ProductRepository;
import com.triquetrx.phoneGallery.serviceImp.ProductService;

@SpringBootTest
class PhoneGalleryApplicationTests {
	
	@Autowired ProductRepository repo;
	
	@Autowired
	ProductService product;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void AddProducts() {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Samsung Galaxy Xcover6 Pro","Phone","Android 12, One UI 4.1 with Qualcomm SM7325 Snapdragon 778G 5G (6 nm)",30000.00,"https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-xcover6-pro-r.jpg"));
		products.add(new Product("Nothing phone (1)","Phone","Android 12, Nothing OS, Snapdragon 778G+ 5G (6 nm)",31000.00,"https://fdn2.gsmarena.com/vv/bigpic/nothing-phone-1.jpg"));
		products.add(new Product("Nokia G11 Plus","Phone","Android 12 with Unisoc T606 (12 nm)",15000.00,"https://fdn2.gsmarena.com/vv/bigpic/nokia-g11-plus.jpg"));
		products.add(new Product("Google Pixel 6 Pro","Phone","Android 12 with Google Tensor (5 nm)",73000.00,"https://fdn2.gsmarena.com/vv/bigpic/google-pixel-6-pro.jpg"));
		products.add(new Product("OnePlus Nord N20 5G","Phone","Android 11, OxygenOS 11 with Qualcomm SM6375 Snapdragon 695 5G (6 nm)",21000.00,"https://fdn2.gsmarena.com/vv/bigpic/oneplus-nord-n20-5g-.jpg"));
		products.add(new Product("Apple iPhone 13","Phone","iOS 15 with Apple A15 Bionic (5 nm)",70000.00,"https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-13.jpg"));
		products.add(new Product("Sony Xperia Pro-I","Phone","Android 11 with Qualcomm SM8350 Snapdragon 888 5G (5 nm)",69000.00,"https://fdn2.gsmarena.com/vv/bigpic/sony-xperia-pro-i.jpg"));
		products.add(new Product("BlackBerry KEY LE","Phone","Android 8.1 (Oreo) with Qualcomm SDM636 Snapdragon 636 (14 nm)",40000.00,"https://fdn2.gsmarena.com/vv/bigpic/blackberry-key2-le-.jpg"));
		products.add(new Product("Apple iPhone 12 Pro","Phone","iOS 14.1, up to iOS 15.5, planned upgrade to iOS 16 with Apple A14 Bionic (5 nm)",65000.00,"https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-12-pro--.jpg"));
		
		for(Product product:products) {
			repo.save(product);
		}
	}
	
//	@Test
//	void deleteAll() {
//		repo.deleteAll();
//	}
}
