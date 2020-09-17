package com.example.Week2HelloTymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class URLError {
	@RequestMapping({"*"})
	public String Error() {
		return "This is an invalid page, please try another URL!";
	}
}
