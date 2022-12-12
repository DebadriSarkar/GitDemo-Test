package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "rest")
public class GitController {

	@GetMapping("message")
	public String getMessage() {
		return "Welcome to GitHub!";
	}
}
