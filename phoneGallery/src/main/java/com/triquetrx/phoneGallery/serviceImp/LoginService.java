package com.triquetrx.phoneGallery.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triquetrx.phoneGallery.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository login;
	
}
