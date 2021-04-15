package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;
import java.util.List;
						// Every method in this file handles "/auction's"
						// DO NOT CODE "/auction's" in the path = of @RequestMapping
						// YOU MUST CODE anything you expect after /auction's in the path
@RestController			// @RequestMapping outside the class makes the path specified the default path
public class AuctionController {
	private AuctionDAO dao;
	public AuctionController() {
		this.dao = new MemoryAuctionDAO();
	}
	
	@RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
	public Auction get(@PathVariable int id) {
		System.out.println("Called with the path /Auctions" + id);
		return dao.get(id);
	}
	
	@RequestMapping(path= "/auctions", method=RequestMethod.POST)
	 public Auction createAnAuction(@RequestBody Auction auction) {	
	 		System.out.println("Called with the path /auctions");	
	 		return dao.create(auction);
	}
	
	@RequestMapping(path= "/auctions", method=RequestMethod.GET)
	   public List<Auction> list(@RequestParam (defaultValue = "" ) String title_like, @RequestParam (defaultValue = "0") double currentBid_lte) {
		    if (!title_like.equals("") && (currentBid_lte > 0)) {
			   return dao.searchByTitleAndPrice(title_like, currentBid_lte);
		   }
	       else if (!title_like.equals("") ){
			   return dao.searchByTitle(title_like);
		   }
		   else if (currentBid_lte > 0) {
			   return dao.searchByPrice(currentBid_lte);
		   }
		   else return dao.list();
		   }
//---------------------------------------------------------------------------------------------------------------------------------    
//----notes-&-solutions-to-homework-questions-5-6-7-inserted-below-this-section----------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------
    
    /*****************************************************************************************
     * This is the solution to Step Two: Implement the list() method
     * 
     * It is superseded by the solutions to Steps Five. Six and Seven
     * 
     * A separate function cannot be coded as they both cannot be active 
     *        as the both handle HTTP GET requests for the path "/auction's
     * 
     * Only one method per HTTP request/path combination is allowed
     *****************************************************************************************/
    	//@RequestMapping(path="", method=RequestMethod.GET)     // handle path "/auction's" for an HTTP GET
    	//public List<Auction> list() {
    	//return dao.list();
    	//}
        
        // handle path "/auction's" for an HTTP GET
        // handle path "/auction's?title_like=value" for an HTTP GET
        // handle path "/auction's?currentBid_lte=value" for an HTTP GET
        // handle path "/auction's?title_like=value & currentBid_lte=value" for an HTTP GET
        // handle path "/auction's?currentBid_lte=value & title_like=value" for an HTTP GET
    
//----------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------
    
@RequestMapping(path = "", method = RequestMethod.GET)
public List<Auction> List(@RequestParam(value = "title_like", defaultValue = "") String title,
						  @RequestParam(value = "currentBid_lte", defaultValue = "0") double currentBid) {
						  
		if( !title.isEmpty() && currentBid > 0) {					// If I have both the title & currentBid
			return dao.searchByTitleAndPrice(title, currentBid);	// use the serchByTitleAndPrice DAO method
		}
		else if( !title.isEmpty()) {								// If I have the title only
			return dao.searchByTitle(title);						// use the searchByTitle DAO method
		}
		else if(currentBid > 0) {									// If I only have the currentBid
			return dao.searchByPrice(currentBid);					// use the searchByPrice DAO method
		} else {													// If I don't have either title or currentBid
			return dao.list();										// use the list DAO method
		}
}
		}