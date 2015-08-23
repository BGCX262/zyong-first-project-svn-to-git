package com.demo.primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
@ManagedBean(name=PPRBean.PPRBEAN)
public class PPRBean implements Serializable {

	public static final String PPRBEAN="pprBean";
	private String firstname;

	private String surname;
	private List cities =new ArrayList();
	private String city;
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List getCities() {
		cities.clear();
		cities.add("China");
		cities.add("English");
		cities.add("America");
		return cities;
	}

	public void setCities(List cities) {
	
		this.cities = cities;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}
