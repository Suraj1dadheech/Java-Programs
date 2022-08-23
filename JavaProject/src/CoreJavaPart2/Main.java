package CoreJavaPart2;

//interface I1{
//	int a=0;
//	public Number fun();
//}
 class Parent{

//	public Parent(int x,int y) {a++;}
	protected Number fun() {
		System.out.println("Parent fun: ");
		return 33;
	}

}

class Child {

//	public Child(int x, int y) {
//		super(x, y);
//		// TODO Auto-generated constructor stub
//	}
static {
	System.out.println("This is static block");
}

	public static Integer fun() {
		System.out.println("Child fun");
		return 33;
	}
}
public class Main{
	static int a=10;
	public static void main(String []arg) {
		Child p=new Child();
		System.out.println(Child.fun());

	
	}  // object number Integer Float
}
