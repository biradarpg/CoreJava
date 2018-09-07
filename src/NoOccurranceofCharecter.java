package src;


public class NoOccurranceofCharecter {
	static int ab;
	int c;
	public NoOccurranceofCharecter() {
		int a;
		System.out.println(c);
		
	}
	static {
		System.out.println("static block");
	}
	static void test() {
		
	 int a;
		
		int d = 45;
		System.out.println(ab);
		System.out.println(d+" ");
	

		System.out.println("static method");
	}
	void nonStatictest() {
		int b;
		//b=ab/c;

		System.out.println(" global ab "+ab);
		System.out.println("Global C "+c );

		System.out.println("non static method");
	}

	public static void main(String[] args) {
		String sb=" o c ecuranceee ";
		new NoOccurranceofCharecter().nonStatictest();
		System.out.println(ab);
		test();
		StringBuilder str=new StringBuilder(sb);
		int j=0;
		int len=str.length();
		int count=1;
		for(int i=0;i<len-1;i++) {
			for(j=i+1;j<len-1;j++) {
				if(str.charAt(i)== ' ') {
					continue;
				}
				if(str.charAt(i)==str.charAt(j)&& str.charAt(i)!=' ') {
					count++;
					str.setCharAt(j, ' ' );
					
				}
			}
			if(str.charAt(i)!=' ') {
				System.out.println("The number of occurance of  "+str.charAt(i) + " is  "+ count);
			}
			count=1;
		}
		System.out.println("final String   "+str);
		

	}

}
