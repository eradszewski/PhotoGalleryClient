package com.photo.gallery.client.PhotoGalleryClient;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.photo.gallery.client.PhotoGalleryClient.model.User;
import com.photo.gallery.client.PhotoGalleryClient.repositories.UserRepository;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class PhotoGalleryClientApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationArguments.class);

	public static void main(String[] args) {
		SpringApplication.run(PhotoGalleryClientApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo( UserRepository userRepo) {
		return (args) -> {
			// save a couple of customers

//			userRepo.save(new User("erads", "Erik", "Radszewski", "test"));


			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Bike Bike : bikerepo.findAll()) {
//				log.info(Bike.toString());
//			}
//			log.info("");

//			// fetch an individual customer by ID
//			Customer customer = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(customer.toString());
//			log.info("");
//
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (Customer bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
//			log.info("");
		};
	}
}
