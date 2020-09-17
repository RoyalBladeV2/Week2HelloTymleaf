package com.example.Week2HelloTymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetings {
	@RequestMapping("/greetings")
	public String Greet(@RequestParam(value = "name", required = false, defaultValue = "Yannick") String Name, @RequestParam(value = "age", required = false, defaultValue = "20") int Age, Model model) {
		model.addAttribute("Name", Name);
		model.addAttribute("Age", Age);
		return "greetings";
	}
}
