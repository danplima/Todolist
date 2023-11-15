package com.client.todolist.domain.service;

import java.util.List;

import com.client.todolist.api.dto.UserDto;

public interface UserService {
	
	List<UserDto> findAll();
	
	UserDto findById(Long id);
	
	UserDto create(UserDto dto);
	
	UserDto update(Long id, UserDto dto);
	
	void delete(Long id);
}
