package coreJavaCode.CoreJavaPart3.Collections.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> itr=list.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println(itr.next());     //10
		System.out.println(itr.hasNext());	
		
		System.out.println(itr.next());//20
		System.out.println(itr.hasNext());//t
		
		
		System.out.println(itr.next()); //30
		System.out.println(itr.hasNext()); //t
		
//		itr.remove();
		
		System.out.println(itr.next());  //40
		System.out.println(itr.hasNext());//f
		
		System.out.println(itr.next());  //40
		System.out.println(itr.hasNext());//f
		
		
		HashSet hs = new HashSet();
		
		TreeSet t=new TreeSet();
		
		System.out.println(list.contains(20));
		
		System.out.println("*****************Map*********************");
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Suraj1");
		map.put(2, "Suraj2");
		map.put(3, "Suraj3");
		map.put(4, "Suraj4");
		map.put(5, "Suraj");
		Iterator<Integer> mapItr=map.keySet().iterator();
		
		map.entrySet();
		
		while(mapItr.hasNext()) {
			String item=map.get(mapItr.next());
			if(item.equals("Suraj2"))
				mapItr.remove();
		}
		mapItr=map.keySet().iterator();
		while(mapItr.hasNext()) {
			System.out.println(map.get(mapItr.next()));
		}
		
		System.out.println();
		Map<Integer,String> map1=new HashMap<>();
		
		map1.put(4, "Raju");
//		map1.put(null, "Paistan");
		map1.put(1,"Suraj");
		map1.put(2, "Mahesh");
//		map1.put(null, "Mahesh");
		for(Integer key:map1.keySet())
			System.out.println(key+"   "+map1.get(key));
		map1.put(1, "Jignesh");
		for(Integer key:map1.keySet())
			System.out.println(key+"   "+map1.get(key));
		
		System.out.println("Sorting in map");
		TreeMap<Integer,String> tap1=new TreeMap<>(map1);
		System.out.println((tap1));
		
		
	}

}
