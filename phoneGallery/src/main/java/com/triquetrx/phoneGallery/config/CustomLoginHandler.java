package com.triquetrx.phoneGallery.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomLoginHandler implements AuthenticationSuccessHandler{
	
	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String url = null;
		
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for(GrantedAuthority auth:authorities) {
			log.info(auth.getAuthority());
			if(auth.getAuthority().equals("ROLE_ADMIN")) {
				url = "/index-admin";
			} else if(auth.getAuthority().equals("ROLE_USER")) {
				url = "/";
			}
		}
		log.info(url);
		if(url == null) {
			throw new IllegalStateException();
		}
		new DefaultRedirectStrategy().sendRedirect(request, response, url);
	}

}
