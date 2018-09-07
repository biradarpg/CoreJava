package src.collectionframwork;

import java.util.Enumeration;
import java.util.Vector;




import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {
	
	public static void main(String args[]) {
		Vector<String> ve=new Vector<String>();
		System.out.println("Initial Size "+ve.size());
		System.out.println("Initial Capacity "+ve.capacity());
		ve.add("JAVA");
		ve.add("c++");
		ve.add("python");
		ve.add("c#");
		ve.add("php");
		ve.add("JavaScript");
		ve.add("Ruby");
		ve.add("NodeJS");
		ve.add("ReactJS");
		
		ve.add(1, "selenium");
		ve.add(2, "AngularJS");
		
		System.out.println("Size After Adding Eements "+ve.size());
		System.out.println("Capacity After Adding Eements "+ve.capacity());
		System.out.println(ve.get(1));
		System.out.println(ve.get(2));
		 Iterator<String> ir=ve.iterator();
		 
		 while(ir.hasNext()) {
			 System.out.println(ir.next());
		 }
		 
		 System.out.println("------------------------------------------");
		 Enumeration<String >en=ve.elements();
		 System.out.println("------------------------------------------");
		 while(en.hasMoreElements()) {
			 System.out.println(en.nextElement());
		 }
		 System.out.println("------------------------------------------");
		for(String v:ve) {
			System.out.println(v);
		}
		
	}

	private static void While(boolean hasMoreElements) {
		// TODO Auto-generated method stub
		
	}



}
