package in.toufiq.SpringBootCrudApp.SpringBootCrudApp.service;

import java.util.List;

import in.toufiq.SpringBootCrudApp.SpringBootCrudApp.model.Employee;

public interface EmployeeService {

	

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
	
}
