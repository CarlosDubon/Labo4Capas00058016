package com.uca.capas.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Producto;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Producto producto = new Producto();
		mav.setViewName("main");
		mav.addObject("producto",producto);
		return mav;
	}
	@RequestMapping(value="/validar",method = RequestMethod.POST)
	public ModelAndView validar(@Valid @ModelAttribute Producto producto,BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main");
		}else {
			mav.setViewName("result");
		}
		return mav;
	}
}
