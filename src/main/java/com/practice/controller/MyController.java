package com.practice.controller;



import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	//to run PAGE ON BROWSER
	/*   http://localhost:8080/about   */

	@RequestMapping(value="/about",method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about Handler");
		//putting data in model
		model.addAttribute("name","Pankaj Sharma");
		model.addAttribute("currentDate",new Date().toLocaleString());
		return "about";
	    //about.html
	}
	
	//handling iteration
	
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		//send
		
		//create a list, set collection
		
		List<String> names = List.of("Ankit","Laxmi","Karan","John");
		m.addAttribute("names",names);
		return "iterate";
		
	}
	
	//handler for Conditional Statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		
		m.addAttribute("isActive", false);
		m.addAttribute("gender","M");
		List<Integer> list = List.of(233);
		m.addAttribute("mylist", list);
		
		return "condition";
		
		
	}
	
	
	//handler for including fragments
	@GetMapping("/service")
	public String sevicesHandler(Model m) {
		m.addAttribute("title","this is dynamic title");
		m.addAttribute("subtitle", LocalDate.now().toString());
		
		return "service";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
