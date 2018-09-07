package collectionframwork;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListConcept {

	@SuppressWarnings("unchecked")
	public static  void main(String[] args) {
		
		int a[]=new int[3]; //static array
		
		a[1]=2;
		a[2]=6;
		int len=a.length;
		String st="hello";
		st.length();
		 try {
			Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
+Generic vs Non-Generics in ArrayList
+Add, Merge, Retain and User Defined Class Objects in Array List*/
		//Dynamic array
		// 2. contains duplicate value
		//3.maintains insertion order
		//4.it is not synchronized (not Thread safe)
		//5.It allows you runtime access to fetch any element box it saves on 
		//the basis of index
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(null);
		System.out.println(" "+al2.add(40) );
		 al2.add(4,90);
		 
		System.out.println(al2);
		Object obj=al2.set(2, 3000);
		System.out.println(al2);
		System.out.println(obj.toString());
		LinkedList l2=new LinkedList();
		System.out.println(al2 instanceof Serializable);
		System.out.println(al2 instanceof Cloneable);
		System.out.println(al2 instanceof RandomAccess);
		System.out.println("******************************************");
		System.out.println(l2 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l2 instanceof RandomAccess);
		ArrayList al3=new ArrayList();
		al3.add(20);
		
		
		System.out.println(Integer.parseInt((al2.get(0)).toString())+ Integer.parseInt(al3.get(0).toString()));
		System.out.println("-------------------------------------------------------");
		ArrayList<Comparable> al=new ArrayList<Comparable>(); //non generic arraylist
		
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al.size());
		
		//size of arraylist
		
		al.size();
		
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
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		
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
