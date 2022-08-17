package CoreJavaPart3.Collections.ComparableAndComparator.Comparable;

public class User implements Comparable<User> {
	String name;
	int age;
	public User(String name, int age) {
		this.name=name;
		this.age=age;
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
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	//Comparing using Age.
	@Override
	public int compareTo(User user) {
		return this.age-user.age;
	} 
	
	
	//Comparing using Name.
//	@Override
//	public int compareTo(User user) {
//		return this.name.compareToIgnoreCase(user.name);
//
//	}
	
}
