package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FInd_The_OCcurence_OF_Characters {
	
	public static void main(String[] args) {
		
		String data="java";
		
		char arr[]=data.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					map.put(arr[i], count++);
				}
			}
		}
		System.out.println(map);
	}

}
