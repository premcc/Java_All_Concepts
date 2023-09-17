package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		List< String> name=new ArrayList<String>(10);
		name.add("prem");
		name.add("ram");
		name.add("bheem");
		name.add("kreem");
		name.add("sruum");
		name.add("dream");
        Iterator itr=name.iterator();
		
		while (itr.hasNext()) {
			
		System.out.println(itr.next());
			
		}
	}
}
