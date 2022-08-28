package java.CoreJavaPart1.ControlFlow;

public class SharedDigit {
	public static boolean hasSharedDigit(int a, int b){
		
        if((a > 9 && a < 100) && (b > 9 && b < 100)){
            String A = String.valueOf(a);
            String B = String.valueOf(b);
           
            for(int i=0;i<A.length();i++){
                for(int j=0;j<B.length();j++){
                    if(A.charAt(i)==B.charAt(j))
                        return true;
                }
            }
            return false;
        }
        else
            return false;
    }
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));		
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));

	}

}
