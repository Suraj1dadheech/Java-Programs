package dataStructure.SortingAlgos;

import java.util.Arrays;

class QuickSort {
	
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;		
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[low];
		int i=low,j=high;
		while(i<j) {
			while(arr[i]<=pivot) i++;
			
			while(arr[j]>pivot) j--;
			
			if(i<j)
				swap(arr,i,j);
		}
		swap(arr,j,low);
		
		return j;
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
		
		
	}
	
	public static void main(String args[]) {
	 int[] arr = { 8, 7, 2, 1, 0, 9, 6 };
	
	 QuickSort.quickSort(arr, 0, arr.length-1);
	
	 System.out.println(Arrays.toString(arr));
}

	
}
