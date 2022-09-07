package dataStructure.SortingAlgos;

public class BubbleSort {
	private static void BubbleFun(int[] arr) {
		int n=6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					BubbleSort.swap(arr,j,j+1);
				}
			}
		}	
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String[] args) {
		int []arr= {4,2,6,5,1,3};
		BubbleFun(arr);
		for(int value:arr)
			System.out.print(value+" ");

	}
}
