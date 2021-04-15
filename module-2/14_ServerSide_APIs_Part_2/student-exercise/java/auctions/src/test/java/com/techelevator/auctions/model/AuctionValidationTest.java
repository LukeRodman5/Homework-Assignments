package com.techelevator.auctions.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuctionValidationTest {

    private static ValidatorFactory validatorFactory;
    private static Validator validator;

    @BeforeClass
    public static void createValidator() {
        validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @AfterClass
    public static void close() {
        validatorFactory.close();
    }

    public void AuctionValidationTest() {

    }

    @Test
    public void should_have_no_violations() {
        Auction auction = new Auction("TEST_TITLE", "TEST_DESC", "TEST_USER", 99);

        Set<ConstraintViolation<Auction>> violations = validator.validate(auction);

        assertTrue(violations.isEmpty());
    }


    @Test
    public void titleShouldNotBeBlank() {
        Auction auction = new Auction();
        auction.setTitle("TEST_TITLE");
        Set<ConstraintViolation<Auction>> violation = validator.validate(auction);
       
    }
       


    @Test
    public void descriptionShouldNotBeBlank() {
        Auction auction = new Auction();
        auction.setDescription("TEST_DESC");
        Set<ConstraintViolation<Auction>> violation = validator.validate(auction);
     
    }

    @Test
    public void userShouldNotBeBlank() {
        Auction auction = new Auction();
        auction.setUser("TEST_USER");
        Set<ConstraintViolation<Auction>> violation = validator.validate(auction);
    }

    @Test
    public void currentBidShouldBeGreaterThanZero() {
        Auction auction = new Auction("TEST_TITLE", "TEST_DESC", "TEST_USER", 0);
        Set<ConstraintViolation<Auction>> violations = validator.validate(auction);
        assertEquals(violations.size(), 1);

        ConstraintViolation<Auction> violation = violations.iterator().next();
        assertEquals("The field `current bid` should be greater than 0.", violation.getMessage());
        assertEquals("currentBid", violation.getPropertyPath().toString());
    }

    @Test
    public void currentBidShouldBeGreaterThanZeroWhenNotSet() {
        Auction auction = new Auction();
        auction.setTitle("TEST_TITLE");
        auction.setDescription("TEST_DESC");
        auction.setUser("TEST_USER");
        Set<ConstraintViolation<Auction>> violations = validator.validate(auction);
        assertEquals(violations.size(), 1);

        ConstraintViolation<Auction> violation = violations.iterator().next();
        assertEquals("The field `current bid` should be greater than 0.", violation.getMessage());
        assertEquals("currentBid", violation.getPropertyPath().toString());
    }


}