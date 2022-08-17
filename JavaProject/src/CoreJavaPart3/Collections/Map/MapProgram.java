package CoreJavaPart3.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
	public static void main(String []args) {
		Map<String,String> lang=new HashMap<>();
		lang.put("Java", "Programming Lang.");
		lang.put("Hindi", "Indian Lang.");
		lang.put("English", "British Lang.");
		lang.put("Kanadda", "Karnataka Lang.");
		lang.put("Marathi", "Maharastra Lang.");
		
//		if(lang.containsKey("Java"))
//			System.out.println("java is already present");
//		else
//			lang.put("Java", "Invented in 1995");
		
		for(String key:lang.keySet())
			System.out.println(key+" : "+lang.get(key));
	
	for(String value:lang.values())
		System.out.println(value);
	
		System.out.println(lang.containsValue("Karnataka Lang."));
	
	}
}
