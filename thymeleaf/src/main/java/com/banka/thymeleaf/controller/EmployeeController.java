package com.banka.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banka.thymeleaf.entity.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	//load empl data
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		Employee empl1 = new Employee(1,"banka","banka", "banka@o2.pl");
		Employee empl2 = new Employee(2,"maciek","maciek", "maciek@o2.pl");

		theEmployees = new ArrayList<Employee>();
	
		theEmployees.add(empl1);
		theEmployees.add(empl2);
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
