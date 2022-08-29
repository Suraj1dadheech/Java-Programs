package dataStructure.Stack;

public class Main {

	public static void main(String[] args) {
			Stack myStack=new Stack(10);
			
			
			myStack.push(20);
			myStack.push(30);
			myStack.push(40);
			myStack.push(50);
			
			System.out.println("Popped Item: "+myStack.pop().value);
			System.out.println("Popped Item: "+myStack.pop().value);
			
			myStack.getTop();
			myStack.getHeight();
			myStack.printStack();

	}

}
