package CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String args[]) {
	ArrayList<User> list=new ArrayList<>();
	list.add(new User("Suraj",21,"02:03:1999"));
	list.add(new User("Rajesh",12,"27:08:1995"));
	list.add(new User("Mahesh",18,"15:04:1993"));
	list.add(new User("Kiran",8,"13:08:1995"));
	list.add(new User("Sneha",16,"03:08:1995"));
	
	//Comparing using AGE.
	Collections.sort(list,new AgeComparator());
	System.out.println("Compare with Age:");
	System.out.println(list);
	
	//Comparing Using Name.
	Collections.sort(list,User.NAMECOMP);
	System.out.println("Compare with Name Using anonymous object:");
	System.out.println(list);
	
	//Comparing Using Name.
	Collections.sort(list,new NameComparator());
	System.out.println("Compare with Name:");
	System.out.println(list);
	
	//Comparing Using DOB.
	Collections.sort(list,new DobComparator());
	System.out.println("Compare with DOB:");
	System.out.println(list);
	
	}
}
