package com.boot.theboat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.theboat.controller.ShipWreckController;
import com.boot.theboat.model.Shipwreck;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShipwreckControllerTest {
	
	@Autowired
	ShipWreckController sc;

	@Test
	public void testShipWreckGet() {
		Shipwreck wreck = sc.get(1L);
		assertEquals(1l, wreck.getId().longValue());
	}
}
