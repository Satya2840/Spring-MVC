package com.spring.mvc.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.form.model.User;

@Controller
public class RegistrationController {

	@RequestMapping("/registrationForm")
	public ModelAndView regForm() {
		ModelAndView view = new ModelAndView();
		view.setViewName("form");
		return view;

	}

	@RequestMapping(value = "/userDetails", method = RequestMethod.POST)
	public String formData(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "success";

	}

	@RequestMapping("/readrequestParam")
	public String requestparamData(@RequestParam("id") Integer id, @RequestParam("name") String userName,
			@RequestParam(name="sal" ,required = false, defaultValue = "30000") int salary) {

		System.out.println("reading requestparam parms");
		System.out.println(id);
		System.out.println(userName);
		System.out.println(salary);
		
		
		return "success";
	}
	
	@RequestMapping("/readrequestParamJsp")
	public ModelAndView requestparamData(@RequestParam("name") String name, @RequestParam("emailid") String emailid,
			@RequestParam(name="phNo" ,required = false, defaultValue = "12345678") Integer phNo) {

		System.out.println("reading requestparam parms");
		System.out.println(name);
		System.out.println(emailid);
		System.out.println(phNo);
		User user = new User();
		user.setName(name);
		user.setEmailid(emailid);
		user.setPhNo(phNo);
		ModelAndView view = new ModelAndView();
		view.setViewName("success");
		view.addObject("user", user);
		
		return view;
	}
	
	@RequestMapping("/path/{id}")
	public String readingPathVariable(@PathVariable("id") Integer id) {
		System.out.println(id);
		return "success";
	}

}
