package designPattern.Iterator;

public class IteratorClientTest {

	public static void main(String[] args) {
		
		Collection collection = new CollectionImpl();
		
		Iterator iterator = collection.getIterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
}