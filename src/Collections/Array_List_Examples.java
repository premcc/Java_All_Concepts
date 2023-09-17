package Collections;

import java.util.ArrayList;

public class Array_List_Examples {
	public static void main(String[] args) {
		
		ArrayList<Object> value=new ArrayList<Object>();
		value.add("prem");
		value.add(123);
		value.add("wwrem");
		value.add("prjvkksdvdkvem");
		value.add(898);
		
		
	System.out.println(value.contains(123));
		
	System.out.println(value.size());
	  // value.clear();//it clear the element into the objects
		
		value.add(3, "newelement");
	for (Object object : value) {
			
			System.out.println(object);
		}
	
	ArrayList<Object> arr =new ArrayList<Object>();
	arr.addAll(value);
	
	for (Object object1 : arr) {
		
		System.out.println(object1);
	}
	System.out.println("Before removeAll method "+arr.containsAll(value));
	
	arr.removeAll(value);
	System.out.println("After removeAll method "+arr.containsAll(value));
	}

}
