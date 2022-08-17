package CoreJavaPart3.Collections.ComparableAndComparator.Theatre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import CoreJavaPart3.Collections.BinarySearchAndListMethods.Theatre.Theatre.Seat;

public class Main {
	
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);

	    List<Theatre.Seat> reverseSeats=new ArrayList<>(theatre.getSeats());
	    Collections.reverse(reverseSeats);
	    System.out.println(reverseSeats);
	    
	    List<Theatre.Seat> priceSeats=new ArrayList<>(theatre.getSeats());
	    priceSeats.add(theatre.new Seat("B00",13.00));
	    priceSeats.add(theatre.new Seat("A00",13.00));
	    Collections.sort(priceSeats,Theatre.PRICE_ORDER);
	    System.out.println(priceSeats);

	    
	    
//	    if(theatre.reserveSeat("D12"))
//	    	System.out.println("Please pay for D12");
//	    else
//	    	System.out.println("Seat already reserved");
//	    
//	    if(theatre.reserveSeat("D12"))
//	    	System.out.println("Please pay for D12");
//	    else
//	    	System.out.println("Seat already reserved");
//	    
//	    if(theatre.reserveSeat("B13"))
//	    	System.out.println("Please pay for D12");
//	    else
//	    	System.out.println("Seat already reserved");

	    
    }
}