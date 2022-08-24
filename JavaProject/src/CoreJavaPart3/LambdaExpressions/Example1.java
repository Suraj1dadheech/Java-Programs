package CoreJavaPart3.LambdaExpressions;

@FunctionalInterface
interface myInter{
	public abstract void fun();
}
@FunctionalInterface
interface sumInter{
	public abstract int sum(int a,int b);
}
@FunctionalInterface
interface lenInter{
	public abstract int length(String str);
}
public class Example1 {

	public static void main(String[] args) {
		//Using anonymous Class
		myInter i0=new myInter() {
		@Override
		public void fun() {
			System.out.println("this  is i object");
			
		}};
		
		myInter i1=new myInter() {
		@Override
		public void fun() {
			System.out.println("This is i1 object");
		}};
		
		i0.fun();
		i1.fun();
		
		//Using lambda expression
		myInter i2=()->{System.out.println("This is lambda function");};
		//Using lambda expression without braces
		myInter i3=()->System.out.println("This is lambda function without curly braces if we have one line of statement");
		i2.fun();
		i3.fun();

		
		//using lambda function for the parameter type
		sumInter a1=(int a,int b)->{return a+b;};
		//using lambda  function by removing  braces datatype and returntype
		sumInter a2=(a,b)->a+b;
		
		System.out.println("Sum is: "+a1.sum(20, 30));
		System.out.println("Sum is: "+a2.sum(50, 100));
	
		
		//using lambda  function for returning  the String  length
		lenInter l1=str->str.length();
		System.out.println(l1.length("Suraj"));
		
		
		Runnable thread1=()->{
				int i;
				for(i=1;i<11;i++) {
					System.out.println("Numbers: "+i);
					try {
						Thread.sleep(1000);
					}catch(Exception e) { e.printStackTrace();}
				}
			};
			
		Thread t=new Thread(thread1);
		t.start();
		
		
//		Runnable thread2=()->{
//			int i;
//			for(i=1;i<11;i++) {
//				System.out.println("Table: "+i*2);
//				try {
//					Thread.sleep(1000);
//				}catch(Exception e) { e.printStackTrace();}
//			}
//		};
		
		new Thread(()->{
			int i;
			for(i=1;i<11;i++) {
				System.out.println("Table: "+i*2);
				try {
					Thread.sleep(1000);
				}catch(Exception e) { e.printStackTrace();}
			}
		}).start();
//		t1.start();
	}

}
