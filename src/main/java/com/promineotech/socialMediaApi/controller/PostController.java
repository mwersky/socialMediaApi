package com.promineotech.socialMediaApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springFramework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annottaion.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.socialMediaApi.entity.Post;
import com.promineotech.socialMediaApi.service.PostService;

@RestController
@RequestMapping("/users/{userId}/posts")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getAllPosts() {
		return new ResponseEntity<Object>(service.getAllPosts(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/{postId}", method=RequestMethod.GET)
	public ResponseEntity<Object> getPost(@PathVariable Long postId) {
		return new ResponseEntity<Object>(service.getPost(postId), httpStatus.OK);
	}
	
	@RequestMapping(value="/{postId}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updatePost(@RequestBody Post post, @PathVariable Long postId) {
		try {
			return new ResponseEntity<Object>(service.updatePost(post, id), HttopStatus.OK);			
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(method=RequestMehtod.POST)
	public ResponseEntity<Object> createPost(@RequestBody Post post, @PathVariable Long postId) {
		try {
			return new ResponseEntity<Object>(service.createPost(post, userId), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
