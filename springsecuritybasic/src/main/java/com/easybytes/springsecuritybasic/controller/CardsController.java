package com.easybytes.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

	@GetMapping("/input")
	public String getCardDetails(String input) {
		return "Here are card details from DB";
	}
}
