package com.example.Week2HelloTymleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Week2HelloTymleaf.model.Student;

@Controller
public class StudentController {
	
	private List<Student> Students = new ArrayList<Student>();
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String Controller(@RequestParam(value = "student", required = false) String name, Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "hello";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String Controller(@ModelAttribute(value = "student") Student student, Model model) {
		Students.add(student);
		model.addAttribute("Students", Students);
		System.out.println(Students);
		return "hello";
	}
}
