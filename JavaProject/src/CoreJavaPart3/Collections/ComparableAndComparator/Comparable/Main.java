package CoreJavaPart3.Collections.ComparableAndComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String args[]) {
	ArrayList<User> list=new ArrayList<>();
	list.add(new User("Suraj",21));
	list.add(new User("Rajesh",12));
	list.add(new User("Mahesh",18));
	list.add(new User("Kiran",8));
	list.add(new User("Sneha",16));
	Collections.sort(list);
	System.out.println(list);
	
	}
}
