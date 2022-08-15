package CoreJavaPart1.ExpressioAndMethods;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double a,double b){
       	if((int)a != (int)b)
			return false;
		String value = String.valueOf((int)a);
		int size = value.length();
		int count = 0;
		String A = String.valueOf(a);
		String B = String.valueOf(b);
		for(int i = size+1; i < A.length(); i++){
		    count++;
		    if(count > 3)
		        break;
			if(A.charAt(i) != B.charAt(i))
				return false;
		}
		return true;
    }
	

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.0,3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
	}

}
