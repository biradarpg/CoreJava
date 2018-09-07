package collectionframwork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConcept {
	
	/*+What is Singly Linked List in Java
+Different Method in LinkedList
+How to iterate LinkedList using different loops and Iterator

~~~Singly Linked Lists are a type of data structure. It is a type of list. In a singly linked list each node in the list stores the contents of the node and a pointer or reference to the next node in the list.

It does not store any pointer or reference to the previous node. It is called a singly linked list because each node only has a single link to another node. To store a single linked list, you only need to store a reference or pointer to the first node in that list. 

The last node has a pointer to nothingness to indicate that it is the last node.
*/
	public static void main(String [] args){
		LinkedList<String> ll=new LinkedList<String>();
		//add
		ll.add("Selenium");
		ll.add("Qtp");
		ll.add("silk Test");
		ll.add("RFT");
		ll.add("tst rail");
		System.out.println("Content of Linked list "+ll);
		//add first
		ll.addFirst("Praveen");
		System.out.println("Content of Linked list "+ll);
		//add last
		ll.addLast("Biradar");
		System.out.println("Content of Linked list "+ll);
		//set the value
		ll.set(4, "Raj");
		System.out.println("Content of Linked list "+ll);
		//remove last
		ll.removeLast();
		System.out.println("Content of Linked list "+ll);
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		System.out.println("---------------------------------------");
		//print the elements of linked list using for loop
		ListIterator<String> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("---------------------------------------");
		System.out.println("with ll.elements "+ll.element());
		for(String l:ll){
			System.out.println(l);
		}
		System.out.println("---------------------------------------");
		//print using iterator
		Iterator<String> it=ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------");
		int num=0;
		//print using while
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		



		
	}

}
