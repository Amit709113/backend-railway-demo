package com.amit.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DempAppApisApplication {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
		SpringApplication.run(DempAppApisApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		 return new ModelMapper();
	}
}
