package com.thoughtFocus.springbootregister.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UpdatePasswordDTO {
	private String email;
	private String password;

}
