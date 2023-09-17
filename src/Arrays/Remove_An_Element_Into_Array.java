package Arrays;

import java.util.*;
public class Remove_An_Element_Into_Array {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,5};
		int newArray[]=new int[5];
		int removeElement=6;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]!=removeElement)
			{
				newArray[count]=newArray[count]+arr[i];
				count++;
			}
			
		}
		
		System.out.println(Arrays.toString(newArray));
		
		
		//System.out.println(newArray[0]+"/n"+newArray[1]+newArray[2]+"/n"+newArray[3]+"/n"+newArray[4]);
	}

}
