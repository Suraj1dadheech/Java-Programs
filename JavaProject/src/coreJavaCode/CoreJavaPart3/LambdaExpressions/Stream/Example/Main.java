package coreJavaCode.CoreJavaPart3.LambdaExpressions.Stream.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Employee john=new Employee("john doe",30);
		Employee jane=new Employee("john deer",25);
		Employee Rahul=new Employee("Rahul dua",24);
		Employee Harish=new Employee("Harish  Dadheech",27);
		
		Department hr=new Department("Human Resources");
		hr.addEmployee(john);
		hr.addEmployee(jane);
		hr.addEmployee(Harish);
		
		Department ac=new Department("Accounting");
		ac.addEmployee(Rahul);

////		List<Employee> employees=new ArrayList<>();
//		
//		employees.add(john);
//		employees.add(jane);
//		employees.add(Rahul);
//		employees.add(Harish);
		
		List<Department> departments=new ArrayList<>();
		
		departments.add(hr);
		departments.add(ac);
	
		
		//passing the arraylist in stream and printing
		departments.stream()
					.flatMap(department->department.getEmployees().stream())
					.forEach(System.out::println);
		
		
		//passing the arraylist in stream and returning  flat list  into emploeename list
		List<Employee> employeename=departments.stream()
			.flatMap(department->department.getEmployees().stream())
			.collect(Collectors.toList());
		
		

		System.out.println("********************Passed by age************************");
		
		Map<Integer,List<Employee>> l=departments
				.stream()
				.flatMap(employee->employee.getEmployees().stream())
				.collect(Collectors.groupingBy(employee->employee.getAge()));
		
		

		System.out.println("*******************younger employee-in com*************************************");
		
		departments
				.stream()
				.flatMap(employee->employee.getEmployees().stream())
				.reduce((a,b)->a.getAge()<b.getAge()?a:b)
				.ifPresent(System.out::println);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Main method End
}//Main Class End
