package CoreJavaPart1;

//Main class
class Main {
	public static int fun(int a,int b) {
//		System.out.println(a);
		return a+b;
	}
	public static double fun(double a,double b) {
//		System.out.println(a);
		return a/b;
	}
	public static void main(String[] args)
	{

		System.out.println(fun(10,20));
		System.out.println(fun(10.22,2.02));
	}
}
