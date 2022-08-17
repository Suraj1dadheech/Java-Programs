package CoreJavaPart1.ControlFlow;

public class NumberPalindrome {
	 public static boolean isPalindrome(int number){
	        number = (number < 0 ? -number : number);
	        int value = number;
	        int rev = 0;
	        while(value > 0){
	            int rim = value % 10;
	            rev = (rev*10) + rim;
	            value /= 10;
	        }
	        if(number == rev)
	            return true;
	        return false;
	    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));		
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}

}
