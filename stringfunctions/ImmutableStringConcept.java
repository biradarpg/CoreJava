package stringfunctions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;

/*why String Immutable?
 * When we create a string in java like String s1="hello"; then an object will be 
 * created in string pool(hello) and s1 will be pointing to hello.Now if again we 
 * do String s2="hello"; then another object will not be created but s2 will point 
 * to hello because JVM will first check if the same object is present in string pool 
 * or not.If not present then only a new one is created else not.
 * Reasons....
 * Security: parameters are typically represented as String in network connections, 
 * database connection urls, usernames/passwords etc. If it were mutable, 
 * these parameters could be easily changed. 
 * Synchronization and concurrency: making String immutable automatically makes them 
 * thread safe thereby solving the synchronization issues.
	Caching: when compiler optimizes your String objects, it sees that if two objects 
	have same value (a="test", and b="test") and thus you need only one string object 
	(for both a and b, these two will point to the same object).
	Class loading: String is used as arguments for class loading. If mutable, it could result
	in wrong class being loaded (because mutable objects change their state).
	That being said, immutability of String only means you cannot change it using
 	its public API.
 * 
 * */




public class ImmutableStringConcept {

	public static void main(String[] args) {

		 String a="stack";
		  System.out.println(a);//prints stack
		  //a.setValue("overflow");
		  
		  System.out.println(a);//if mutable it would print overflow
		  
		  String s1 = "Hello World";  
		  String s2 = "Hello World";  
		  String s3 = s1.substring(0);  
		  System.out.println(s1); // Hello World  
		  System.out.println(s2); // Hello World  
		  System.out.println(s3); // World
		  System.out.println(s1.equals(s3));
		  System.out.println(s1==s2);
		  System.out.println(s1==s3);
		  System.out.println(s1.hashCode()+" " + s2.hashCode()+" "+s3.hashCode()+" "+s1.toString() );

		  Field field;
		try {
			field = String.class.getDeclaredField("value");
			field.setAccessible(true);  
			  char[] value = (char[])field.get(s1);  
			  value[6] = 'J';  
			  value[7] = 'a';  
			  value[8] = 'v';  
			  value[9] = 'a';  
			  value[10] = '!';  

			  System.out.println(s1); // Hello Java!  
			  System.out.println(s2); // Hello Java!  
			  System.out.println(s3); // World 
			  
			  try {
				  System.out.println("hello");
			  }catch(ArithmeticException e) {}
			  
			  
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		}

	}
	private static void printFileJava7() throws IOException {

	    try(  FileInputStream     input         = new FileInputStream("file.txt");
	          BufferedInputStream bufferedInput = new BufferedInputStream(input)
	    ) 
	    {

	        int data = bufferedInput.read();
	        while(data != -1){
	            System.out.print((char) data);
	    data = bufferedInput.read();
	        }
	    }
	}

}
