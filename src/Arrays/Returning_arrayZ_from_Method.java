package Arrays;

import java.util.Arrays;

public class Returning_arrayZ_from_Method {

	
	public static  int[] method()
	{
		 int arr[]=new int[5];
		arr[0]=12;arr[1]=13;arr[2]=14;arr[3]=15;arr[4]=16;
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
	int prr[]=method();
	for(int i=0;i<prr.length;i++)
	{
		System.out.print(prr[i]+" ");
	}
	}
}
