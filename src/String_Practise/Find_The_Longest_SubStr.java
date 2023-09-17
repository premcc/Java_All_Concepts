package String_Practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_The_Longest_SubStr {
	public static void main(String[] args) {
		
		String  data="abbcdef";
		String longestSubStr="";
		int lengthOfSubStr=0;

		char arr[]=data.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();

		for(int i=0;i<arr.length;i++)
		{
		char ch=arr[i];

		if(!map.containsKey(ch))
		{
		map.put(ch,i);
		}
		else
		{
		i=map.get(ch);
		map.clear();
		}

		if(map.size()>lengthOfSubStr)
		{
		longestSubStr=map.keySet().toString();
		lengthOfSubStr=map.size();
		}
		}

		System.out.println("The longestSUbString is  "+longestSubStr);
		System.out.println("The Length of longestSUbString is  "+lengthOfSubStr);

	}

}
