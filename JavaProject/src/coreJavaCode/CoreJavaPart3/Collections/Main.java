package coreJavaCode.CoreJavaPart3.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparable<User>{
	private String name;
	private int age;
	private int roll;
	
	public static Comparator<User> sortAge=new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.age-o2.getAge();
		}
		
	};
	
	public static Comparator<User> sortName=new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.name.compareTo(o2.name);
		}
		
	};
	
	public User(String name,int age,int roll) {
		this.name=name;
		this.age=age;
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRoll() {
		return roll;
	}
	
	@Override
	public int compareTo(User o) {
		return this.age-o.age;
	}
	
	
	
}

public class Main {
	public static void  main(String []args) {
	User obj1=new User("Suraj1",21,4);
	User obj2=new User("Suraj2",24,8);
	User obj3=new User("Suraj3",19,2);
	User obj4=new User("Suraj4",17,3);
	User obj5=new User("Suraj5",22,5);
	
	List<User> userList=new ArrayList<User>();
	userList.add(obj1);
	userList.add(obj2);
	userList.add(obj3);
	userList.add(obj4);
	userList.add(obj5);
	
	System.out.println("SortBy age");
	Collections.sort(userList,User.sortAge);
	userList.forEach(t->System.out.println(t.getName()+"   "+t.getAge()+"  "+t.getRoll()));
	
	
	System.out.println("SortBy Name");
	Collections.sort(userList,User.sortName);
	userList.forEach(t->System.out.println(t.getName()+"   "+t.getAge()+"  "+t.getRoll()));
	
	
	System.out.println("SortBy Roll");
	Collections.sort(userList,new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.getRoll()-o2.getRoll();
		}
		
	});
	
	userList.forEach(t->System.out.println(t.getName()+"   "+t.getAge()+"  "+t.getRoll()));
	
	System.out.println("SortBy age using comparable");
	Collections.sort(userList);
	userList.forEach(t->System.out.println(t.getName()+"   "+t.getAge()+"  "+t.getRoll()));
	


}
}