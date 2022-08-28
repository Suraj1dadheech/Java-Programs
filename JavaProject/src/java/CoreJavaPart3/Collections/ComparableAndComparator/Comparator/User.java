package java.CoreJavaPart3.Collections.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class User{
	public String name;
	public int age;
	public String dob;
	static Comparator<User> NAMECOMP=new Comparator<User>() {
		public int compare(User o1,User o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
	public User(String name, int age, String dob) {
		this.name=name;
		this.age=age;
		this.dob=dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	public String getDob() {
		return dob;
	}
	
	
}
