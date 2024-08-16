package com.bd.benu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bd.benu.model.Counselor;

@Controller
public class CouncellerController {

	@GetMapping(value = {"/","/home"})
	public String loadPage(Model model) {
		
		Counselor counselor = new Counselor();
		model.addAttribute("counselor", counselor);
		return"home";
	}
}
