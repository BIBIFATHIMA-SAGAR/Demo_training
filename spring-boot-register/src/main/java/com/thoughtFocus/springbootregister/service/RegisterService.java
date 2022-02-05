package com.thoughtFocus.springbootregister.service;

import com.thoughtFocus.springbootregister.dto.RegisterDTO;
import com.thoughtFocus.springbootregister.entity.RegisterEntity;

public interface RegisterService {
	String saveData(RegisterDTO dto);

}
