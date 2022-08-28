package coreJavaCode.CoreJavaPart3.LambdaExpressions.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Suraj Dadheech",21));
		list.add(new Employee("Raju Srivastav",18));
		list.add(new Employee("Avinash Naidu",24));
		list.add(new Employee("Kamal Gowda",25));
		list.add(new Employee("Jay Prakash",22));
		
//		for(Employee value:list)
//			System.out.println(value);
		
		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
		
		
//		lamda using foreach loop
//		for(Employee value:list) {
//			System.out.println(value);
//			new Thread(()->System.out.println("Age: "+value.getAge())).start();
//		}
		

		
//		lambda-For each Loop 
//		list.forEach(employee->{
//			System.out.println(employee.getName());
//			System.out.println(employee.getAge());			
//		});
		
		
//		list.forEach(employee->{
//			if(employee.getAge()>=22)
//				System.out.println(employee.getName());
//		});
//			
//		printEmployeesByAge(list,"Age more then 22",employee->employee.getAge()>=22);
//		printEmployeesByAge(list,"Age less then 22",employee->employee.getAge()<=22);
//		printEmployeesByAge(list,"Age Equal to 18",new Predicate<Employee>() {
//
//			@Override
//			public boolean test(Employee employee) {
//				return employee.getAge()==18;
//			}
//		});
		
		IntPredicate intp=i->i>15;
		System.out.println(intp.test(10));  //false
		
		
		IntPredicate greater15=i->i>50;
		IntPredicate less100=i->i<100;
		
		System.out.println(greater15.and(less100).test(85)); //true
		System.out.println(greater15.and(less100).test(15)); //false
		System.out.println(greater15.or(less100).test(25)); //true
		
		Random random=new Random();
		Supplier sup=()->random.nextInt(100);
		for(int i=1;i<=10;i++) {
			System.out.println(sup.get());
		}
		
		//LastName from getName function
//		list.forEach(employee->{
//			String lastName=employee.getName().substring(employee.getName().indexOf(" ")+1);
//			System.out.println("Last Name is: "+lastName);
//		});
		
		Function<Employee,String> getLastname=(Employee employee)->employee.getName().substring(employee.getName().indexOf(" ")+1);
		System.out.println(getLastname.apply(list.get(2)));
		
		
		Function<Employee,String> upperCase=(Employee employee)->employee.getName().toUpperCase();
		Function<String,String>   firstName=name->name.substring(0,name.indexOf(" "));
		Function chainedFunction=upperCase.andThen(firstName);
		
		System.out.println();
		System.out.println(chainedFunction.apply(list.get(0)));
		
		
		BiFunction<String,Employee,String> concatAge=(String name,Employee employee)->{
			return name.concat("  "+employee.getAge());
		};
		
		System.out.println(concatAge.apply(upperCase.apply(list.get(0)), list.get(0)));
		
		IntUnaryOperator incBy5=i->i+5;
		System.out.println(incBy5.applyAsInt(20)); //25
		
		Consumer<String> c1=s->s.toUpperCase();
		Consumer<String> c2=s->System.out.println(s);
		
		c1.andThen(c2).accept("Suraj");
//		...............................Using Anonymous Object.............................
//		String sillyString=doStringStuff(new UpperConcat(){
//			@Override
//			public String upperAndConcat(String s1,String s2) {
//				return s1.toUpperCase()+s2.toUpperCase();
//			}
//		},list.get(0).getName(),list.get(1).getName());
//		
//		System.out.println(sillyString);...................................................
		
		
		

//		.............................Using Lambda Function...................................
//		UpperConcat uc=(s1,s2)->s1.toUpperCase()+s2.toUpperCase();
//		String sillyString = doStringStuff(uc,list.get(0).getName(), list.get(1).getName());
//		System.out.println(sillyString);//..................................................
	
		
		
		
//		..............................Lambda in arguments................................................
//		String StringValue = doStringStuff((s1,s2)->s1.toUpperCase()+s2.toUpperCase(),list.get(0).getName(), list.get(1).getName());
//		System.out.println(StringValue);//...............................................................................
		
//		AnotherClass ac=new AnotherClass();
//		System.out.println(ac.doSomething());
		
	}
	
	public final static void printEmployeesByAge(List<Employee> list,String message, Predicate<Employee> ageCondition) {
		
		System.out.println("this message: "+message);
		for(Employee employee:list) {
			if(ageCondition.test(employee))
			System.out.println(employee.getName());
		}
		
	}
	public final static String doStringStuff(UpperConcat uc,String s1,String s2) {
		
		return uc.upperAndConcat(s1, s2);
	}
}
