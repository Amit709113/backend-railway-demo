package com.amit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.entity.User;
import com.amit.demo.payloads.UserDto;
import com.amit.demo.service.UserService;

@RestController
@RequestMapping("/demo/api/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/amit/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto createUser = this.userService.createUser(userDto);
		System.out.println("i am at post mapping "+userDto.toString());
		return new ResponseEntity<UserDto>(createUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Integer userId){
		UserDto user = this.userService.getUser(userId);

		System.out.println("i am at get mapping "+user.toString());
		return new ResponseEntity<UserDto>(user,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser(){
		List<UserDto> allUser = this.userService.getAllUser();
		UserDto user=new UserDto();
		user.setEmail("preity@gmail.com");
		user.setName("priety singh");
		UserDto createUser = this.userService.createUser(user);
		
		

		System.out.println("i am at get all mapping ");
		
		
		return new ResponseEntity<List<UserDto>>(allUser,HttpStatus.CREATED);
	}
	
	

}
