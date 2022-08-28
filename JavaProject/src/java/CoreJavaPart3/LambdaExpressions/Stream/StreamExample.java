package java.CoreJavaPart3.LambdaExpressions.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
		//All three lines code do the same work
		//dubbling the value and doing summation
		System.out.println(list.stream().map(t->t*2).reduce(0, (e,u)->e+u));
		
		System.out.println(list.stream().map(t->t*2).reduce(0, (e,u)->Integer.sum(e, u)));
		
		System.out.println(list.stream().map(t->t*2).reduce(0, Integer::sum));
		
		System.out.println("******************************************************************");
		
		List<Integer> list1=Arrays.asList(12,20,35,46,55,68,75);
		
		//summation of the values  which are dividing by 5 only
		System.out.println(list1.stream().filter(t->t%5==0).reduce(0, Integer::sum));
		
		System.out.println("**********************************************************************");
		
		//find the element otherwise print 0
		System.out.println(list1.stream().filter(t->t%5==0).findFirst().orElse(0));
		
		System.out.println(list1
				.stream()
				.filter(StreamExample::isDivisible)
				.map(StreamExample::mapDouble)
				.findFirst()
				.orElse(0));
	}
	public static boolean isDivisible(int a) { 
		System.out.println("div check: "+a);
		return a%5==0;
	}
	
	public static Integer mapDouble(int a) { 
		System.out.println("double: "+a);
		return a*2;
				
	}

}
 