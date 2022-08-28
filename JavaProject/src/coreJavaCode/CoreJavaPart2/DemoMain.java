package coreJavaCode.CoreJavaPart2;


//class Outer{
//	private String name="Suraj";
//	private static int age=20;
//	public static class Inner{
//		public static void fun(Outer outer) {
//			System.out.println(Outer.age);
//			System.out.println(outer.name);
//		}
//		public void fun1(Outer outer) {
//			System.out.println(Outer.age);
//			System.out.println(outer.name);
//		}
//	}
//	Inner inner=new Inner();
//}
class Outer{
	private String name="Suraj";
	private static int age=20;
	public static class Inner{
		private int rr;
//		private static double gg=Math.PI;
//		public static void fun(Outer outer) {
//			System.out.println(Outer.age);
//			System.out.println(outer.name);
//		}
		public void fun1(Outer outer) {
			System.out.println(age);
			System.out.println(outer.name);
		}
	}
	Inner inner=new Inner();
}
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer =new Outer();
//		outer.inner.fun(outer);
		outer.inner.fun1(outer);

	}

}
