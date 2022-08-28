package java.CoreJavaPart3.Collections.BinarySearchAndListMethods.Theatre;

import java.CoreJavaPart3.Collections.BinarySearchAndListMethods.Theatre.Theatre.Seat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat:list)
			System.out.println(" "+seat.getSeatNumber());
	}
	public static void sortList(List<Theatre.Seat> list) {
		for(int i=0;i<list.size();i++)
			for(int j=i+1;j<list.size();j++)
				if(list.get(i).compareTo(list.get(j))>0)
					Collections.swap(list, i, j);
	}
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
	    
//	    Shallow Copy-> seats(existing Seat type ArrayList reference variable) 
//	    and seatCopy(newly Theatre.Seat type ArrayList reference variable) are 
//	    referring to same object.
	    List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
	    
//	    when we reserve seat for seat.get(1) which is A02 using seat object then it also
//	    reflects in seatCopy object that's why when we try to reserve theatre.reserveSeat("A02") 
//	    it says seat is already reserved because both are pointing the same object box.
	    seatCopy.get(1).reserve();
	    if(theatre.reserveSeat("A02"))
	    	System.out.println("Please pay for A02");
	    else
	    	System.out.println("Seat already reserved");

//	    if we reverse a seatCopy arrray then it only reverse it does't effect to other
//	    because both are different arraylist but points to only single object.
	    Collections.reverse(seatCopy);
	    System.out.println("seatCopy");
	    System.out.println(seatCopy);
	    
	    System.out.println("seats");
	    System.out.println(theatre.seats);
	    
	    Collections.shuffle(seatCopy);
	    System.out.println("Shuffled seatCopy");
	    System.out.println(seatCopy);
	    
	    sortList(seatCopy);
	    System.out.println("Sorted seatCopy");
	    System.out.println(seatCopy);
	    
	    
	    Theatre.Seat min=Collections.min(seatCopy);
	    Theatre.Seat max=Collections.max(seatCopy);
	    
	    System.out.println("Minimum: "+min+"\nMaximum: "+max);
//	    
//	    Deep Copy: here we try to do deep copy which means we are trying to make
//	    another object called newList where put the size of theatre.size now our array size is
//	    not exact it increases like (size*3/2)+1 as per their algo.
//	    so now if we want to copy then it should have fixed size with to whome you are 
//	    copying with but could't get fix size so we will get runTime error.
//	    {
//	    ArrayList<Theatre.Seat> newList=new ArrayList<>(theatre.seats.size());
//	    Collections.copy(newList, theatre.seats);
//      }Runtime Error--
	    
//        theatre.getSeats();
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.cancelSeat("H231")) {
//            System.out.println("Seat is cancelled now");
//        } else {
//            System.out.println("Sorry, seat was not allocated");
//        }
//        theatre.reserveSeat("H131");
        
    }
}