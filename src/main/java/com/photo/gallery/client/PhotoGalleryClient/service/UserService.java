package com.photo.gallery.client.PhotoGalleryClient.service;

import java.util.List;


import com.photo.gallery.client.PhotoGalleryClient.model.User;

public interface UserService {
	
	List<User> getAllUsers();
	
	User getUser(String username);
	
	User createUser(User user);
	
	User updateUser(User user);
	
	boolean authUser(String username, String password);
 
	void deleteUser(String username);

}
