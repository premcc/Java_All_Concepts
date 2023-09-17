package Practise_Strings;
import java.util.*;
public class REmove_Duplicates {
	
	public static void main(String[] args) {
		
		String data="programming";
		
		String newData="";
		
		for(int i=0;i<data.length();i++)
		{
			int count=0;
			for(int j=i+1;j<data.length();j++)
			{
				
				if(data.charAt(i)==data.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				newData=newData+data.charAt(i);
			}
		}
		System.out.println(newData);
		
		//Using Map
		Map<Character,Character> map=new LinkedHashMap<Character, Character>();
		
		char arr[]=data.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], arr[i]);
			}
			
		}
		
		System.out.println(map.keySet().toString());
		
		//using Set
		
	Set<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<data.length();i++)
	{
		set.add(data.charAt(i));
	}
	
	System.out.println("Using_Set "+set);
	}

}
