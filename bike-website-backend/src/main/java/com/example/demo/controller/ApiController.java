package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BikeSpecs;
import com.example.demo.service.DataService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/bikeSpecsData/")
public class ApiController {
	private final DataService dataService;
	
	@Autowired
	public ApiController(DataService dataService) {
		this.dataService = dataService;
	}
	
	@GetMapping
	public BikeSpecs getAllData(@RequestParam(name = "brand") String brand, @RequestParam(name = "id") int id) {
		BikeSpecs data = dataService.getAllData(brand, id);
		return data;
	}
}
