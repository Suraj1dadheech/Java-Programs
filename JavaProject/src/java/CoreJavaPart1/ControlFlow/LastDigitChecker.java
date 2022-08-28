package java.CoreJavaPart1.ControlFlow;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int a,int b, int c){
        if((a > 9 && a <= 1000) && (b > 9 && b <= 1000) && (b > 9 && b <= 1000)){
            if((a%10 == b%10) || (b%10 == c%10) || (c%10 == a%10))
                return true;
            return false;
        }
        else
            return false;
    }
    public static boolean isValid(int a){
        if(a > 9 && a <= 1000)
            return true;
        return false;
    }
	public static void main(String[] args) {
		
		System.out.println(hasSameLastDigit (41, 22, 71)); 
		System.out.println(hasSameLastDigit (23, 32, 42));
		System.out.println(hasSameLastDigit (9, 99, 999));
		
		System.out.println(isValid(10)); 
		System.out.println(isValid(468));
		System.out.println(isValid(1051));

	}

}
