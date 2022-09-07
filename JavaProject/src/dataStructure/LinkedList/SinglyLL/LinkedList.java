package dataStructure.LinkedList.SinglyLL;

public class LinkedList 
{
	private Node head;
	private Node tail;
	private int length;
	
	public LinkedList(int value)    //linked list Class Constructor
	{
		Node newNode=new Node(value);
		tail=newNode;
		head=newNode;
		length=1;
	}
	
	

	class Node   // inner Node Class
	{
		int value;
		Node next;
		
		public Node(int value)		 //inner Node Class Constructor
		{ 	this.value=value;  }	
	}

	void PrintList()				//printing the nodes
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"  ");
			temp=temp.next;
		}
	}

	public void getHead() {
		if(this.head!=null)
			System.out.println("Head: "+head.value);
	}

	public void getTail() {
		if(this.tail!=null)
			System.out.println("Tail: "+tail.value);
	}

	public void getLength() {
		System.out.println("Length: "+length);
		
	}

	public void append(int value) {
		Node newNode=new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=tail.next;   //or we can also write "tail=newNode"
		}
		length++;
		
	}
	
	// 4 10 20 30 40 50
	public boolean append(int index,int value) {
		if(index<0 || index>length)
			return  false;
		if(index==0) {
			prepend(value);
			return true;
		}
		if(index==length) {
			append(value);
			return true;
		}
		Node newNode=new Node(value);
		Node temp=get(index-1);
		newNode.next=temp.next;
		temp.next=newNode;
		length++;		
		return true;
		
	}

	public Node removeLast() {
		if(length==0) return null;
		if(length==1) 
		{
			head=null;
			tail=null;
			length--;
			return null;
		}
		
		Node temp=head;
		while(temp.next!=tail)
		{	temp=temp.next;   }
		
		Node t=temp.next;
		temp.next=null;
		tail=temp;
		length--;
		return t;
				
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length==0) {
			head=newNode;
			tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		System.out.println("Element prepended: "+newNode.value);
		length++;
	}

	public Node removeFirst() {
		if(length==0) {	System.out.println("list is empty  nothig to delete"); return null;}
//		if(length==1) {	head=null; tail=null; length--; return;	}
		Node temp=head;
		head=head.next;
		System.out.println("Element deleted: "+temp.value);
		length--;
		if(length==0)
			tail=null;
		return temp;
	}

	public Node get(int index) {
		if(index<0 || index>=length)
			return  null;
		int count=0;
		Node temp=head;
		while(count!=index) {
			temp=temp.next;
			count++;
		}		
		return temp;
	}

	public boolean set(int index, int value) {
		if(index<0 || index>=length)
			return  false;
		Node temp=get(index);
		temp.value=value;		
		return true;
	}

	public Node remove(int index) {
		if(index==0) { return removeFirst(); }
		if(index==length-1) { return removeLast(); }
		Node temp=get(index-1);
		if(temp!=null) {
			temp.next=temp.next.next;
			length--;
			return temp;
		}
		return null;
	}

	public void reverse() {
		if(length==0)
		{System.out.println("List is empty"); return;}
		
		Node cur=head;
		head=tail;
		tail=cur;
		Node after=cur.next;
		
		Node before=null;		
		for(int i=0;i<length;i++){
			after=cur.next;
			cur.next=before;
			before=cur;
			cur=after;
		}
		
//		System.out.println("value: ?"+before.value);
		
		
		
		//My  logic
//		while(true)
//		{
//			cur.next=prev;
//			prev=cur;
//			cur=temp;
//			if(cur==null) 
//			{
//				head=prev;
//				return;
//			}
//			after=after.next;
//		}
		
	}

	
}
