package src.collectionframwork;
 
import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

import org.testng.ITestNGMethod;
import org.testng.collections.ListMultiMap;
import org.testng.collections.Maps;

import collectionframwork.Employee;

public class HashMapConcept {

	public static void main(String[] args) {
		// Java HashMap class implements the map interface by using a hashtable.
		// It inherits AbstractMap class and implements Map interface.

		// The important points about Java HashMap class are:

		// A HashMap contains values based on the key.
		// It contains only unique elements.
		// It may have one null key and multiple null values.
		// It maintains no order.
		// hashmap is non-synchronised -- not thread safe
		// It gives Concurrent modification exception -- in case of Fail -Fast condition

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "QTP");
		map.put(2, "Selenium");
		map.put(3, "winrunner");
		map.put(4, "Silk test");
		map.put(5, "Silk ");
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get(5));

		map.putIfAbsent(1, "TESTRUN");
		map.entrySet();
		Collection<String> lst = map.values();
		Iterator<String> itr = lst.iterator();
		System.out.println("-------------Map Values-----------------");
		ListMultiMap<String, ITestNGMethod> m_dependencies = Maps.newListMultiMap();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(map.get(4));

		// map.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));
		for (Entry en : map.entrySet()) {

			System.out.println(en.getKey() + " -- " + en.getValue());
		}
	
	
	map.remove(3);
	System.out.println(map);

	HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

	Employee e1 = new Employee("praveen", 101, "QA");
	Employee e2 = new Employee("pavan", 101, "dev");
	Employee e3 = new Employee("basva", 101, "admin");

	//emp.put(1,e1);
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	
	

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println(emp);
	for(Entry<Integer,Employee> m:emp.entrySet())
	{

		int key = m.getKey();
		Employee e = m.getValue();

		System.out.println(key + " info  ");
		System.out.println(e.name + "  " + e.age + "  " + e.dept);
	}

}
}
