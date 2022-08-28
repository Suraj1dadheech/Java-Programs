package java.CoreJavaPart3.Collections.ImmutableClasses;

import java.util.HashMap;
import java.util.Map;

public class Location {
	private final int locationId;
	private final String description;
	private final Map<String,Integer> exits;
	
	public Location(int locationId,String description, Map<String,Integer> exits) {
		this.locationId=locationId;
		this.description=description;
		//we are making new object  first then assigning to the exists to that both object couldn't point to the same address block
		//we have  kept our class immutable
		if(exits != null)
			this.exits=new HashMap<String,Integer>(exits);
		else
			this.exits=new HashMap<String,Integer>();
		this.exits.put("Q", 0);
	}

	public void addExit(String direction, int location) {
		exits.put(direction,location);
	}
	

	public String getDescription() {
		return description;
	}
	

	public Map<String, Integer> getExists() {
		//we are making new object  first then returning so that it couldn't point to the  same address block
		//we have  kept our class immutable
		return new HashMap<String,Integer>(exits);
	}
	
	

}
