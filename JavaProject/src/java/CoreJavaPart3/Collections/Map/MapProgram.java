package java.CoreJavaPart3.Collections.Map;

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
		
//--------------------------------------------------------------------------------------------------------------------------------
//		remove the key and value and return the value otherwise returns false  if not present.
//		System.out.println(lang.remove("Hindi"));
//--------------------------------------------------------------------------------------------------------------------------------
		
//		remove the key and value by varifying wheather it presents there or not and returns boolean value.
//		if(lang.remove("English", "British"))
//				System.out.println("English Key value removed");
//		else
//			System.out.println("Key value Does't match");
		
//--------------------------------------------------------------------------------------------------------------------------------		
//		Check the key if presents and return boolean value
//		if(lang.containsKey("Java"))
//			System.out.println("java is already present");
//		else
//			lang.put("Java", "Invented in 1995");
		
//--------------------------------------------------------------------------------------------------------------------------------
//		returns the Value if Key actually exists and replace the newly value with existing if Key does't exist returns null
//		System.out.println(lang.replace("Kanadda", "Karnataka State Lang."));
//		System.out.println(lang.replace("Marwadi","Rajasthan State Lang."));
		
//		checks key and value if both are present then only replace with new value and return true  otherwise false
//		if(lang.replace("Kanadda", "Karnataka Lang.", "Karnataka State Lang."))
//			System.out.println("Replace succesfully");
//		else
//			System.out.println("Doesn't Matched up with parameter");
		
//--------------------------------------------------------------------------------------------------------------------------------
//		extracting keys from lang.keySet() and printing value usin lang.get(keys) methods
//		for(String key:lang.keySet())
//			System.out.println(key+" : "+lang.get(key));

//--------------------------------------------------------------------------------------------------------------------------------
//		it only prints Values
//	for(String value:lang.values())
//		System.out.println(value);
		
//--------------------------------------------------------------------------------------------------------------------------------
		//return boolean value wheather it presents on not !!
//		System.out.println(lang.containsValue("Karnataka Lang."));
	
	}
}
