package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class Find_Longest_Substring {
	
public static void main(String args [])
{

	String s="abbcdb";
	
	String LongestSubStr=null;
	int lenghthOfLOngSubstr=0;
	
	char arr[]=s.toCharArray();
	Map<Character, Integer> mapValue=new LinkedHashMap<Character, Integer>();
	
	
	for(int i=0;i<arr.length;i++)
	{
		char ch=arr[i];
		if(!mapValue.containsKey(ch))
		{
			mapValue.put(ch, i);
		}
		else
		{
			i=mapValue.get(ch);
			
			mapValue.clear();
			
		}
		if(mapValue.size()>lenghthOfLOngSubstr)
		{
		LongestSubStr=mapValue.keySet().toString();
		lenghthOfLOngSubstr=mapValue.size();
		}
	}
	System.out.println("The longesstSubstr is "+LongestSubStr);
	System.out.println("The length of the  longesstSubstr is "+lenghthOfLOngSubstr);
	
	
}

}
