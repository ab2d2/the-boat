package com.boot.theboat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.boot.theboat.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TheBoatApplicationTests {

	@Test
	public void testHome() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "The boat, reporting for duty. built using spring boot");
		
	}

}
