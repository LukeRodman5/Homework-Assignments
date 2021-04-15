package com.techelevator.auctions.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

	@Autowired
    public AuctionDAO dao;

    public AuctionController(AuctionDAO dao) {
        this.dao = dao;
    }

   
@RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) throws AuctionNotFoundException {
        return dao.get(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping( path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        return dao.create(auction);
    }
   @RequestMapping( path = "/{update_id}", method = RequestMethod.PUT)
   public Auction update(@PathVariable int update_id, @RequestBody Auction auction) throws AuctionNotFoundException {
        return dao.update(auction, update_id);
}
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
   public void Delete(int id) throws AuctionNotFoundException {
	   dao.delete(id);
   }
}