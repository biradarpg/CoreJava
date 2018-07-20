package stringfunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Duplicate {

	public static void main(String[] args) {
		String names[] = { "java", "php", "javascript", "ruby", "python", "c",
				"java", "c++", "c" };
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("The Duplicate values is " + entry.getKey());
			}else {
				System.out.println("Unique value is "+entry.getKey());
			}
				
		}
		String s="java";
		char[]ch=s.toCharArray();
		Map<Character,Integer> charMap=new HashMap<Character,Integer>();
		for(Character c:ch) {
			Integer cnt=charMap.get(c);
			if(cnt==null) {
				charMap.put(c, 1);
			}else {
				charMap.put(c, ++cnt);
			}
		}
		
		Set<Entry<Character,Integer>> charEntry=charMap.entrySet();
		for(Entry<Character,Integer> centry:charEntry) {
			System.out.println(" no of coccurance of "+centry.getKey()+" is "+ centry.getValue());
		}
	}
	
	
	public void occuranceOFChar() {
		String s="java";
		char[]chars= s.toCharArray();
		
		
		for(int i=0;i<s.length();i++) {
			
		}
	}
	

}
