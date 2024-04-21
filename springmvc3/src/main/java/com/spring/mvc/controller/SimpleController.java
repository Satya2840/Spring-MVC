package com.spring.mvc.controller;



import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.controller.dto.Employee;

@Controller
public class SimpleController {
	
	@RequestMapping("/getMessage")
	public ModelAndView getMessage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("hello");
		view.addObject("id", "1");
		view.addObject("name", "Satya");
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Suraj");
		emp.setSalary(10000);
		view.addObject("employee", emp);
		
		
		Employee emp1 = new Employee();
		emp1.setId(3);
		emp1.setName("Sandhya");
		emp1.setSalary(20000);
		
		Employee emp2 = new Employee();
		emp2.setId(4);
		emp2.setName("Satwika");
		emp2.setSalary(30000);
		
		Employee emp3 = new Employee();
		emp3.setId(5);
		emp3.setName("Lakshmi");
		emp3.setSalary(40000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		System.out.println(emp1);
		view.addObject("employeeList", empList);
		return view;
	}

}
