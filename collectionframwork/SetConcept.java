package collectionframwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {
	public static void main(String args[]) {
		Set<String> st=new HashSet<String>();
		st.add("ram");
		st.add("sham");
		st.add("Navin");
		Iterator itr=st.iterator();
		st.remove("navin");
		
		System.out.println(st.add("ram"));
		System.out.println(st.contains("ra"));
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}


