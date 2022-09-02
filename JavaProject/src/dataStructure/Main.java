package dataStructure;

interface I1{
	public void fun()throws Exception;
}

public class Main {

	public static void main(String[] args) {
		I1 i=()->{System.out.println("This is fun");
		System.out.println("this is true");
		throw new Exception();
			};
		try {
		i.fun();
		}catch(Exception e)
		{e.printStackTrace();}

	}

}
