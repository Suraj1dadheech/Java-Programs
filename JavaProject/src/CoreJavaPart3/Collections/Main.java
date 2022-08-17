package CoreJavaPart3.Collections;

interface Demo{
	static int a=10;
	public void fun(int a);
}
public class Main implements Demo {
	public void fun(int a) {
		System.out.println("value is: "+a);
	}
	public static void main(String ar[]) {
		Demo d=new Main();
		d.fun(10);
	}

}
