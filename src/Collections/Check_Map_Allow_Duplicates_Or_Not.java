package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Check_Map_Allow_Duplicates_Or_Not {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();
		
		map.put("Balayya", 201);
		map.put("chiru", 202);
		map.put("Balayya", 203);
		map.put("chiru", 201);
		System.out.println(map);
		//check map allows duplicate values or not
		map.put("nagarjuna", 220);
		map.put("venkatesh", 222);
		map.put("nagarjuna", 220);
		map.put("venkatesh", 222);
		System.out.println(map);
		
	}

}
