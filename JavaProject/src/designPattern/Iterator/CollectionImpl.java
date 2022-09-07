package designPattern.Iterator;


public class CollectionImpl implements Collection {

	String inputArr[] = {"Suraj","Abhisek","Mohan","Rajesh","Ravi"};
	
	@Override
	public Iterator getIterator() {
		return new Itr();
	}
	
	private class Itr implements Iterator{

		int index =0;
		
		@Override
		public boolean hasNext() {
			if(index < inputArr.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return inputArr[index++];
			return null;
		}
	}
}