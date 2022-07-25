package com.triquetrx.phoneGallery.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.triquetrx.phoneGallery.serviceImp.LoginService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Autowired
	AuthenticationSuccessHandler successHandler;
	@Autowired
	LoginService login;

	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity https) throws Exception {
		https.authorizeRequests()
		.antMatchers("/").hasAnyRole("USER","ADMIN")
		.antMatchers("/admin-add-product").hasRole("ADMIN")
		.antMatchers("/login").permitAll()
		.and().formLogin().loginPage("/login").successHandler(successHandler)
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		
		return https.build();
	}
	
	protected void config(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(login);
	}
	
	@Bean
	protected PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}
