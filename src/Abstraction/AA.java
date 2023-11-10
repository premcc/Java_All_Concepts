package Abstraction;

import java.util.LinkedHashMap;
import java.util.Map;

public class AA {
	
	
	
	public static void main(String[] args) {
		
		String test="testing";
		
		char arr[]=test.toCharArray();
		
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int count=map.get(ch);
				
				map.put(ch, count+1);
			}
			
		}
		
		System.out.println(map);
		
		
		
		
		
		

	}

}
