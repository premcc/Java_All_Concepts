package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Diff_Btn_List_And_SEt {
	
	public static void main(String[] args) {
		
		List<String> data=new ArrayList<String>();
		
		data.add("prem");
		data.add("prem");
		
		System.out.println(data);//[prem, prem]==output
		
		
		Set<Integer> value=new LinkedHashSet<Integer>();
		
		value.add(123);
		value.add(234);
		value.add(123);
		
		System.out.println(value);//[123,234]=output it doesnot allow duplicate elements
		
		
		
		//2nd difference (insertion order)
		
		List<Integer> data1=new ArrayList<Integer>();
		data1.add(20);
		data1.add(22);
		data1.add(19);
		
		
		System.out.println("For insertion order "+data1);
		
		Set<Integer> value1=new LinkedHashSet<Integer>();
		value1.add(20);
		value1.add(22);
		value1.add(19);
		
		System.out.println("For insertion order of set "+value1);
		
		//For get the value by index
		
		System.out.println(data1.get(0));
		
	}

}
