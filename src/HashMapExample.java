package src;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapExample {
	
	public static void main(String args[]){
		String s1="FB";
		String s2="Ea";
		System.out.println(s1.hashCode()+ " " +s2.hashCode());
		HashMap<String,String> map=new HashMap<String,String>();
		map.put(null, "one");
		map.put("2", "two");
		map.put(s1,"three");
		map.put(s2, "four");
		System.out.println(map.get(s1));
		/*map.put("3", "three");
		map.put("4", "four");
		map.put("45", "four");*/

		for(Entry<String, String> en:map.entrySet())
			System.out.println(en.getKey()+ "   "+ en.getValue());
	}
	
	

}
