package CoreJavaPart1.ExpressioAndMethods;

public class EqualSumChecker {
	 public static boolean hasEqualSum(int a,int b, int c){
	        if(a+b==c)
	            return true;
	        return false;
	    }
	public static void main(String[] args)
	{
		System.out.println(hasEqualSum(1, 1, 1));	
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, 1, 0));
	}

}
