package src;


public class Finalizeconcept {
	public static void main(String[] args){
		Finalizeconcept f1=new Finalizeconcept();
		Finalizeconcept f2=new Finalizeconcept();
		f1=null;
		//f2=null;
		System.gc();  //finalize used garbage collection
		
	}
	
	
	
	
	public void finalize(){
		System.out.println("Finalize method..");
		
	}

}
