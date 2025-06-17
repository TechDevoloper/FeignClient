package com.feign.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.spring.model.Post;
import com.feign.spring.service.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService postservice;
	
	@GetMapping("/posts")
	public List<Post>getAllPost(){
		return postservice.getPost();
	}
	

}
