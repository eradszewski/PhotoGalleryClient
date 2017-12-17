package com.photo.gallery.client.PhotoGalleryClient.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.photo.gallery.client.PhotoGalleryClient.model.Bike;
import com.photo.gallery.client.PhotoGalleryClient.repositories.BikeRepository;
import com.photo.gallery.client.PhotoGalleryClient.service.BikeService;



@RestController
@RequestMapping("/bike")
public class BikeController {
 
	List<Bike> bikes = null;
	@Autowired(required=false)
	private BikeService bikeService;
	private BikeRepository repo;
 
	
	@RequestMapping("/allBikes")
	public List<Bike> getAllBikes() {

		System.out.println(bikeService.getAllBikes());
		return bikeService.getAllBikes();
		
	}
//	@RequestMapping(value = "/createBike", method = RequestMethod.POST)
//	public Bike createBike(@RequestBody Bike bike) {
//		Bike constBike = new Bike("Persistent", "Test");
//		System.out.println("create Bike : " + bike.getModel() + bike.getManufacturer());
//		System.out.println("create cosntBike : " + constBike.getModel() + constBike.getManufacturer());
//		return bikeService.createBike(constBike);
//	}
// 

 

}