package com.techelevator.city;
										/* This is the DAO concrete class which implements the methods required by the interface
										 * 
										 * THe name of the class should be JDBCtable-nameDAO
										 * 
										 */
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO {  					// implement the interface for the DAO
										// JDBCTemplate class contains all the necessary code to interact w/ a database using Spring DAOs

	private JdbcTemplate jdbcTemplate;		   					// Define a reference variable to a JDBCTemplate
	
	public JDBCCityDAO(DataSource dataSource) {					// Constructor for the class that takes a data-source as a parameter
		this.jdbcTemplate = new JdbcTemplate(dataSource);   	// instantiate a JDBCTemplate object using the data-source passed
																// 		& assign it to the reference defined above
	}

	// Create/Add a row to the table using an object of the class passed in from the user which contains values for all it's variables
			  // except the city id which will be assigned be the database manager because the user doesn't know what it should be either
	
	@Override // Ask the compiler to be sure we overriding the method required by the DAO interface
	public void save(City newCity) {
		
			  // Define a String to hold the SQL statement we want to run
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)"; 	
		
		/* the ?'s are place holders for the values specified when the statement is run
		 * in this example the values are coming form the object passed to the method
		 * we don't know the values until run time 7 this method is called
		 * When we add a row to the City table the database will automatically assign a city id because it is defined as a serial in the table 
		 * Since the database will assign the city id, we don't know what it will be 
		 * So we will ask the database manager what the next city id is & assign it ourselves
		 *  		that way the city object the user passes will have the city id that is in the database
		 */
		
		newCity.setId(getNextCityId()); // call a class method to get the next city id from the database manager & assign to the object passed
		
	    /* Run the SQL statement to access the database using the JDBCTemplate object
		 * Use the .update method because we are executing & insert which changes (updates) the data base
		 * .update() wants the String w/ the SQL statement to be executed, followed by any values for the ? place holders
		 *			 SQL statement, values-for-the?'s - one value for each? in the SQL statement String
		 */
		
		jdbcTemplate.update(sqlInsertCity, newCity.getId(),			 // id from the object passed as the value for the first ? in the statement
										   newCity.getName(),		 // name form the object passed as the value for the second ? in the statement
										   newCity.getCountryCode(), // country code from the object passed as the value for the third ? in the statement
										   newCity.getDistrict(),	 // district from the object passed as the value for the forth ? in the statement
										   newCity.getPopulation()); // population from the object passed as the value for the fifth ? in the statement
	}
	
	@Override
	public City findCityById(long id) {
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if(results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}

	@Override
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while(results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	// This method will get the next value for city id from the database manager & return it to the caller

	private long getNextCityId() {
		// nextval() SQL function will return the next sequential value from a sequence object
		// a sequence object is used by postgres to generate serial values to a column
		// a sequence object may be defined by a user & used by postgres or postges will automatically define one for a serial type
		
		// Use the JDBCTemplate object to run a select using queryForRowSet to get the city id value
		// Result is stored in the nextIdReseult variable as a SQLRowSet
		
		//													retrieve the next value for the seq_city_id sequence object
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		
		// We need to get the city id out of the SQLRowSet & into a Java variable
		
		if(nextIdResult.next()) {			// if the SQLRowSet called nextIDResult has any data, move to the next line of data
			return nextIdResult.getLong(1); // get the long value in column 1 of the line & return it
		} else {							// if there is no data in the nextIDResult, throw a RuntimeException
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {
		City theCity;
		theCity = new City();
		theCity.setId(results.getLong("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
	}
}
