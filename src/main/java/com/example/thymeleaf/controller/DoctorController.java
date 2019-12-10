package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

	@PostMapping("/doctor")
	public String doctor (Model model,
			@RequestParam(value = "name", required = false, defaultValue = "John Smith") String name,
			@RequestParam(value = "number", required = false, defaultValue = "0") int number) {
		model.addAttribute("name", name);
		model.addAttribute("number", number);
		return "doctor";
	}
}
