package com.thoughtFocus.springbootregister.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.thoughtFocus.springbootregister.dto.UpdatePasswordDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.NullObjectException;
import com.thoughtFocus.springbootregister.exceptions.UserNotFoundException;
import com.thoughtFocus.springbootregister.repository.RegisterRepository;

@Service
public class ForgotPasswordServiceImpl implements ForgotPasswordService {
	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordService.class);
	
	@Autowired
	RegisterRepository repo;
	
	
	
	public String updatePassword(UpdatePasswordDTO dto) {
		RegisterEntity entity = null;
		try {
			if (dto != null) {
				entity = repo.getByEmail(dto.getEmail());
				if (entity != null) {
					entity.setPassword(dto.getPassword());
					repo.save(entity);
					logger.info("Password set successfully");
					return entity+" password updated";
				} else {
					logger.info("email not found");
					throw new UserNotFoundException("email not found please enter valid email id");
				}
			} 
		} catch (UserNotFoundException e) {
			logger.error(e.getMessage());
			
		}
		
		return "email not found";

	}

	

}
