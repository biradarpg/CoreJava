package collectionframwork;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {
	
	public static void main(String args[]){
		/*+It is similar to HshMap, but is synchronised.
		//+Hashtable stores key/value pair in hash table.
		//+In Hashtable we specify an object that is used as a key, 
		 * and the value we want to associate to that key.
		 *  The key is then hashed, 
		 *  and the resulting hash code is used as the index 
		 *  at which the value is stored within the table.

		//The important points about Java Hashtable class are:
		//A Hashtable is an array of list. Each list is known as a bucket. 
		 * The position of bucket is identified by calling the hashcode() method. 
		 * A Hashtable contains values based on the key.
		//+It contains only unique elements.
		//+It may have not have any null key or value.
		//+It is synchronized.*/
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		ht.put(1, "Skumar");
		
		ht.put(2, "praveenkumar");
		ht.put(3, "rajkumar");
		Hashtable<Integer, String> ht1=new Hashtable<Integer, String>();
		ht1=(Hashtable) ht.clone();
		System.out.println("Value from ht1"+ ht);
		System.out.println("Values from ht2"+ ht1);
		System.out.println("------ after clea------------");
		
		
		//clear
		ht.clear();
		System.out.println("Value from ht1"+ ht);
		
		System.out.println("Values from ht2"+ ht1);
		
		Hashtable<Integer, String> st= new Hashtable<Integer, String>();
		
		st.put(1, "Selenium");
		st.put(2, "QTP");
		st.put(3, "silktest");
		st.put(3, "silktest");
		Set s1=st.entrySet();
		System.out.println(s1);

		//contains 
		String s11 = " i  Welcome    to    geeksforgeeks";
		s11.split("\\s");
		String s21=s11.replaceAll("\\s", "");
		if(st.contains("Selenium"))
			System.out.println("Value found");
		System.out.println("not contains");
		//st.contains("sliktest")? System.out.println("Yes containd") : System.out.println("not contains");
		//print all the values from Hashtable using Enumeration -- elements()
		
		Enumeration<String> e=st.elements();
		System.out.println("Print value using Enumeration");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		System.out.println("Print value using Entry set");
		// print the values using entry set
		Set<Entry<Integer, String>> s=st.entrySet();
		System.out.println("Using entry Set   "+s);
		
		Hashtable st1= new Hashtable();
		
		st1.put(1, "Selenium");
		st1.put(2, "QTP");
		st1.put(3, "silktest");
		st1.put(3, "silktest");
		//no null keys or null values allowed   if used throws null pointer exception
		//st1.put(null,"Seln"); nullpointer exception
		
		System.out.println("elemts from st1");
		System.out.println(st1);
		if(st.equals(st1))
			System.out.println("Both are equal");
		
		//to get value from key
		System.out.println(st.get(1));
		//get hash code of hash table 
		System.out.println(st.hashCode());
		
		//Hash using generic
		Hashtable<String,String> st2= new Hashtable<String, String>();
		st2.put("A", "Selenium");
		st2.put("B", "QTP");
		st2.put("", "SILK");

		
	}
	

}
