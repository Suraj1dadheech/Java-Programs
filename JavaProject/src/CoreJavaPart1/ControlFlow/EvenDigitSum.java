package CoreJavaPart1.ControlFlow;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        int sum = 0;
        while(number > 0){
            int rim = number%10;
            if(rim%2 == 0)
                sum += rim;
            number /= 10;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));		
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));

	}

}
