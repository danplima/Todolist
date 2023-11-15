package com.client.todolist.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	
	private Long id;
	private String name;
	private String email;
	@JsonIgnore
	private String password;
	
	public void setPassword(String password) {
		this.password = password;
	}

}
