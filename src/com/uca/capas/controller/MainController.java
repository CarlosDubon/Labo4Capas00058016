package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Student;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message","Bienvenidos a MVC");
		return mav;
	}
	
	@RequestMapping(value="/formData", method=RequestMethod.POST)
	public ModelAndView formData(@RequestParam String name, @RequestParam String lname,@RequestParam String date,@RequestParam String carrer,@RequestParam String experience) {
		ModelAndView mav = new ModelAndView();
		Student student = new Student(name,lname,date,carrer,experience);
		mav.setViewName("form");
		mav.addObject("student",student);
		return mav;
	}
}
