package com.amit.demo.service.impl;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.demo.entity.User;
import com.amit.demo.payloads.UserDto;
import com.amit.demo.repo.UserRepo;
import com.amit.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private ModelMapper model;
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user = this.model.map(userDto, User.class);
		User save = this.userRepo.save(user);
		return this.model.map(save, UserDto.class);
	}

	@Override
	public UserDto getUser(int id) {
		User user=this.userRepo.findById(id).orElseThrow();
		return this.model.map(user, UserDto.class);
		// TODO Auto-generated method stub
	}

	@Override
	public List<UserDto> getAllUser() {
		List<User> list = this.userRepo.findAll();
		List<UserDto> collect = list.stream().map((u)->this.model.map(u, UserDto.class)).collect(Collectors.toList());
		return collect;
	}

}
