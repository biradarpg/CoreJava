
public class FinalConcept {
/*
 * final: is a Keyword
1. final can be used to mark a variable "unchangeable".
2. final can also make a method not "overrideable"
3. final can also make a class not "inheritable". i.e. the class can not be subclassed.

finally: is a Block
finally is used in a try/catch statement to execute code "always".

finalize: is a Method
finalize is called when an object is garbage collected. You rarely need to override it.
 * 
 * 
 * */
	
	
	public static void main(String[] args) {
		final int i=40; //final key word used to define constant and also avoid inheritance
		// to prevent method overriding
		test1();

	}
	public static void test1(){
		try{
			System.out.println("inside Test1 Method");
			throw new RuntimeException("test1");
		}catch(Exception e){
			System.out.println("insde catch...");
		}
		
		finally{
			System.out.println("Inside Finally");
		}
	}
	public static void test2(){
		System.out.println();
	}

}
