package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;

@Service
public class EmployeeService {
		
	@Autowired
	private JpaRepository jpaRepository;
	
	

	public void saveEmployee(Employee employee) {
		
		jpaRepository.save(employee);
	}
	
	public List<Employee> getAllEmpData(){
		
		return jpaRepository.findAll();
		
		
	}
	
	
}
