package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterable_Example {
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
		
      List<Object> age=new LinkedList<Object> ();
      age.add(123);
      age.add(234);
      age.add(023);
      age.add(934);
      Iterator itr1=age.iterator();
      while (itr1.hasNext()) {
			
  		System.out.println(itr1.next());
  			
  		}
	}

}
