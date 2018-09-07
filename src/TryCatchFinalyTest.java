package src;


public class TryCatchFinalyTest {

	static {
		System.out.println("inside static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		String s1="test";
		String s2="test";
		String s3=new String("test");
		String s4= new String("test");
		int d[] = new int[2];
		try {
			System.out.println("Inside try at Statement 1");
			System.out.println(s1==s2);
			System.out.println(System.identityHashCode( s1 )  +" "+System.identityHashCode( s2 )+"  "+System.identityHashCode( s3) +" "+System.identityHashCode( s4 ));
			System.out.println("S1 Address "+s2.hashCode() +" S2 addesss  "+s2.hashCode()+" address s3 "+s3.hashCode()+ "address of s4 "+s4.hashCode());
			System.out.println(s1==s3);
			System.out.println(s3==s4);
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			int c = a / b;
			System.out.println("After Dividsion "+c);
		} catch (ArithmeticException e) {
			System.out.println("Inside 1st catch block ...");
			System.out.println(e);
			d[0] = 1;
			d[1] = 2;
			d[2] = 3;

			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("inside 2nd catch");
			System.out.println(e);
		} finally {
			System.out.println("Inside Finally");
		}

	}

}
