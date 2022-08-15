package CoreJavaPart1.ControlFlow;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage(){
        int sum=0,avg=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            boolean isInt=sc.hasNextInt();
            if(isInt)
            {
                int number=sc.nextInt();
                sum+=number;
                avg++;
            }
            else
                break;
        }
        System.out.println("SUM = "+sum+" AVG = "+Math.round((double)sum/avg));
        sc.close();
    }
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
		
	}

}
