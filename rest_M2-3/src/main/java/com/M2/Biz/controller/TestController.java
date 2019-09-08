package com.M2.Biz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@GetMapping("/home")
	public String test() {
		log.info("½Ã¹ß");

		System.out.println("test");
		return "test";
	}
}
