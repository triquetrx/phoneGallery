package com.triquetrx.phoneGallery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.triquetrx.phoneGallery.bean.Product;
import com.triquetrx.phoneGallery.repository.CustomerRepository;
import com.triquetrx.phoneGallery.repository.ProductRepository;
import com.triquetrx.phoneGallery.serviceImp.CartService;
import com.triquetrx.phoneGallery.serviceImp.ProductService;

@SpringBootTest
class PhoneGalleryApplicationTests {
	
	@Autowired ProductRepository repo;
	
	@Autowired
	ProductService product;
	
	@Autowired
	CartService cart;
	
	@Autowired
	CustomerRepository contact;
	
	List<Product> result = new ArrayList<>();
	@Test
	void contextLoads() {
	}
	
	@Test
	void findById() {
		repo.findAll().forEach(result::add);
		assertNotNull(result);
//		log.info(repo.findById(2).get().toString());
	}
	
	@Test
	void check() {
		assertNotNull(result);
	}
	
	@Test
	void deleteContact() {
		contact.deleteById(0);
	}
}
