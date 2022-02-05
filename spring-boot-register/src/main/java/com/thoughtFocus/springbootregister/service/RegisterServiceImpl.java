package com.thoughtFocus.springbootregister.service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtFocus.springbootregister.SpringBootRegisterApplication;
import com.thoughtFocus.springbootregister.dto.RegisterDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.PasswordMissMatchException;
import com.thoughtFocus.springbootregister.exceptions.UserAlreadyExistsException;
import com.thoughtFocus.springbootregister.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {
	private static Logger logger = LoggerFactory.getLogger(RegisterServiceImpl.class);
	@Autowired
	RegisterRepository repo;

	@Override
	public String saveData(RegisterDTO dto) {
		RegisterEntity entity = repo.getByUsername(dto.getUsername());

		try {

			if (entity != null) {
				throw new UserAlreadyExistsException(entity.getUsername() + " user already exist");

			}

			else {
				if (dto.getPassword().equals(dto.getConfirmpass())) {
					RegisterEntity entity1 = new RegisterEntity();
					BeanUtils.copyProperties(dto, entity1);
					repo.save(entity1);
					logger.info("data saved successfully " + dto.getUsername());
					return "data saved";
				} else {
					logger.info("Failed to save data \n Password and Confirm password did not match");
					return "Password and confirm password did not match";
				}
			}

		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return "data not saved";

	}
}