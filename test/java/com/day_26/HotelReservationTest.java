package com.day_26;


import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	
	/**
	 * JUnit Testing purpose
	 */
	@Test
	public void test() {

		HotelReservation.addHotel("Lakewood", 110);
		HotelReservation.addHotel("Bridgewood", 160);
		HotelReservation.addHotel("Ridgewood", 220);
		Assert.assertEquals(3, HotelReservation.countNoOfHotels());
	}
}