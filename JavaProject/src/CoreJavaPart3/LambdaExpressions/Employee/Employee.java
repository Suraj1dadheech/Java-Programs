package CoreJavaPart3.LambdaExpressions.Employee;

public class Employee {
	private String name;
	private int age;
	
	public Employee(String  name,int age) {
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
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}

interface UpperConcat{
	public  String upperAndConcat(String s1,String s2);
}

class AnotherClass{
	public String doSomething() {
		final int i=10;
		UpperConcat uc=new UpperConcat() 
		{
			int a=0;
			@Override
			public String upperAndConcat(String s1, String s2) 
			{
				a++;
//				i++;
				System.out.println(i+"  "+a);
				return s1.toUpperCase()+s2.toUpperCase();
			}
		};
		
		System.out.println(i);
		
		return Main.doStringStuff(uc, "String-1 ", "String-2");

	}
}




