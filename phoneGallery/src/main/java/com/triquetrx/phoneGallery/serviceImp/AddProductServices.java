package com.triquetrx.phoneGallery.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddProductServices {
	private List<String> productTypesList = new ArrayList<>();

	public AddProductServices() {
		super();
		productTypesList.add("Phones");
	}
	
	public List<String> getTypesList(){
		return productTypesList;
	}
	
}
