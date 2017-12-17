package com.photo.gallery.client.PhotoGalleryClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.photo.gallery.client.PhotoGalleryClient.model.User;
import com.photo.gallery.client.PhotoGalleryClient.repositories.UserRepository;
import com.photo.gallery.client.PhotoGalleryClient.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	List<User> users = null;
	@Autowired(required=false)
	private UserService userService;
	private UserRepository repo;
	
	@RequestMapping("/allUsers")
	public List<User> getAllUsers() {
		
		return userService.getAllUsers();
	}
	@RequestMapping(value = "/authUser", method = RequestMethod.POST)
	public boolean authUser(@RequestBody String username, String password) {
		
		return userService.authUser(username, password);
		
	}

}
