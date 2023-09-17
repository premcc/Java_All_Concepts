package Iterator;

import java.util.*;
public class Ex {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("admin123");
		list.add("cvsj");list.add("hcgsgh");list.add("chsvch");list.add("cgsvdg");
		
		System.out.println(list);
		System.out.println(list.get(0));
		
		Set<String> set=new LinkedHashSet<String>();
		
		set.add("babi0");set.add("hvh");set.add("sfcf");set.add("opop");
		
		System.out.println(set);
		//System.out.println(set.g);(get method is not available in Set)
		
		//Iterable<T>
		
	}

}
