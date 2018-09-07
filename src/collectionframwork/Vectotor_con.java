package src.collectionframwork;

import java.util.Enumeration;
import java.util.Vector;

public class Vectotor_con {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.addElement("Ram");
		v.addElement("Sham");
		v.add("Pram");
		System.out.println(v);
		System.out.println(v.add("Ram"));
		Enumeration el=v.elements();
		while(el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}
		try{
			int a[]=new int[5];
			a[5]=30/0;
			}
			
			catch(ArithmeticException e){
				System.out.println("task1 is completed");
				}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("task 2 completed");
				}
			//sint a=0;
			
			catch(Exception e){
				
				System.out.println("common task completed");
				
				}
		System.out.println("rest of the code...");
	}
			
	}