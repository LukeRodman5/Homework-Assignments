package com.techelevator.reservations.controllers;
/*This will handle API calls sent to the server w/ the paths specified in @requestMapping
* API handlers == Controllers
*
*
* Typically controllers find the data the caller needs 7 returns it
*
* Usually the data is retrieved by the controller using a DAO of some sort
*
* A controller normally does not have a lot of logic - it's job is to get data & return it to the caller
*
* Controllers are part of the MVC design pattern to structuring applications
*
* MVC stands for Model-View-Controller
*
* 		Model - data for the application
*		View - how the data is displayed to the user / Any user interaction
*		Controller - Coordinates the data transfer between the Model & the View
*
* In this application:
*
*		Model -handled by DAOs
*		View - handled by the client
*		Controller - receives request via API call from the client, find the data based on the request & return it
*/

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController	// This tells the server that there are controllers in here to handle specified URL paths

public class HotelController {
 // Define references for each DAO we will use
    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;
 // Constructor for this class of controllers
    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();					  // Instantiate an object w/ HotelDAO methods & assign to reference
        this.reservationDAO = new MemoryReservationDAO(hotelDAO); // Instantiate an object w/ ReservationDAO methods & assign to reference
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    // @RequestMapping - assign a URL path & HTTP request combination to a method
    @RequestMapping(path = "/hotels", method = RequestMethod.GET) // This method will handle HTTP GET URLs sent to the server w/ the /Hotels path
    public List<Hotel> list() {
       System.out.println("Called w/ the path /hotels");
    	return hotelDAO.list(); // run the hotelDAO list () & return what it returns to the API caller
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    // Data included in the URL is called path data & is handled using the @PatchVariable
    // This method will handle the path "/hotel/id" - "/hotels/1"
    //					   "path/{name-for-path-data}" - similar to how you name parameters passed to a method
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)	// handle the path "/hotels/data"
    
    public Hotel get(@PathVariable int id) {	// @PathVariable says for to get the path variable called
    											// 			& store it in an int for this method
    	
    	System.out.println("Called w/ the path /hotels/" + id);	// Display a message w/ the data passed in the path
        return hotelDAO.get(id);
    }
    // Write a controller to return all the reservations when we get the path "/reservations"
    // We will use the ReservationDAO findAll () method to get the reservations
    @RequestMapping(path= "/reservations", method=RequestMethod.GET)
    public List<Reservation> anyNameYouWant(){
    	System.out.println("Called w/ the path /reservations");
    	return reservationDAO.findAll();
    }
    
    // Write a controller to add a Reservation to the Reservation resource 
    // using path: /hotels/id/reservations	- id is the hotelId for the reservation
    //
    // http://localhost:8080/hotels/1/reservations - should add a reservation for the hotel whose id is 1
    //
    // @RequestBody - create an object form the data in the body of the request
    // @PathVariable - get the value from the data in the path 
    //
    @RequestMapping(path="hotels/{id}/reservations", method=RequestMethod.POST)
    public Reservation FrankSaidToMakeSureThisIsDescriptive(@RequestBody Reservation aReservation	// Take the data in the request body & Instantiate a Reservation object
    													   ,@PathVariable("id") int hotelId) {		// Take the id from the path & store it in an int called hotelId
    	System.out.println("Called w/ the path /hotels/"+hotelId+"reservations");
    	return reservationDAO.create(aReservation, hotelId); 	//Use the create method in the reservationDAO to create a new reservation
    }
}
