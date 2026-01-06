package com.tcs.RCS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class RCSApplication {

	public static void main(String[] args) {
		SpringApplication.run(RCSApplication.class, args);
	}

}
