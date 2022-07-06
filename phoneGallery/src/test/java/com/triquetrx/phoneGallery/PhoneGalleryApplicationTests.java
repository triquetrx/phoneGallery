package com.triquetrx.phoneGallery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.triquetrx.phoneGallery.bean.CartProduct;
import com.triquetrx.phoneGallery.bean.Product;
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
	void idea() {		
		product.getProducts();
	}
	
	@Test
	void check2() {
		idea();
		assertNotNull(product.getProductList());
		Logger log = LoggerFactory.getLogger(getClass());
		log.info("Test Run "+product.getProductList().get(1).getPrice());
	}

}
