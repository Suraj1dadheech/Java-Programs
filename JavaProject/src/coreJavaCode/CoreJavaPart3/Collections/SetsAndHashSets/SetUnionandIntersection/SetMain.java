package coreJavaCode.CoreJavaPart3.Collections.SetsAndHashSets.SetUnionandIntersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<Integer> square=new HashSet<>();
		Set<Integer> cubes=new HashSet<>();
		for(int i=1;i<=100;i++) {
			square.add(i*i);
			cubes.add(i*i*i);
		}
		System.out.println("Size of square: "+square.size()+" Size of Cubes: "+cubes.size());
		Set<Integer> union=new HashSet<>(square);
		union.addAll(cubes);
		System.out.println(union.size());
		
		Set<Integer> intersection=new HashSet<>(square);
		intersection.retainAll(cubes);
		System.out.println("Size: "+intersection.size());
		
		for(Integer value:intersection)
			System.out.println(Math.sqrt(value)+"   "+Math.cbrt(value));
		
		//-----------------------------------UNION---------------INTERSECTION-------------------> (A-B) <-------------------
		
		String A1="I am Suraj your friend";
		String B1="your friend we are not";
		
		String []A11=A1.split(" ");
		String []B11=B1.split(" ");
		
		Set<String> left=new HashSet<>();
		Set<String> right=new HashSet<>();
		left.addAll(Arrays.asList(A11));
		right.addAll(Arrays.asList(B11));
		
		
		//Union
//		left.addAll(right);
//		printList(left);
		
		//Intersection
//		left.retainAll(right);
//		printList(left);
		
		//left-right (A-B)
//		left.removeAll(right);
//		printList(left);


		
		
	}

}
