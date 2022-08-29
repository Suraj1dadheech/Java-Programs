package dataStructure.LinkedList.Doublyll;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList myDLL=new DoublyLinkedList(10);
		
		
		myDLL.append(20);
		myDLL.append(30);
		myDLL.append(40);
		myDLL.append(50);
		myDLL.append(60);
		myDLL.append(70);
		myDLL.append(80);
		myDLL.append(90);
		myDLL.append(100);
		
//		System.out.println(myDLL.get(6).value);
		
//		myDLL.set(4,45);
//		myDLL.append(8,45);

//		myDLL.prepend(5);
		
//		myDLL.removeFirst();
//		myDLL.removeLast();
		
		System.out.println("Removed: "+myDLL.remove(4).value);
		
		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		
//		myDLL.printList();

		myDLL.reversePrint();
		
		
		
		

	}

}
