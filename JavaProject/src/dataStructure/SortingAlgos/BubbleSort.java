package dataStructure.SortingAlgos;

public class BubbleSort {
	int a,b;

	private static void BubbleFun(int[] arr) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
					BubbleSort obj=new BubbleSort();
					obj.a=arr[j];
					obj.b=arr[j+1];
					BubbleSort.swap(obj);
					arr[j]=obj.a;
					arr[j+1]=obj.b;
				}
			}
		}	
	}
	
	public static void swap(BubbleSort obj) {
		int temp=obj.a;
		obj.a=obj.b;
		obj.b=temp;
	}
	
	public static void main(String[] args) {
		int []arr= {4,2,6,5,1,3};
		BubbleFun(arr);
		for(int value:arr)
			System.out.print(value+" ");

	}
}
