package br.edu.univas.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.univas.database.Database;
import br.edu.univas.exception.PostException;
import br.edu.univas.vo.User;

public class PostControllerTest {
	
	private PostController postCtrl = new PostController();
	private String validUsername = "MatheusR";
	private String validContent = "bla bla bla";
	
	@Test
	public void createPost_whenValidParameters_shouldCretaPostSuccessfully() {
		Database.addUser(new User("MatR", "abc123"));
		
		
	}
	
	@Test
	public void createPost_whenNullContent_shouldThrowPostException() {
		Assertions.assertThrows(PostException.class, ()->{
			postCtrl.createPost(validUsername, validContent);
		});
	}
	
	//@Test
	//public void createPost_
	
	
}