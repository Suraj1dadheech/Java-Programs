package coreJavaCode.CoreJavaPart3.Collections.ComparableAndComparator.Theatre;


//Using Comparator and BinarySearch
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER=new Comparator<Seat>() {
    	public int compare(Seat seat1, Seat seat2) {
    		return (int)seat1.price-(int)seat2.price;
//    		if(seat1.getPrice() < seat2.getPrice())
//    			return -1;
//    		else if(seat1.getPrice() < seat2.getPrice())
//    			return 1;
//    		else
//    			return 0;    			
    	}
    	
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
            	double price=12.00;
            	if((row<'D') && (seatNum>=4 && seatNum<=9))
            		price=14.00;
            	else if((row>'F') || (seatNum<4 || seatNum>9))
            		price=7.00;
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
    	Seat requestedSeat=new Seat(seatNumber,0);
    	int foundSeat=Collections.binarySearch(seats, requestedSeat,null);
    	if(foundSeat >= 0) {
    		return seats.get(foundSeat).reserve();
    	}
    	System.out.println("there is no seat: "+seatNumber);
    	return false;
    	
//        Seat requestedSeat = null;
//        for(Seat seat : seats) {
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if(requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//
//        return requestedSeat.reserve();
    }
    
    public boolean cancelSeat(String seatNumber) {
        Seat requestedSeat = null;
        for(Seat seat : seats) {
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat like " + seatNumber+" For canceling");
            return false;
        }

        return requestedSeat.cancel();
    }

    // for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

		

		@Override
		public String toString() {
			return "Seat [seatNumber=" + seatNumber + ", price=" + price + "]";
		}

		public double getPrice() {
			return price;
		}

//		public void setPrice(double price) {
//			this.price = price;
//		}
		
		
    }
}