package java.CoreJavaPart2.CompAndEncAndPoly.Encapsulation;

public class Printer {
	 private int tonerLevel;
	    private int pagesPrinted;
	    private boolean duplex;
	    public Printer(int tonerLevel, boolean duplex){
	        this.pagesPrinted=0;
	        this.tonerLevel=tonerLevel>-1 && tonerLevel<101?tonerLevel:-1;
	        this.duplex=duplex;
	    }
	    public int addToner(int tonerAmount){
	        if(tonerAmount>0 && tonerAmount<101){
	            if((this.tonerLevel+tonerAmount)>100)
	                return -1;
	            else
	                return this.tonerLevel+=tonerAmount;
	        }
	        else
	            return -1;
	    }
	    public int printPages(int pages){
	        int pagesToPrint=pages;
	        if(duplex){
	            pagesToPrint=(pages/2)+(pages%2);
	            System.out.println("Printing in duplex mode");
	            pagesPrinted+=(pages/2)+(pages%2);
		        return pagesToPrint;
	        }
	        else {
	        	pagesPrinted+=pagesToPrint;
	        	return pagesToPrint;
	        }
	    }
	    public int getPagesPrinted(){ return pagesPrinted;}
	   
	 
	    
	public static void main(String[] args) {
		Printer printer = new Printer(50, false); 
		System.out.println(printer.addToner(50));  //100
		System.out.println("initial page count = " +printer.getPagesPrinted());  //0
		int pagesPrinted = printer.printPages(5);//2
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());//2 2
		pagesPrinted = printer.printPages(3);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());//1 3
	}

}
