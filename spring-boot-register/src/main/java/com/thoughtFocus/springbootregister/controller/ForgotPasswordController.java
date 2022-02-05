package com.thoughtFocus.springbootregister.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtFocus.springbootregister.dto.UpdatePasswordDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.InvalidUsernameOrPasswordException;
import com.thoughtFocus.springbootregister.exceptions.NullObjectException;
import com.thoughtFocus.springbootregister.service.ForgotPasswordService;

@RestController
public class ForgotPasswordController {
	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordController.class);
	
	@Autowired
	ForgotPasswordService service;
	
	
	
	@PostMapping("/forgotPass")
	String updatePass(@RequestBody UpdatePasswordDTO dto) {
		
		try {
			if (dto!= null && !dto.getPassword().equals("") && !dto.getEmail().equals("")) {
				String updated= service.updatePassword(dto);
				return updated ;

			}
			else {
				throw new InvalidUsernameOrPasswordException("password or email cannot be empty");
			}

			
		} catch (InvalidUsernameOrPasswordException e) {
			logger.error(e.getMessage());
		}
		return "update failed";

	}

}
