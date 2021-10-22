package com.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/demo/api/v1/")
public class DemoController {

	// get all students
	@GetMapping("demoData")
	public String getAllStudents(){
		return "Demo Data";
	}
	
}
