package com.client.todolist.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.client.todolist.api.dto.UserDto;
import com.client.todolist.domain.repository.UserRepository;
import com.client.todolist.domain.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto create(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto update(Long id, UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
