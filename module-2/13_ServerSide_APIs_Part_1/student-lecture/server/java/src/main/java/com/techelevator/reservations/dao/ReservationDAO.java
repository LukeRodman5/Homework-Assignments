package com.techelevator.reservations.dao;

// This is the list of the methods available for accessing reservation information
import java.util.List;
import com.techelevator.reservations.models.Reservation;

public interface ReservationDAO {

    List<Reservation> findAll();

    List<Reservation> findByHotel(int hotelID);

    Reservation get(int reservationID);

    Reservation create(Reservation reservation, int hotelID);

}
