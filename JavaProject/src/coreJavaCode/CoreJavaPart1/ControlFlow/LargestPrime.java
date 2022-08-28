package coreJavaCode.CoreJavaPart1.ControlFlow;

public class LargestPrime {
	public static int getLargestPrime(int number)
	{
		if(number<1) 
			return -1;
		int fact=-1;
		
		while(number%2 == 0) 
		{
			fact = 2;
			number /= 2;
		}
		
		for(int i=3;i<=Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				fact=i;
				number/=i;
			}
		}
//		if(number>2)
			fact= number;
		
		return fact;
	
    }
	public static void main(String[] args) {
		System.out.println(getLargestPrime(287));

	}

}
