package CoreJavaPart1.ControlFlow;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0)
            return -1;
        if(number==0)
            return 0;
        int l=number%10;
        int digits = (int)Math.log10(number);
        
        System.out.println(number+" no: "+digits);
		
        number = (int)(number / (int)(Math.pow(10, digits)));
		return number+l;
    }
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));

	}

}

//       2=(int)2.22/100;