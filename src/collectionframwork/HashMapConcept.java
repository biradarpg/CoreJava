package collectionframwork;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class HashMapConcept {

	public static void main(String[] args) {
		// Java HashMap class implements the map interface by using a hashtable.
		//It inherits AbstractMap class and implements Map interface.

		//The important points about Java HashMap class are:

		//A HashMap contains values based on the key.
		//It contains only unique elements.
		//It may have one null key and multiple null values.
		//It maintains no order.
		//hashmap is non-synchronised  -- not thread safe
		//It gives Concurrent modification exception -- in case of Fail -Fast condition
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		 map.put(1, "QTP");
		 map.put(2, "Selenium");
		 map.put(3, "winrunner");
		 map.put(4, "Silk test");
		 map.put(5, "Silk ");
		 map.put(null, null);
		  System.out.println(map.get(1));
		  System.out.println(map.get(5));
		  
		  map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		  for(Entry en:map.entrySet()){
			  
			  System.out.println(en.getKey() + " -- "+en.getValue());
			  
			  
			  
		  } 
		  System.out.println(map.get(4));

		  map.remove(3);
		  System.out.println(map);

		 HashMap<Integer,Employee> emp=new HashMap<Integer,Employee>();
		 
		 	Employee e1=new Employee("praveen",101,"QA");
			Employee e2=new Employee("pavan",101,"dev");
			Employee e3=new Employee("basva",101,"admin");
			
			emp.put(1, e1);
			emp.put(2, e2);
			emp.put(3, e3);
			
			
			//traverse
			for(Entry<Integer,Employee> m:emp.entrySet()){
				
				int key=m.getKey();
				Employee e=m.getValue();
				System.out.println(key+ " info  ");
				 System.out.println(e.name+"  "+e.age+"  " +e.dept);
			}
			
			
	}

}
