package com.photo.gallery.client.PhotoGalleryClient.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.photo.gallery.client.PhotoGalleryClient.model.Bike;

//@RepositoryRestResource(collectionResourceRel = "Bike", path = "bike")
public interface BikeRepository extends CrudRepository<Bike, Serializable> {
	List<Bike> findById(Integer id);
}
