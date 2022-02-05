package com.thoughtFocus.springbootregister.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtFocus.springbootregister.entity.RegisterEntity;
import com.thoughtFocus.springbootregister.exceptions.UserNotFoundException;
import com.thoughtFocus.springbootregister.repository.RegisterRepository;

@Service
public class LoginServiceImpl implements LoginService {
	private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
	@Autowired
	RegisterRepository repo;

	public String getUser(String username, String password) {
		RegisterEntity reg = null;
		try {

			reg = repo.getByUsernameAndPassword(username, password);
			if (reg != null) {
				logger.info("log in successfull");
				return reg + "logged in successfully";
			} else {
				logger.error("log in failed");
				throw new UserNotFoundException("User not found");

			}
		} catch (UserNotFoundException e) {
			logger.error(e.getMessage());
			logger.error(e.getClass().getSimpleName());
		}
		return "log in failed";

	}

}
