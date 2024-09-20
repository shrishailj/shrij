package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/mainClass")
public class TestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/saveEmpAllData")
	public String saveEmployeeData(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return "value store in the database";
	}
	
	@GetMapping("/allData")
	public List<Employee> getAllData(){
		
		return employeeService.getAllEmpData();
	}
	
	@DeleteMapping
	public void deleteData() {
		
	}
	
}