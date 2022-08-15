package CoreJavaPart2.LinkedList;

public class CLL {
	private Node head=null;
	private Node tail=null;
	
	public void insertFirst(int value) {
		Node node=new Node(value);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.next=node;
		node.next=head;
		tail=node;
	}
	public void display() {
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node temp=head;
		do {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}while(temp != head);
	}
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value=value;
		}
	}

}
