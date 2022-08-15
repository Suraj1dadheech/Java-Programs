package CoreJavaPart1.ControlFlow;

public class NumberToWords {
	public static void numberToWords(int number)
	{
		  if(number<0)
		  {
		    System.out.println("Invalid Value");
		    return;
		  }
		   
			String str=String.valueOf(number);
			int size=str.length();
			for(int i=0;i<size;i++)
			{
				int choice=str.charAt(i)-'0';
				switch(choice)
				{
					case 0: System.out.print("Zero");
					break;
					case 1: System.out.print("One");
					break;
					case 2: System.out.print("Two");
					break;
					case 3: System.out.print("Three");
					break;
					case 4: System.out.print("Four");
					break;
					case 5: System.out.print("Five");
					break;
					case 6: System.out.print("Six");
					break;
					case 7: System.out.print("Seven");
					break;
					case 8: System.out.print("Eight");
					break;
					case 9: System.out.print("Nine");
					break;
				}
				if(i!=size-1)
					System.out.print(" ");
			}
			
	}
	public static int reverse(int number) 
	{
		int rev = 0;
		while(number != 0)
		{
			int digit = number % 10;
			rev = (rev * 10) + digit;
			number /= 10;
		}
		return rev;
	}
	public static int getDigitCount(int number)
	{
		if(number < 0)
			return -1;
		String str=String.valueOf(number);
		return str.length();
	}
	
		
	public static void main(String[] args) {

			System.out.println(getDigitCount(123));
			System.out.println(getDigitCount(-12));
			System.out.println(getDigitCount(5200));
			
			System.out.println(reverse(-121));
			System.out.println(reverse(1212));
			System.out.println(reverse(1234));
			System.out.println(reverse(100));
			
			numberToWords(123);
			System.out.println();
			numberToWords(1010);
			System.out.println();
			numberToWords(1000);
			System.out.println();
			numberToWords(-12);
	}

}
