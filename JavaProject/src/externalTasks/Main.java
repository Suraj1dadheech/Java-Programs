package externalTasks;

import java.util.ArrayList;
class Test<T>{
	ArrayList<T> list=new ArrayList<>();
	public void addElement(T element) {
		list.add(element);
	}
	public String toString() {
		return list.toString();
	}
}
public class Main {
	public static void  main(String []args) {
		Test<String> list=new Test<>();
		list.addElement("Suraj");
		
		Test<Integer> list1=new Test<>();
//		list1.
		list1.addElement(4);
	}

}
