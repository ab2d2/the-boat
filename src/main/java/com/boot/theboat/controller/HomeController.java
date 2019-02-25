package com.boot.theboat.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "The boat, reporting for duty";
	}
}
