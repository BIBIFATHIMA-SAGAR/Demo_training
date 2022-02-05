package com.thoughtFocus.springbootregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtFocus.springbootregister.dto.RegisterDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Integer>{
	public RegisterEntity getByUsernameAndPassword(String username, String password);
	
	public RegisterEntity getByEmail(String password);
	public RegisterEntity getByUsername(String username);
	public RegisterEntity getByUsername(RegisterDTO dto);

	public RegisterEntity getByConfirmpass(String confirmpass);

}
