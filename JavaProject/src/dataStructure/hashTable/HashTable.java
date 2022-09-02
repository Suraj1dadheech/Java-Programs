package dataStructure.hashTable;

import java.util.ArrayList;
import java.util.List;

public class HashTable
{
	private int size=7;
	private Node[] dataMap;
	
	
	class Node
	{
		String key;
		int value;
		Node next;
		
		
		Node(String key,int value)
		{
			this.key=key;
			this.value=value;
		}
	}
	
	public HashTable() {
		dataMap=new Node[size];
	}
	
	public int hash(String key) {
		int hash = 0;
		char []keyChar=key.toCharArray();
		for(int i=0;i<keyChar.length;i++) {
			int asciiValue=keyChar[i];
			hash=(hash+asciiValue*23)%dataMap.length;
		}
		return hash;
	}

	public void printTable() {
		for(int i=0;i<dataMap.length;i++) {
			System.out.print(i+":");
			Node temp=dataMap[i];
			while(temp != null) {
				System.out.print("[Key: "+temp.key+",value:"+temp.value+"] ");
				temp=temp.next;
			}			
			System.out.println();
		}

	}

	public void set(String key, int value) {
		Node newNode = new Node(key,value);
		int index=hash(key);
		if(dataMap[index] == null)
		{
			dataMap[index] = newNode;
			return;
		}else {
			Node temp=dataMap[index];
//			if(temp.key==key) {
//				temp.value=value;
//				return;
//			}
			while(temp.next!=null) {
				temp=temp.next;
//				if(temp.key==key) {
//					temp.value=value;
//					return;
//				}
			}
			temp.next=newNode;
			
		}
		
	}

	public int get(String key) {
		int index=hash(key);
		Node temp=dataMap[index];
		while(temp!=null){
			if(temp.key==key)
				return temp.value;
			temp=temp.next;
		}
		return -1;
	}

	public List<String> getKeys() {
		List<String> list=new ArrayList<String>();
		for(int i=0;i<dataMap.length;i++) {
			Node temp=dataMap[i];
			while(temp!=null) {
				list.add(temp.key);
				temp=temp.next;
			}
		}
		return list;
	}
	
}

	



