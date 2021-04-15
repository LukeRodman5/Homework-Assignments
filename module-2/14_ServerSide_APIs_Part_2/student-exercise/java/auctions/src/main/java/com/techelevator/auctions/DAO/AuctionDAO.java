package com.techelevator.auctions.DAO;

import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;

import java.util.List;
//---------------------------------------------------------------------------------
//*/*****************************************************************************************
//* This is the solution to Step Two: Implement the list() method
//* 
//* It is superceded by the solutions to Steps Five. Six and Seven
//* 
//* A separate function cannot be coded as they both cannot be active 
//*        as the both handle HTTP GET requests for the path "/auctions
//* 
//* Only one method per HTTP request/path combination is allowed
//*****************************************************************************************/
//   @RequestMapping(path="", method=RequestMethod.GET)     // handle path "/auctions" for an HTTP GET
//   public List<Auction> list() {
//   return dao.list();
//   }
//
// handle path "/auctions" for an HTTP GET
// handle path "/auctions?title_like=value" for an HTTP GET
// handle path "/auctions?currentBid_lte=value" for an HTTP GET
// handle path "/auctions?title_like=value&currentBid_lte=value" for an HTTP GET
// handle path "/auctions?currentBid_lte=value&title_like=value" for an HTTP GET
//@RequestMapping( path = "", method = RequestMethod.GET)  
//   public List<Auction> list(@RequestParam(value="title_like"    , defaultValue = "")  String title,
//                             @RequestParam(value="currentBid_lte", defaultValue = "0") double currentBid) {
//       if( !title.isEmpty() && currentBid > 0) {               // if I have both title and currentBid
//           return dao.searchByTitleAndPrice(title,currentBid); //      use the searchByTitleAndPrice DAO method
//       }
//       else if( !title.isEmpty() ) {                // if I have a title only
//           return dao.searchByTitle(title);         //     use the searchByTitle DAO method
//           }
//       else if( currentBid > 0) {                   // If I only have a currentBid
//           return dao.searchByPrice(currentBid);    //     use the searchByPrices DAO method
//       } else {                                     // If I don't have either title nor currentBid
//           return dao.list();                       //     use the list DAO method - return all auction items
//       }
//   }*/
//
//---------------------------------------------------------------------------------
public interface AuctionDAO {

    List<Auction> list();

    Auction get(int id) throws AuctionNotFoundException;

    Auction create(Auction auction);

    List<Auction> searchByTitle(String title);

    List<Auction> searchByPrice(double currentBid);

    Auction update(Auction auction, int id) throws AuctionNotFoundException;

    void delete(int id) throws AuctionNotFoundException;

	List<Auction> searchByTitleAndPrice(String title, double currentBid);
}
