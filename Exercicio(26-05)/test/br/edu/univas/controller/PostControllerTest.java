package br.edu.univas.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.edu.univas.exception.PostException;

public class PostControllerTest {
	
	private PostController postCtrl = new PostController();
	
	@Test
	public void createPost_nullUsername_shouldThrowException() {
		String username = null;
		String content = "abc";
		
		Assertions.assertThrows(PostException.class, ()->{
			postCtrl.createPost(username, content);
		});
	}
	
	//@Test
	//public void createPost_
	
	
}