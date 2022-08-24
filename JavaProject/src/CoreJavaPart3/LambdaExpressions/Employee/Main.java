package CoreJavaPart3.LambdaExpressions.Employee;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Suraj",21));
		list.add(new Employee("Raju",18));
		list.add(new Employee("Avinash",24));
		list.add(new Employee("Kamal",25));
		list.add(new Employee("Jay",22));
		
//		for(Employee value:list)
//			System.out.println(value);
		
		Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));

		for(Employee value:list)
			System.out.println(value);
		
		
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
	
		
		
		
//		..............................Lamda in arguments................................................
		String StringValue = doStringStuff((s1,s2)->s1.toUpperCase()+s2.toUpperCase(),list.get(0).getName(), list.get(1).getName());
		System.out.println(StringValue);//...............................................................................
		
//		AnotherClass ac=new AnotherClass();
//		System.out.println(ac.doSomething());
		
	}
	public final static String doStringStuff(UpperConcat uc,String s1,String s2) {
		
		return uc.upperAndConcat(s1, s2);
	}
}
