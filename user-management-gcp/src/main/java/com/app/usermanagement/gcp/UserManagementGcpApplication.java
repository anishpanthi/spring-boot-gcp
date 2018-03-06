package com.app.usermanagement.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserManagementGcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementGcpApplication.class, args);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> getHelloGCP(){
		return new ResponseEntity<>("Hello From Google Cloud Platform.", HttpStatus.OK);
	}
}
