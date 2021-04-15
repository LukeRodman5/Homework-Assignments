package com.techelevator;

import java.util.ArrayList;

// This is application program to used DAO to access the database

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
		// pass the cityDAO constructor the data source we want it to use
		CityDAO dao = new JDBCCityDAO(worldDataSource);   // Instantiate a CityDAO object so we can use it's methods
		
		City smallville = new City();      // Instantiate a new, empty City object
		smallville.setCountryCode("USA");  //  Assign values
		smallville.setDistrict("KS");      //      to the new City object
		smallville.setName("Smallville");  //         using it's setters
		smallville.setPopulation(42080);
		// NOTE: we did not a city_id because it comes from the data base manager
		
		dao.save(smallville);  // Use the DAO save method to add the new City to the database
		
		City theCity = dao.findCityById(smallville.getId()); // Retrieve the City just added to the database for verification
		
		// Get a list of cities in the USA from the database
		// We need to cast the return object from the findCityByCountryCode() method
		// 		because it returns a List<City> & we need an ArrayList<City>
		
		
		ArrayList<City> listOfCities = (ArrayList<City>) dao.findCityByCountryCode("USA");
		
		// Display the names for the cities returned from the database
		for (City aCity : listOfCities) {
			System.out.println("a USA city in the database is: " + aCity.getName());
		}
		
		
		
		listOfCities = (ArrayList<City>) dao.findCityByDistrict("Ohio");
		
		// Display the names for the cities returned from the database
		for (City aCity : listOfCities) {
			System.out.println("a city in Ohio the database is: " + aCity.getName());
		}
		
		
		
	}

}
