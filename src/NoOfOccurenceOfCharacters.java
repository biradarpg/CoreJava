package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NoOfOccurenceOfCharacters {
    static final int MAX_CHAR = 256;
 
    static void getOccuringChar(String str)
    {
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            System.out.println(str.charAt(i)+"  "+count[str.charAt(i)]);
        }
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j]) 
                    find++;                
            }
 
            if (find == 1) 
                System.out.println("Number of Occurrence of " +
                 str.charAt(i) + " is:" + count[str.charAt(i)]);            
        }
    }
    public static void freqChar() {
    	String str="geeksforgeeks";
    	str.replace(" ", "");
    	while(str.length()>0) {
    		char ch=str.charAt(0);
    		System.out.println("frequency of "+ch+ " is "+countChars(str,ch) );
    		str=str.replace(""+ch, "");
    		
    	}
    }
    public static int countChars(String str,char ch) {
    	int count=0;
    	while((str.indexOf(ch))!=-1) {
    		count++;
    		str=str.substring((str.indexOf(ch)+1));
    	}
    	return count;
    }
    public static void countCharUsingMap() {
    	String str="geeksforgeeks";
    	Map<Character,Integer> map=new HashMap<Character,Integer>();
    	for(char c:str.toCharArray()) {
    		Integer count=map.get(c);
    		
    	 /*if(count==null)
    		 map.put(c, 1);
    		 else
    			 map.put(c, ++count);*/
    	
    	if(map.containsKey(c)) {
    		map.put(c, (Integer)map.get(c)+1);
    	}
    	else {
    		map.put(c, 1);
    	}
    	}	
    	System.out.println(map);
    	
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "geeksforgeeks";
        //getOccuringChar(str);
        //freqChar();
        countCharUsingMap();
    }
}