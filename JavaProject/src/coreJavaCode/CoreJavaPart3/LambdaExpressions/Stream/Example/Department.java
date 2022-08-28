package coreJavaCode.CoreJavaPart3.LambdaExpressions.Stream.Example;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	public List<Employee> employee;
	public Department(String name) {
		this.name=name;
		employee=new ArrayList();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addEmployee(Employee emp) {
		employee.add(emp);
	}
	
	public List<Employee> getEmployees() {
		return new ArrayList<>(employee);
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", employee=" + employee + "]";
	}
	
}
