package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Cleare_Method_EX {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		map.put('A', 120);
		map.put('b', 130);
		map.put('c', 140);
		map.put('d', 150);
		map.put('e', 160);
		
		System.out.println(map);
		
		System.out.println("After clear method used");
		
	     map.clear();
	     System.out.println(map);
	}

}
