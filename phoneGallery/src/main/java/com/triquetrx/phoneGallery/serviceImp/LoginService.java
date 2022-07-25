package com.triquetrx.phoneGallery.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.triquetrx.phoneGallery.bean.UserLogin;
import com.triquetrx.phoneGallery.config.UserData;
import com.triquetrx.phoneGallery.repository.LoginRepository;

@Service
public class LoginService implements UserDetailsService{
	
	@Autowired
	LoginRepository login;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<UserLogin> users = login.findByUsername(username);
		users.orElseThrow(()-> new UsernameNotFoundException("Username not found"));
		return users.map(UserData::new).get();
	}
	
	public void createNewUser(String username, String firstName,String lastName,String password) throws Exception {
		if(login.existsByUsername(username)) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, "Username exists");
		}
		login.save(new UserLogin(username,firstName,lastName,encoder().encode(password),"ROLE_USER",true));
	}
	
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
}
