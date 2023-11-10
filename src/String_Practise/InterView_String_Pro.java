package String_Practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class InterView_String_Pro {
	
	public static void main(String args[])
	{
		String arr[]= {"ramesh","raju","rajilanja","geetha","Subham"};
		
		Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			String data=arr[i];
			
			if(data.charAt(0)=='r'&&data.charAt(1)=='a')
			{
				map.put(data, 1);
			}	
			
		}
		System.out.println(map.keySet());
	}

}
