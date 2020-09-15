package com.josipcode.npspring5tutorial.commands;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class UserCommand {
	
	@NotBlank(message="{blankEmail}")
	@Email
	@Size(min=4, max=250, message="{emailSizeError}")
	private String email;
	
	@NotBlank
	@Size(min=1, max=100)
	private String name;
	
	@NotBlank
	@Size(min=6, max=32)
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
