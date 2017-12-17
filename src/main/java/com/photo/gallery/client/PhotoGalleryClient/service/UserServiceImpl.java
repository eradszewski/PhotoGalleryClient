package com.photo.gallery.client.PhotoGalleryClient.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photo.gallery.client.PhotoGalleryClient.model.User;
import com.photo.gallery.client.PhotoGalleryClient.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAllUsers() {
		List<User> bikes = new ArrayList<User>();
		Iterator<User> iterator = userRepo.findAll().iterator();
		while (iterator.hasNext()) {
			bikes.add(iterator.next());
		}
 
		return bikes;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return (User) userRepo.findByUsername(user.getUsername());
	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean authUser(String username, String password) {
		List<User> userList = userRepo.findByUsername(username);
		if(userList.size() == 1) {
			if(userList.get(0).getPassword() == password ) {
				return true;
			}
		}
		return false;
	}

}
