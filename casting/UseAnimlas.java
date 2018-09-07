package casting;

public class UseAnimlas {

	public static void main(String[] args) {
		{
	        Dog d = new Dog();  
	        Animal animal = new Dog();
	        Dog castedDog = (Dog) animal;
	        Dog an=(Dog) new Animal();
	        Animal al=(Dog)an;
	        Dog a = (Dog)al;
	        d.callme();
	        a.callme();
	        ((Dog) a).callme2();
	        
	        Animal animal1 = new Animal();
	        Dog notADog = (Dog) animal1;
	    }
	}

}
