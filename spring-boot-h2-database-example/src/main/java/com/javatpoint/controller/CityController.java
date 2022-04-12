package com.javatpoint.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.model.City;
import com.javatpoint.service.CityService;

//creating RestController
@RestController
public class CityController {
//autowired the StudentService class
	@Autowired
	CityService cityService;

//creating a get mapping that retrieves all the students detail from the database 
	@GetMapping("/cities")
	private List<City> getAllCities() {
		return cityService.getAllCities();
	}

//creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/city/{id}")
	private City getCityById(@PathVariable("id") int id) {
		return cityService.getCityById(id);
	}

//creating a delete mapping that deletes a specific student
	@DeleteMapping("/city/{id}")
	private void deleteCity(@PathVariable("id") int id) {
		cityService.delete(id);
	}

//creating post mapping that post the student detail in the database
	@PostMapping("/city")
	private int saveCity(@RequestBody City student) {
		cityService.saveOrUpdate(student);
		return student.getCityCode();
	}
}
