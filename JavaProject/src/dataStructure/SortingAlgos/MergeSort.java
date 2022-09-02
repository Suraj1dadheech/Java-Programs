package dataStructure.SortingAlgos;

public class MergeSort {
	public static int[] merge(int []arr,int l,int mid,int r) {
		int index=0;
		int i=l;
		int j=mid;
		while(i<j && j<r) {
			if(arr[i]<arr[j]) 
				arr[index++]=arr[i++];
			else
				arr[index++]=arr[j++];
		}
		
		while(i<mid)
			arr[index++]=arr[i++];
		
		while(j<r)
			arr[index++]=arr[j++];
		
		return arr;
		
	}
	
	private static int[] mergeSort(int[] arr,int l,int r) {
		if(l>r) return arr;
		int mid=(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid,r);
		return merge(arr,l,mid,r);
		
	}
	
	public static void main(String[] args) {
		int []arr= {5,4,7,1,3,2,8,6};
		arr=MergeSort.mergeSort(arr,0,arr.length);
		for(Integer value:arr)
			System.out.print(value+"  ");
		
	}

}
