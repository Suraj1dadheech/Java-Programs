package dataStructure.LinkedList.Doublyll;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	public DoublyLinkedList(int value) {
		Node  newNode=new  Node(value);
		head=newNode;
		tail=newNode;
		length=1;
	}
	class Node{
		int value;
		Node next;
		Node prev;	
		
		public Node(int value) {
			this.value=value;
		}		
	}
	public void getHead() {
		System.out.println("Head: "+head.value);
	}
	
	public void getTail() {
		System.out.println("tail: "+tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+length);
	}
	
	public void printList() {
		if(length==0) { return;}
		Node temp=head;
		System.out.print("List: ");
		while(temp!=null) {
			System.out.print(temp.value+"  ");
			temp=temp.next;
		}
	}

	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else 
		{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		length++;		
	}

	public void removeLast() {
		if(length==1) {
			head=null;
			tail=null;
		}else {
			tail=tail.prev;
			tail.next=null;
		}
		length--;
		
	}

	public void prepend(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		}
		length++;
		
	}

	public void removeFirst() {
		if(length==0) return;
		if(length==1) {
			head=null;
			tail=null;
		}else {
			Node temp=head;
			head=head.next;
			head.prev=null;
			temp.next=null;
		}
		length--;	
	}

	public Node get(int index) {
		if(index<0 || index>=length) return null;
		int count=0;
		
		if(index<length/2) {
			Node temp=head;
			while(count!=index) {
				temp=temp.next;
				count++;
			}
			return temp;
		}else {
			count=length-1;
			Node temp=tail;
			while(count!=index) {
				temp=temp.prev;
				count--;
			}
			return temp;
		}
		
	}

	public boolean set(int index, int value) {
		Node temp=get(index);
		if(temp!=null) {
			temp.value=value;
			return true;
		}
		return false;
		
	}

	public void reversePrint() {
		if(length!=0) {
			Node temp=tail;
			while(temp!=null) {
				System.out.print(temp.value+" ");
				temp=temp.prev;
			}
		}
		
	}

	public boolean append(int index, int value) {
		if(index<0 || index>length) return false;
		if(index==0) {
			prepend(value);
			return true;
		}
		if(index==length) {
			append(value);
			return true;
		}
		Node before=get(index-1);
		Node newNode=new Node(value);
		newNode.next=before.next;
		before.next=newNode;
		newNode.prev=before;
		newNode.next.prev=newNode;
		length++;
		return true;
		
		
	}

	public Node remove(int index) {
		if(index==0) {
			removeFirst();
			return head;
		}
		if(index==length-1) {
			removeLast();
			return tail;
		}
		Node temp=get(index);
		if(temp!=null) {
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			temp.next=null;
			temp.prev=null;
			length--;
			return temp;
		}
		return null;
	}
	
}
