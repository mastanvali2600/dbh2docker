package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.javatpoint.model.City;
import com.javatpoint.repository.CityRepository;

@SpringBootApplication
public class SpringBootH2DatabaseExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DatabaseExampleApplication.class, args);
	}
}

@Component
class DemoCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CityRepository cityRepository;

	@Override
	public void run(String... args) throws Exception {

		City c1 = new City();
		c1.setCityCode(101);
		c1.setCityName("Hyd");
		c1.setCityPincode("500200");
		cityRepository.save(c1);

		City c2 = new City();
		c2.setCityCode(102);
		c2.setCityName("Gun");
		c2.setCityPincode("500201");

		cityRepository.save(c2);
	}
}