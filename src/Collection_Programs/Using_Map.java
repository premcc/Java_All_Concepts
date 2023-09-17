package Collection_Programs;
import java.util.*;
import java.util.Map.Entry;
public class Using_Map {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,1,2,4,5,6,1,1,1,1,1,2,4,7,7};
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		
		for(int value:arr)
		{
          
			if(!map.containsKey(value))
			{
				map.put(value, 1);
			}
			else
				
			{
				int count=map.get(value);
				map.put(value, count+1);
			}
		}
	//	Iterator<Entry<Integer, Integer>> loop =
		for(Entry<Integer, Integer> keySet: map.entrySet())
		{
			System.out.println(keySet.getKey()+" :occurence is"+keySet.getValue());
		}
		
		
		
	}

}
