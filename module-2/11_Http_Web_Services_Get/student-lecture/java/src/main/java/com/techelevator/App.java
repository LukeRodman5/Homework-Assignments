package com.techelevator;

import com.techelevator.services.ConsoleService;
import com.techelevator.services.HotelService;

public class App {

	// Define a constant to the base/main part of the server URL we are using
    private static final String API_BASE_URL = "http://localhost:3000/";

    public static void main(String[] args) {
        int menuSelection = 999;
        int hotelId = -1;

        // Instantiate object for the services we are using to we can access the methods in the service
        ConsoleService consoleService = new ConsoleService();		// Handle all console interactions
        HotelService hotelService = new HotelService(API_BASE_URL);	// Handle all Hotel data resource interactions

        while (menuSelection != 0) {
            menuSelection = consoleService.printMainMenu();			// Use the ConsoleService to display menu & get a response
            if (menuSelection == 1) {								//Process based on the menu choice made by the user
               consoleService.printHotels(hotelService.listHotels()); //	& then call the console service to print the array of Hotels
               
            } else if (menuSelection == 2) {
            	consoleService.printReviews(hotelService.listReviews());
                
            } else if (menuSelection == 3) {
            	consoleService.printHotel(hotelService.getHotelById(1));
            } else if (menuSelection == 4) {
                System.out.println("Not implemented");
            } else if (menuSelection == 5) {
                System.out.println("Not implemented");
            } else if (menuSelection == 6) {
                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 0) {
                consoleService.exit();
            } else {
                // anything else is not valid
                System.out.println("Invalid Selection");
            }
            // Press any key to continue...
            if(hotelId != 0) {
                consoleService.next();
            }
            // Ensure loop continues
            menuSelection = 999;
        }

        // if the loop exits, so does the program
        consoleService.exit();
    }

}
