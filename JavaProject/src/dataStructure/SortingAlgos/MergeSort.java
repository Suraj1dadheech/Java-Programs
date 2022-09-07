package dataStructure.SortingAlgos;

public class MergeSort {
	public static void merge(int []arr,int l,int r) {
		
		int mid=(l+r)/2;
		int first[]=new int[mid-l+1];
		int second[]=new int[r-mid];

		int mainArray=l;	
		for(int i=0;i<first.length;i++)
			first[i]=arr[mainArray++];
		mainArray=mid+1;

		for(int i=0;i<second.length;i++)
			second[i]=arr[mainArray++];
	
		
		int index1=0,index2=0;		
		mainArray=l;
		while(index1<first.length && index2<second.length) {
			if(first[index1]<second[index2]) 
				arr[mainArray++]=first[index1++];
			else
				arr[mainArray++]=second[index2++];
		}
		
		while(index1<first.length)
			arr[mainArray++]=first[index1++];
		
		while(index2<second.length)
			arr[mainArray++]=second[index2++];
	}
	
	public static void mergeSort(int[] arr,int l,int r) {
		if(l<r) {
		int mid=(l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,r);
		}	
	}
	
	public static void main(String[] args) {
//		int []arr= {1,3,7,8,2,4,5,6};
		int []arr= {2,5,1,9,6};
		MergeSort.mergeSort(arr,0,arr.length-1);
		for(Integer value:arr)
			System.out.print(value+"  ");
		
	}

}
