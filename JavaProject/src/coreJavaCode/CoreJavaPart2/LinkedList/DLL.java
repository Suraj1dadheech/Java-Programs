package coreJavaCode.CoreJavaPart2.LinkedList;

public class DLL {
	private Node head;
	
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		node.prev=null;
		if(head != null)
			head.prev=node;
		head=node;
	}
	public  void  display() {
		if(head==null)
			System.out.println("list is empty");
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
		}
		System.out.println("\nEnd");
	}
	private class Node{
		private int value;
		private Node next;
		private Node prev;
		
		public Node(int value) { this.value=value; }
	}
}
