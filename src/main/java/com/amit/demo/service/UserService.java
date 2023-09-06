package com.amit.demo.service;

import java.util.List;

import com.amit.demo.payloads.UserDto;

public interface UserService {
	
	UserDto createUser (UserDto userDto);
	UserDto getUser(int id);
	List<UserDto> getAllUser();
	void deleteUser(Integer userId);

}
