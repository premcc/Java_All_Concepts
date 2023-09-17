package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Keyset_Method {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new LinkedHashMap<Integer, String>();
		
		map.put(123, "Nenoka kanthiri");
		map.put(6, "kodithe kottali ra six kottali");
		
		System.out.println(map.keySet());
	}

}
