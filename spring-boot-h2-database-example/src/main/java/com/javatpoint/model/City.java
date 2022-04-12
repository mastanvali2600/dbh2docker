package com.javatpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table(name = "CITY")
public class City {
//mark id as primary key
	@Id
//defining id as column name
	@Column(name = "CITY_CODE")
	private int cityCode;
//defining name as column name
	@Column(name = "CITY_NAME")
	private String cityName;
//defining age as column name
	@Column(name = "CITY_PINCODE")
	private String cityPincode;
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityPincode() {
		return cityPincode;
	}
	public void setCityPincode(String cityPincode) {
		this.cityPincode = cityPincode;
	}

	
}