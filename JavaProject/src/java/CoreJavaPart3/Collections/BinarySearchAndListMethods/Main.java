package java.CoreJavaPart3.Collections.BinarySearchAndListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator itr=list.iterator();
		
//		for(Integer value:list) {
//			if(value==(Object)30)
//				list.remove(value);
//		}
		
//		long A=System.currentTimeMillis()
		
//		while(itr.hasNext()) {
////			System.out.println(itr.next());
//			if(itr.next()==(Object)40)
//				itr.remove();
//			
//		}
		
//		list.remove(0);
		
		for(Integer value:list)
			System.out.print(value+"  ");

	}

}
