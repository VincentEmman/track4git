package org.ssglobal.training.codes;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TestEmployee {
	
	private DbEmployee empTbl;
	
	@BeforeEach
	public void setup() {
		empTbl = new DbEmployee();
	}
	
	@ParameterizedTest
	@MethodSource("empProvider")
	public void testAddEmployeeCorrectData(Employee emp) {
		assertDoesNotThrow(() -> { 
			List<Employee> result = empTbl.addEmployee(emp.getFirstName(), emp.getLastName(), emp.getAge(), emp.getSalary());
			Assertions.assertNotNull(result);
		});
		
	}
	
	@AfterEach
	public void teardown() {
		empTbl = null;
	}
	
	private static Stream<Employee> empProvider() {
		return Stream.of(new Employee("Anna", "Dimaculangan", 30, 25000.00F),
				new Employee("Lorna", "Dimaculangan", 25, 15000.00F),
				new Employee("Fe", "Dimaculangan", 20, 10000.00F));
	}
}
