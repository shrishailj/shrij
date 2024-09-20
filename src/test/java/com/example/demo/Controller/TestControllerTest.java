package com.example.demo.Controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@SpringBootTest
class TestControllerTest {

	@MockBean
	private EmployeeService employeeService;
	
	@Test
	public void testGetEmployees() {
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
		Mockito.when(employeeService.getAllEmpData()).thenReturn(list);

		assertEquals(2, employeeService.getAllEmpData().size());
	}
}
