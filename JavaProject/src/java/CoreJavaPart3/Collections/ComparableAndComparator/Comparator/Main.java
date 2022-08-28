package java.CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static int DobCalculator(String s) {
		LocalDate dob = LocalDate.parse(s); 
		
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears(); 
	}
	
	public static void main(String args[])throws Exception {
	ArrayList<User> list=new ArrayList<>();
	String s1="1999-03-02";
	String s2="1995-08-27";
	String s3="1993-04-15";
	String s4="1995-08-13";
	String s5="1995-08-03";

    list.add(new User("Suraj",DobCalculator(s1),s1));
	list.add(new User("Rajesh",DobCalculator(s1),s2));
	list.add(new User("Mahesh",DobCalculator(s1),s3));
	list.add(new User("Kiran",DobCalculator(s1),s4));
	list.add(new User("Sneha",DobCalculator(s1),s5));
	
//	//Comparing using AGE.
	Collections.sort(list,new AgeComparator());
	System.out.println("Compare with Age:");
	System.out.println(list);
//	
//	//Comparing Using Name.
	Collections.sort(list,User.NAMECOMP);
	System.out.println("Compare with Name Using anonymous object:");
	System.out.println(list);
//	
//	//Comparing Using Name.
	Collections.sort(list,new NameComparator());
	System.out.println("Compare with Name:");
	System.out.println(list);
//	
//	//Comparing Using DOB.
	Collections.sort(list,new DobComparator());
	System.out.println("Compare with DOB:");
	System.out.println(list);
	}
}
