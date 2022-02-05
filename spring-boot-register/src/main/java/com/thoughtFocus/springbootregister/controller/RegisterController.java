package com.thoughtFocus.springbootregister.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtFocus.springbootregister.dto.RegisterDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.NullObjectException;
import com.thoughtFocus.springbootregister.service.RegisterService;

@RestController
public class RegisterController {
	private static Logger logger = LoggerFactory.getLogger(RegisterController.class);
	@Autowired
	RegisterService registerService;

	@PostMapping("/save")
	String saveUser(@RequestBody RegisterDTO dto) {
		

		try {
			if (dto != null && !dto.getUsername().equals("") && !dto.getPassword().equals("")) {
				String stored = registerService.saveData(dto);
				return stored;
			} else {
				throw new NullObjectException("Invalid Data entered please enter a valid field");
			}
		} catch (NullObjectException e) {
			logger.error(e.getMessage());

		}

		return "data not saved";
	}

}
