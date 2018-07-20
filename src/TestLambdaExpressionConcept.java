
public class TestLambdaExpressionConcept {

	public static void main(String[] args) {
		
		
		LambdaConcept l2= (s1, s2)-> {System.out.println("Hello "+s1 +" "+s2); return s2;};
		
		l2.display("Praveen","biradar");

	}

}
