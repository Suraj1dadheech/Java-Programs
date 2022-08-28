package java.CoreJavaPart1.ExpressioAndMethods;

public class MinutesToYearsDaysCalculator {
	public static void  printYearsAndDays(long minutes){
		
        if(minutes < 0)
            System.out.println("Invalid Value");
       else
       {
	        int year = (int)minutes/525600;
	        int day = (int)minutes%525600;
	        if(day > 0)
	        	day /= 1440;
	        System.out.println(minutes+" min = " + year + " y and "+ day + " d");
       }
    }
	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600); 
	}

}
