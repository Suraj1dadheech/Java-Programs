package CoreJavaPart3.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {
	static <X> X fun(X value) {
		return value;
	}
	
	static <X extends List> void fun1(X value) {
		value.addAll(value);
	}
	
	//Upper Bound Wild card
	static double addNumber(List<? extends Number> numbers) {
		double sum=0.0;
		for(Number value:numbers)
			sum+=value.doubleValue();
		return sum;
	}
	
	//Lower Bound WildCard.
	static void addCouple(List<? super Number> numbers) {
		 numbers.add(10);
		 numbers.add(10.34);
		 numbers.add(10l);
		 numbers.add(10.4f);
		 System.out.print(numbers);
	}
	public static void main(String[] args) {
		
		System.out.println(addNumber(List.of(2,3,4,5)));
		System.out.println(addNumber(List.of(2.33,3.12,4.56,5.22)));
		System.out.println(addNumber(List.of(23l,3l,4l,5l)));
		
		addCouple(new ArrayList<>());
		System.out.println(Integer.valueOf(10));
		System.out.println(new ArrayList<>(List.of(1,2,3,4)));
		
		System.out.println(fun(10.10));
		System.out.println(fun(10f));
		
		LinkedList<Integer> list2=new LinkedList<>(List.of(1,2,3));
		fun1(list2);
		System.out.println(list2);
		
		MyCustomList<String> list=new MyCustomList<>();
		
		list.addElement("suraj 1");
		list.addElement("suraj 2");
		list.addElement("suraj 3");
		String value=list.get(1);
		System.out.println(value);
		MyCustomList<Integer> list1=new MyCustomList<>();
		
		list1.addElement(10);
		list1.addElement(20);
		list1.addElement(30);
		int value1=list1.get(1);
		System.out.println(value1);
		System.out.println(list.toString());
		
		System.out.println(list1.toString());
	}

}
