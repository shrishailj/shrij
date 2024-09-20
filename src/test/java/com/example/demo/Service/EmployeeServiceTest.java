package com.example.demo.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@SpringBootTest
class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@MockBean
	private EmployeeRepository employeeRepository;

	@BeforeEach
	public void setUp() {
		Employee employee = new Employee();
		employee.setEmployeeName("aaaa");
		employee.setEmployeeAddress("nnn");
		employee.setEmployeeEmail("aaaa");
		employee.setEmployeeId(12);

		Employee employee_1 = new Employee();
		employee_1.setEmployeeName("bbbb");
		employee_1.setEmployeeAddress("mmm");
		employee_1.setEmployeeEmail("ooo");
		employee_1.setEmployeeId(13);

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee_1);

	}

	@Test
	public void getEmployees() {
		Employee employee = new Employee();
		employee.setEmployeeName("aaaa");
		employee.setEmployeeAddress("nnn");
		employee.setEmployeeEmail("aaaa");
		employee.setEmployeeId(12);

		Employee employee_1 = new Employee();
		employee_1.setEmployeeName("bbbb");
		employee_1.setEmployeeAddress("mmm");
		employee_1.setEmployeeEmail("ooo");
		employee_1.setEmployeeId(13);

		List<Employee> list = new ArrayList<Employee>();
		list.add(employee);
		list.add(employee_1);

		Mockito.when(employeeRepository.findAll()).thenReturn(list);
		assertEquals(2, employeeRepository.findAll().size());
	}

}
