package java.externalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main 
{
	public static void  main(String []args) 
	{
			int []arr= {1,2,3,4,7,9};
			int []arr1= {0,1,2,1,1,4};
				
			ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
			ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.stream(arr1).boxed().collect(Collectors.toList());
			list2.sort(null);
			ArrayList<Integer> list3=new ArrayList<>();
			for(int i=0;i<arr.length;i++) 
			{
				int index=list2.lastIndexOf(list1.get(i));
				if(index!=-1)
				{
					list3.add(index+1);
				}
				else
				{
					int value=list1.get(i);
					while(value>0) 
					{
							index=list2.lastIndexOf(value);
							if(index!=-1) 
							{
								list3.add(index+1);
								break;
							}
					   value--;
					}		
				}
			}
			System.out.println(list3);
	}
}

