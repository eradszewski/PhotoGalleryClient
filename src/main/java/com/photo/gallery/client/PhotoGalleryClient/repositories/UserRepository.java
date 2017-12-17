package com.photo.gallery.client.PhotoGalleryClient.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.photo.gallery.client.PhotoGalleryClient.model.User;

public interface UserRepository extends CrudRepository<User, Serializable> {
	List<User> findByUsername(String username);

}
