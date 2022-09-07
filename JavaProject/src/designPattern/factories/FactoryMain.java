package designPattern.factories;

import java.util.Currency;
import java.util.Locale;

public class FactoryMain {

	public static void main(String[] args) {
//		OS obj=new IOS();
//		obj.specificatins();
		

		
		
		OSFactory osf=new OSFactory();
		OS obj=osf.getInstance("close");
		obj.specificatins();

		
		
		
		
		
		String str=String.valueOf(34);
		
		//Java Example
		Locale lc = Locale.FRANCE;
	      Currency curr = Currency.getInstance(lc);
//
//	      // Print currency's code
	      System.out.println("Locale's currency code: " + curr.getCurrencyCode());
	  
		

	}

}
