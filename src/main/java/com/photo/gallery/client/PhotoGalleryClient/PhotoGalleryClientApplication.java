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

import com.photo.gallery.client.PhotoGalleryClient.model.Bike;
import com.photo.gallery.client.PhotoGalleryClient.repositories.BikeRepository;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class PhotoGalleryClientApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationArguments.class);

	public static void main(String[] args) {
		SpringApplication.run(PhotoGalleryClientApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner demo( BikeRepository bikerepo) {
		return (args) -> {
			// save a couple of customers

//			bikerepo.save(new Bike("Klappt", "Endlich"));
//			bikerepo.save(new Bike("CBR250R", "Honda"));
//			bikerepo.save(new Bike("Ninja250R", "Kaswasaki"));
//			bikerepo.save(new Bike("R1", "Yamaha"));
//			bikerepo.save(new Bike("FatBoy", "Harley Davidson"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Bike Bike : bikerepo.findAll()) {
				log.info(Bike.toString());
			}
			log.info("");

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
			log.info("");
		};
	}
}
