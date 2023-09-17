package Collections;

import java.util.*;
import java.util.Map.Entry;
public class Map_EntrySet_Method {
	
	public static void main(String [] args)
	{
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		
		map.put("aggipettimaccha", 1);
		map.put("uppalbalu", 2);
		map.put("swathi naidu", 69);
		map.put("avesamstar", 420);
		map.put("hero sunishith", 640);
		
		//Set<Entry<String, Integer>> mapValues = map.entrySet();
		for ( Entry<String, Integer> pam: map.entrySet()) {
			
			System.out.println(pam.getKey()+"  "+pam.getValue());
		}
		
	}

}
