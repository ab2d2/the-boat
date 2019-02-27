package com.boot.theboat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boot.theboat.controller.ShipWreckController;
import com.boot.theboat.model.Shipwreck;

public class ShipwreckControllerTest {

	@Test
	public void testShipWreckGet() {
		ShipWreckController sc = new ShipWreckController();
		Shipwreck wreck = sc.get(1L);
		assertEquals(1l, wreck.getId().longValue());
	}
}
