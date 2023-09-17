package Strings;

public class Removing_Duplicate_Characters {
	public static void main(String[] args) {
		
		String data="programming";
		
		//output we required "progamin";
		String rev="";
		for(int i=0;i<data.length();i++)
		{
			char arr=data.charAt(i);
		int inde=	data.indexOf(arr, i+1);
			if(inde==-1)
			{
				rev=rev+arr;
			}
		}
		System.out.println(rev);
		
		//Approch 2 
		
		String sb="programming";
		StringBuilder sb1=new StringBuilder();
		sb.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println("Approach 2 "+sb1);
		
		//Approach 3
		
		String word="programming";
		
		String exe="";
		char arr[]=word.toCharArray();
		
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
					
			}
			if(flag==false)
			{
				exe=exe+arr[i];
			}
		}
		System.out.println("third approach "+exe);
		
	}

}
