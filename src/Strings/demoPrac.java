package Strings;

import java.util.*;
public class demoPrac {
	
	public static void main(String[] args) {
		
		String s="abcdabb";
		String longestSubstring=null;
		int lengthofSubString=0;
		char arr[]=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>lengthofSubString)
			{
				longestSubstring=map.keySet().toString();
				lengthofSubString=map.size();
			}
		}
		
	System.out.println(longestSubstring);	
	}

}
