package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;	// Includes the code to support API calls

public class HotelService {

    // Holds the base/main part of the server URL the user wants us to use
	private final String API_BASE_URL;
	
	// Instantiate an object of a class containing all of the code to support API calls
	// REST is a protocol for doing API calls
	// RestTemplate is a framework class to support calls
	// When we want to do an API class we will use this RestTemplate object
    private RestTemplate callAPI = new RestTemplate();

    
    // Constructor - accepts the main/base part of the URL the user wants us to use
    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;			// Assigns the main/base part of the URL the user sent us to our instance variable from above
    }
    // This method will go to the API server & get all the Hotel data & return it in an Array of Hotel objects
    public Hotel[] listHotels() {
    	// The URL path http://localhost:3000/Hotels will return all the Hotels form API server
    	// The http://localhost:3000/ is stored in our API_BASE_URL variable
    	// the API returns JSON formatted data which we need to convert to an Array of Hotel objects
    	
    	// The Rest Template class has a method called getForObject() that given a URL, will do an API GET request to the URL
    	//			& returns data in any Java data format we pick. It will convert the JSON to the Java data format automatically
    	
    	// The format of getForObject() method: getForObject(String)-with-URL, data-type-you-want-returned)
        return callAPI.getForObject(API_BASE_URL + "hotels", Hotel[].class);  // Hotel[].class - array of Hotel class objects
    }

    public Review[] listReviews() {
        return callAPI.getForObject(API_BASE_URL + "reviews", Review[].class);	// Review[].class - array of Hotel class objects
    }

    // Returns information on a specific hotel whose id is passed to the method
    public Hotel getHotelById(int id) {
    	// The URL path http://localhost:3000/Hotels will return all the Hotels form API server
    	// The http://localhost:3000/ is stored in our API_BASE_URL variable
    	// We need to add the "hotels/id" to the API_BASE_URL & send it to the API server using allAPI object
        return null;
    }

    public Hotel getHotelId(int hotelID) {
        return callAPI.getForObject(API_BASE_URL + "hotelID", Hotel.class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return null;
    }

    public City getWithCustomQuery(){
        return null;
    }

}
