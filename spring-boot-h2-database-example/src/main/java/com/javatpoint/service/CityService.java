package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.City;
import com.javatpoint.repository.CityRepository;

//defining the business logic
@Service
public class CityService {
	@Autowired
	CityRepository cityRepository;

//getting all student records
	public List<City> getAllCities() {
		List<City> cities = new ArrayList<City>();
		cityRepository.findAll().forEach(city -> cities.add(city));
		return cities;
	}

//getting a specific record
	public City getCityById(int id) {
		return cityRepository.findById(id).get();
	}

	public void saveOrUpdate(City student) {
		cityRepository.save(student);
	}

//deleting a specific record
	public void delete(int id) {
		cityRepository.deleteById(id);
	}
}