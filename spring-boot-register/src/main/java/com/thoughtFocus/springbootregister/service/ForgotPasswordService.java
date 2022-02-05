package com.thoughtFocus.springbootregister.service;

import org.springframework.stereotype.Service;

import com.thoughtFocus.springbootregister.dto.UpdatePasswordDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;


public interface ForgotPasswordService {

	String updatePassword(UpdatePasswordDTO dto);

}
