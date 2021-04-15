package com.techelevator;

// This is the application program to use DAO to access the database

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {
	
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		// pass the cityDAO constructor the data-source we want it to use
		CityDAO dao = new JDBCCityDAO(worldDataSource);	 // Instantiate a CityDAO Object so we can use it's methods
		
		City smallville = new City();	 				 // Instantiate a new, empty City object
		smallville.setCountryCode("USA"); 				 //
		smallville.setDistrict("KS");	  				 //
		smallville.setName("Smallville");  				 //
		smallville.setPopulation(42080);  			     //
		
		dao.save(smallville);
		
		City theCity = dao.findCityById(smallville.getId());
		
	}

}
