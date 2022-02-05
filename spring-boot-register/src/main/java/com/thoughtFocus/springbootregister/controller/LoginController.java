package com.thoughtFocus.springbootregister.controller;

import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtFocus.springbootregister.dto.RegisterDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.InvalidUsernameOrPasswordException;
import com.thoughtFocus.springbootregister.service.LoginService;

@RestController
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	LoginService service;

	@GetMapping("/login")
	String loginUser(@RequestParam String username, @RequestParam String password) {
		try {
			if ((username != null && password != null) && (!username.equals("") && !password.equals(""))) {
				return service.getUser(username, password);

			} else {
				throw new InvalidUsernameOrPasswordException("Invalid Username or password");
				
			}
		} catch (InvalidUsernameOrPasswordException e) {
			logger.error(e.getMessage());
			logger.error(e.getClass().getSimpleName());
		}
		return null;
	}



}
