package dataStructure.SortingAlgos;

public class SelectionSort {
	
	private static void SelectionFun(int[] arr) {
		int minIndex;
		for(int i=0;i<arr.length;i++) {
			minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			if(i!=minIndex) {
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {4,2,6,5,1,3};
		SelectionFun(arr);
		for(int value:arr)
			System.out.print(value+"  ");

	}

}
