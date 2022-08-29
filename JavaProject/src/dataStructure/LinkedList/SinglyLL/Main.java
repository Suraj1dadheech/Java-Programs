package dataStructure.LinkedList.SinglyLL;

public class Main {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		
		
		myLinkedList.append(10);
		myLinkedList.append(20);
		myLinkedList.append(30);
		myLinkedList.append(40);
		myLinkedList.append(50);
		
//		System.out.println("Inserted: "+myLinkedList.append(3,25));
//		
//		System.out.println("ValueSet: "+myLinkedList.set(4,31));
//		
//		
//		System.out.println("Removed: "+myLinkedList.remove(4).value);
		
//		myLinkedList.removeLast();
		
//		myLinkedList.prepend(2);
		
//		System.out.println("Element Removed: "+
//		myLinkedList.removeFirst();
		
		//4 10 20 30 40 50                  
//		System.out.println("Element: "+myLinkedList.get(7));
		
		System.out.print("List: ");
		myLinkedList.PrintList();
		System.out.println();
		myLinkedList.reverse();
		System.out.print(" Reversed List: ");
		myLinkedList.PrintList();
		System.out.println();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();

	}

	

}
