package com.bd.benu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bd.benu.model.Counselor;
import com.bd.benu.service.CounselorService;

@Controller
public class CouncellerController {
	
	//private Logger logger = LoggerFactory.getLogger(CouncellerController.class);

	@Autowired
	private CounselorService counselorService;


	@GetMapping(value = { "/", "/home" })
	public String loadPage(Model model) {

		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);
		return "home";
	}

	@GetMapping("/load")
	public String loadPageRegsiter(Model model) {

		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);
		return "counceller_register";
	}

	@PostMapping("/register")
	public String councellerRegister(@ModelAttribute Counselor counselor, Model model) {
		boolean registerCounsller = counselorService.registerCounsller(counselor);
		
		if (registerCounsller) {
			model.addAttribute("sucessMessage", "Register Successed");
		}
		model.addAttribute("failedMessage", "Registartion Failed");
		return "counceller_register";
	}

	@GetMapping("/login")
	public String councellerLogin(Model model) {
		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);

		return "counceller_login";
	}

}
