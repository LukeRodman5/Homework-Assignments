package com.techelevator.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Department;
import com.techelevator.model.DepartmentDAO;


/**
 * Controller to authenticate users.
 */
@RestController // tells the server this file contains controllers
public class DepartmentController {
	
	DepartmentDAO deptDAO;	// Define a reference to the deptDAO so we can access it's methods
	
	// Constructor for this class - public, same name as the Class,
	public DepartmentController(DepartmentDAO deptDAO) {
		this.deptDAO = deptDAO;	// assign to our reference the deptDAO passed to the constructor
		// use Spring Dependency injection to instantiate a DepartmentDAO object & pass it to the constructor
		//		We need to include the @Component annotation in the JDBCDepartmentDAO so Spring knows it's 
		//		a candidate for dependency injection
	}
	
	// This controller will handle the path "/departments"
	// to send back all the Departments as an Array, List, Queue, or a Stack
	
	@RequestMapping(path="/departments", method=RequestMethod.GET)  // The following function will handle / departments path 
	public List<Department> listAllDepartments(){
		
		logAPICall("Called w/ path: /departments");	// log the API call to the server
	
		// use the Department DAO to get all the Departments from the database 7 return them	
		List<Department> theDepartments;
	
		theDepartments = deptDAO.getAllDepartments(); // Use the DAO method to retrieve all the Departments from the Department resource
		
		return theDepartments;
	}
		
	
	
	
	// This controller will get a specific department from the Department resource based on it's id
	// Use the Department DAO getDepartmentById() method
	// The path API will use to invoke this is: /departments/{id}
	@RequestMapping(path="/departments/{id}", method=RequestMethod.GET)
	public Department getDepartmentById(@PathVariable Long id) {
		logAPICall("Called w/ the path: /departments/"+id);
		return deptDAO.getDepartmentById(id); 	// Call the DAO method to the get the department w/ the id given & return
	}
	
public void logAPICall(String message) {
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss.A");
     String timeNow = now.format(formatter);
     System.out.println(timeNow + "-" + message);
 }
}


