package dataStructure.Queues;

public class Main {

	public static void main(String[] args) {
		Queue myQueue=new Queue(10);
		
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		myQueue.enqueue(50);
		myQueue.enqueue(60);
		
		System.out.println("Element deleted: "+myQueue.Dequeue().value);
		System.out.println("Element deleted: "+myQueue.Dequeue().value);
		
		
		myQueue.getFirst();
		myQueue.getLast();
		myQueue.printQueue();

	}

}
