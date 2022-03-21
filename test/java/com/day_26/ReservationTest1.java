package com.day_26;

import org.junit.Assert;
import org.junit.Test;

public class ReservationTest1 {

	/**
	 * JUnit Testing purpose
	 */
	
	
	@Test
	public void givenDetailsOf3Hotels_InAGivenDataRage_shouldReturnCheapesthotel() {

		ReservationFunctions1.addHotel("Lakewood", 110);
		ReservationFunctions1.addHotel("Bridgewood", 160);
		ReservationFunctions1.addHotel("Ridgewood", 220);
		String cheapestHotelInfo = ReservationFunctions1.findCheapestHotel("10-Sep-2020", "11-Sep-2020");
		Assert.assertEquals("Lakewood Total Cost: $110", cheapestHotelInfo);
	}
}