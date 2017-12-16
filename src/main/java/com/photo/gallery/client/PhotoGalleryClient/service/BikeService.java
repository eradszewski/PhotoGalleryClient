package com.photo.gallery.client.PhotoGalleryClient.service;

import java.util.List;

import com.photo.gallery.client.PhotoGalleryClient.model.Bike;
 

public interface BikeService {
 
	List<Bike> getAllBikes();
	
	Bike getBike(Integer bikeId);
	
	Bike createBike(Bike bike);
	
	Bike updateBike(Bike bike);
 
	void deleteBike(Integer bikeId);
 
}