package CoreJavaPart1;

import java.util.ArrayList;
import java.util.Collections;

class Demo{
 public String name;
}


public class HelloWorld{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		ArrayList<Integer> list1=new ArrayList<>(list.size());
		System.out.println(list1.size());

		Collections.copy(list1, list);
	}

	
}


