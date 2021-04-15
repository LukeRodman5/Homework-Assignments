package com.techelevator.auction.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.techelevator.auctions.Auction;

public class AuctionControllerIntTest {

    @Autowired
    AuctionControllerIntTest controller;

    @Autowired
    ObjectMapper mapper;

   
    @Before
    public void setUp() throws Exception {
   
    }

    @Test
    public void create_ValidAuction_ShouldAddNewAuction() throws Exception {
        final Auction auction = new Auction();
    }

    @Test
    public void create_InvalidAuction_ShouldNotBeCreated() throws Exception {
        final Auction auction = new Auction();
    }

    @Test
    public void update_ValidAuction_ShouldUpdateExistingAuction() throws Exception {
        Auction auction = new Auction();

        auction.setTitle("MY_NEW_TITLE");
    }

    @Test
    public void update_InvalidAuctionShouldNotBeUpdated() throws Exception {
        Auction auction = new Auction();
        auction.setTitle("");
    }

    @Test
    public void update_InvalidAuctionId_ShouldReturnNotFound() throws Exception {
        Auction auction = new Auction();
    }

  	   private byte[] toJson(Auction auction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
    public void delete_ValidAuctionId_ShouldRemoveAuction() throws Exception {
	}

    @Test
    public void delete_InvalidAuctionIdIdShouldReturnNotFound() throws Exception {
    }
    @Test
    public void AuctionControllerIntTest() throws JsonProcessingException {
        return;
	}
}