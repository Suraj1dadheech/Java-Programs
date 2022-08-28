package coreJavaCode.CoreJavaPart3.Collections.ImmutableClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static Map<String, String> vocabulary = new HashMap<String, String>();
        
    public static void main(String arg[]) {

    	Map<String,Integer> tempExit=new HashMap<String,Integer>();
    	tempExit.put("Q", 0);
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
     
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit=new HashMap<String,Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
        
        tempExit=new HashMap<String,Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
        
        
        tempExit=new HashMap<String,Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
        
        
        tempExit=new HashMap<String,Integer>();        
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
        
        
        
    	vocabulary.put("EAST", "E");
    	vocabulary.put("WEST", "W");
    	vocabulary.put("NORTH", "N");
    	vocabulary.put("SOUTH", "S");
    	vocabulary.put("QUITE", "Q");
    	
    	int loc=1;
    	while(true) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println(locations.get(loc).getDescription());
    		if(loc==0)
    			break;
    		Map<String,Integer> exits=locations.get(loc).getExists();
    		for(String Key:exits.keySet())
    			System.out.print(Key+", ");
    		System.out.println("Enter the Direction/n");
    		String direction=sc.nextLine().toUpperCase();
    		if(direction.length()>1) {
    			String []words=direction.split(" ");
    			for(String word:words) {
    				if(vocabulary.containsKey(word)) {
    					direction=vocabulary.get(word);
    					break;
    				}
    			}
    		}

    		if(exits.containsKey(direction)) 
    			loc=exits.get(direction);
    		else
    			System.out.println("don't go this side");
    		sc.close();
    		
    	}
    	System.out.println("out of the programe");
   }  
    
}
