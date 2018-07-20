package casting;

public class Sub extends Super {
	
	/*
	 * Typecasting is converting one data type to another. 
	 * Up-casting: Converting a subclass type to a superclass type is known as up casting.
	 * 
	 * */
		   void Sample() {
		      System.out.println("method of sub class");
		   }
		   
		   public static void main(String args[]) {
		      Super obj =(Super) new Sub(); 
		      obj.Sample();
		      
		      System.out.println("*--------------------------------------*");
		      //Down-casting: Converting a superclass type to a subclass type is known as downcasting.
		      Super obj1 = new Sub();
		      Sub sub = (Sub) obj1;
		      sub.Sample();
		   }
		}

