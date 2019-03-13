package com.boot.theboat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.theboat.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TheBoatApplicationTests {
	
	@Autowired
	HomeController hc;
	
	@Test
	public void testHome() {
		String result = hc.home();
		assertEquals(result, "The boat, reporting for duty. built using spring boot");
		
	}

}
