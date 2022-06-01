package br.edu.univas.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.univas.exception.UserException;

public class UserControllerTest {
	
	private UserController userCtrl = new UserController();
	private String validUsername = "MatheusR";
	private String validPassword = "abc123";
	
	//@Test
	//public createUser_
	
	@Test
	public void createPost_ifNullUsername_shouldThrowException() {
		Assertions.assertThrows(UserException.class, ()->{
			userCtrl.createUser(validUsername, validPassword);
		});
	}
	
	@Test
	public void createPost_ifEmptyUsername_shouldThrowException() {
		Assertions.assertThrows(UserException.class, ()-> {
			userCtrl.createUser(validUsername, validPassword);
		});
	}
}