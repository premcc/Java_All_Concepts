package String_Practise;

import java.util.*;
public class Find_The_Occurence_Of_A_String {
	
	public static void main(String[] args) {
		
		String data="tenet";
		
		char arr[]=data.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			int count=1;
			if(!map.containsKey(ch))
			{
				map.put(ch, count);
			}
			else
			{
				count++;
				
				map.put(ch, count);
			}
		}
		
		System.out.println(map);
	}

}
