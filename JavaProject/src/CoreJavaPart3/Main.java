package CoreJavaPart3;

import java.util.HashMap;

class Child {
		
}
public class Main{
	public static void main(String ars[]) {
		HashMap<String,Integer>  marks=new HashMap<String,Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 50);

}
}
