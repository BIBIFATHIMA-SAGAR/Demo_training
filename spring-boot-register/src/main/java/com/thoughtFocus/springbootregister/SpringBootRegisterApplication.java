package com.thoughtFocus.springbootregister;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SpringBootRegisterApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringBootRegisterApplication.class);

	public static void main(String[] args) {
		System.setProperty("spring.config.name","application-config");
		SpringApplication.run(SpringBootRegisterApplication.class, args);
		logger.info("Hello==========");
		
	}

}
