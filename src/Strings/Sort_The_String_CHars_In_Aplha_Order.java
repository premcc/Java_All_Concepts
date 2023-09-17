package Strings;

import java.util.Arrays;

public class Sort_The_String_CHars_In_Aplha_Order {
	
	public static void main(String[] args) {
		
		String data="SDHGZACB";
		
		char arr[]=data.toCharArray();
		System.out.println("The original characters "+arr);
		
		for(int i=0;i<data.length();i++)
		{
			for(int j=i+1;j<data.length();j++)
			{
				if(arr[i]>arr[j])
				{
					char c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
				
			}
			
		}
		System.out.println("the char sequence in array "+new String(arr));
		//Approach2
		
		String value="balu";
		char arr1[]=value.toCharArray();
		Arrays.sort(arr1);
		System.out.println("The second Approach is "+new String(arr1));
	}

}
