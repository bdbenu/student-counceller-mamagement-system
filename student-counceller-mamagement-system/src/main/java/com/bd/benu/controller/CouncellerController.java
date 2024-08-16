package com.bd.benu.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bd.benu.model.Counselor;

@Controller
public class CouncellerController {
	
	//Logger logger = 

	@GetMapping(value = {"/","/home"})
	public String loadPage(Model model) {
		
		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);
		return"home";
	}
	
	@GetMapping("/registore")
	public String councellerRegister(Model model) {

		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);
		return"counceller_register";
	}
	@GetMapping("/login")
	public String councellerLogin(Model model) {
		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);

		return "counceller_login";
	}
	
	
}
