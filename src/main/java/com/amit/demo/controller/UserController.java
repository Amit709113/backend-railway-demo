package com.amit.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.payloads.UserDto;
import com.amit.demo.service.UserService;

@RestController
@RequestMapping("/api/demo/")
@CrossOrigin(origins ="*")
public class UserController {
	
	@GetMapping
	ResponseEntity<String> methodTesting(){
		return new ResponseEntity<String>(new String("put mapping is working"),HttpStatus.OK);
	}
	
}
