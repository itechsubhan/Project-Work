package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankservice;
	
	@GetMapping("/")
	public String Home() {
		return "welcome to the worst app made for a bank";
	}
	
	@GetMapping("/all")
	public List<String> allnames(){
		return bankservice.getAllNames();
	}

}
