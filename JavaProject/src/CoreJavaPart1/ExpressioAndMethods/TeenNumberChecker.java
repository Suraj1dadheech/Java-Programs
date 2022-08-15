package CoreJavaPart1.ExpressioAndMethods;

public class TeenNumberChecker {
	 public static boolean hasTeen(int a, int b, int c){
	        if(a>12 && a<20)
	            return true;
	            
	        if(b>12 && b<20)
	            return true;
	            
	        if(c>12 && c<20)
	            return true;
	        return false;
	    }
	    public static boolean isTeen(int a){
	        if(a>12 && a<20)
	            return true;
	        return false;
	    }
	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));		
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));
		
		System.out.println(isTeen(9));
		System.out.println(isTeen(13));

	}

}
