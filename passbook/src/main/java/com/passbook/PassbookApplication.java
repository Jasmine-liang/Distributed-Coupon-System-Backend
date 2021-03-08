package com.passbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan({"com.passbook.controller", "com.passbook.service","com.passbook.vo"})
public class PassbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassbookApplication.class, args);
	}

}
