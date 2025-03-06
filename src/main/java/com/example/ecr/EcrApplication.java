package com.example.ecr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcrApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to Listowel's ECR!";
	}

}
