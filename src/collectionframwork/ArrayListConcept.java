package collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[]=new int[3]; //static array
		
		/*Java ArrayList class:

Java ArrayList class uses a dynamic array for storing the elements.
 It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

+Java ArrayList class can contain duplicate elements.
+Java ArrayList class maintains insertion order.
+Java ArrayList class is non synchronized.
+Java ArrayList allows random access because array works at the index basis.
+In Java ArrayList class, manipulation is slow because a lot of shifting 
needs to be occurred if any element is removed from the array list.

Learn:
+Static Array and Dynamic Array
+How to get the size of array list
+Iterate Array List using for loop and Iterator 
+Generics vs Non-Generics in ArrayList
+Add, Merge, Retain and User Defined Class Objects in Array List*/
		//dyanamic array
		// 2. contains duplicate value
		//3.maintains insertion order
		//4. it is not synchronised (not Thread safe)
		//5. It aalows you runtime access to fetch any elament bcoz it saves on the basis of index
		ArrayList<Comparable> al=new ArrayList<Comparable>(); //non genric arraylist
		
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.size()); //size of arraylist
		//
		
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(12.3);
		al.add("hello");
		al.add(true);
		System.out.println(al.get(5)); //to get value from index
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		//non genric vs genric 
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(3);
		ar.add(8);
		//add all
		System.out.println("After Adding another array list");
		
		al.addAll(ar);
		System.out.println("After Retaaining another  array list"); //prints commen elemets of both the list
		al.retainAll(ar);
		al.iterator();
	
		System.out.println(al);
		ArrayList<E> ar1=new ArrayList<E>();
		
		
		Employee e1=new Employee("praveen",101,"QA");
		Employee e2=new Employee("pavan",101,"dev");
		Employee e3=new Employee("basva",101,"admin");
		//remove all 
		//al.removeAll(ar1);
		//Retain all
		System.out.println("Retain all");
		al.retainAll(ar1);
		System.out.println(ar1);
		
		ArrayList<Employee> ar2=new ArrayList<Employee>();
		
		// iterator to tra
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator<Employee> it=ar2.iterator();
		
		
		while(it.hasNext()){
			Employee emp=it.next();
			System.out.println(emp.name + "  "+emp.age +"  "+emp.dept);
		}
	}

}
