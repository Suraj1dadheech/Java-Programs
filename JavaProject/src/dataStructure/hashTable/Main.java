package dataStructure.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		HashTable myHashTable=new HashTable();
		myHashTable.set("Suraj",50);
		myHashTable.set("Mahesh",23);
		myHashTable.set("Raju",54);
		myHashTable.set("Srinivas",12);
		myHashTable.set("harish",78);
		myHashTable.set("Rakesh",45);
		myHashTable.set("Suraj",12);
		myHashTable.set("Ravish",90);
		myHashTable.set("Srinivas",24);
		myHashTable.set("Sneha",23);
		myHashTable.set("Raju",67);
		myHashTable.set("Garima",43);
		myHashTable.set("Monika",91);
		myHashTable.set("harish",526);
		myHashTable.set("Anchal",82);
		myHashTable.set("Suraj",17);
		myHashTable.set("Raju",37);
		myHashTable.set("Srinivas",31);
		myHashTable.set("Ravish",91);
		myHashTable.set("Suraj",71);
		
		System.out.println("*************************HashTable***********************************");
		myHashTable.printTable();
		
		System.out.println("*************************get Value Using Key**********************************");
		System.out.println("[Key: harish, Value:"+myHashTable.get("harish"));
		System.out.println("[Key: Raju, Value:"+myHashTable.get("Raju"));
		System.out.println("[Key: Garima, Value:"+myHashTable.get("Garima"));
		System.out.println("[Key: Sneha, Value:"+myHashTable.get("Sneha"));
		
		
		System.out.println("***************Get all the Keys*******************");
		List<String> allKeys=new ArrayList<>(myHashTable.getKeys());
		System.out.println("Keys: "+allKeys);
		
			
	}

}
