package coreJavaCode.CoreJavaPart2.LinkedList;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size=0;
	}
	public void insert(int value) {
		Node temp=new Node(value);
		temp.next=head;
		head=temp;
		if(tail==null)
			tail=head;
		size++;
	}
	public void insertEnd(int value) {
		Node temp=new Node(value);
		if(head==null) {
			insert(value);
			return;
		}
		else {
			tail.next=temp;
			tail=temp;
			size++;
		}
	}
	public void display() {
		if(head==null)
			System.out.println("list is empty");
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
			System.out.println("\nSize is: "+size);
		}
	}
	public int deleteFirst() {
		int a=head.value;
		head=head.next;
		if(head==tail)
			tail=null;
		
		size--;
		return a;
	}
	public int deleteEnd() {
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;					
		}
		int a=tail.value;
		tail=temp;
		temp.next=null;
		return a;
		
	}
	public void insertPos(int pos, int value) {
		Node node=new Node(value);
		int count=0;
		Node temp=head;
		Node prev=head;
		while(count!=pos-1) {
			prev=temp;
			temp=temp.next;
			count++;
		}
		prev.next=node;
		node.next=temp;
	}
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
			this.next=null;
		}
	}
	

}
