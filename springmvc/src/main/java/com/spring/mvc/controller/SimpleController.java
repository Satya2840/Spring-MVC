package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {
	
	@RequestMapping("/getMessage")
	public ModelAndView getMessage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		return view;
	}

}
