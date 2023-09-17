package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class To_Find_Occurance_Of_Characters_In_String {
	
	public static void main(String[] args) {
		
		String value="java";
		char arr[]=value.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		for (char ch : arr) {
			
			
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
