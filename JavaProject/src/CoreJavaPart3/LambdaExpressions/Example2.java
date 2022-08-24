package CoreJavaPart3.LambdaExpressions;

@FunctionalInterface
interface InterSum{
	public int sum(int a, int b);
}
class Demo{
	int a;
	public Demo(int a) {
		this.a=a;
	}
	public void sum1(InterSum interSum) {
		System.out.println("Sum is: "+interSum.sum(20, 30));
	}
	public int getA() {
		return a;
	}
}
public class Example2 {
	public static void main(String[] args) {
		Demo d=new Demo(10);
		
		d.sum1(new InterSum() {
			
			@Override
			public int sum(int a, int b) {
				return a+b;
				
			}
		});
	}

}
