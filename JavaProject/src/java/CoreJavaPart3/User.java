package java.CoreJavaPart3;

class Parent extends Child{
	public void fun() {
		System.out.println("This is parent class");
	}
}

class Child{
	public void fun() {
		System.out.println("This is child class");
	}
}

public class User {
	public static void main(String []args) {
		Child p=new Parent();
		p.fun();
	}
	
}
