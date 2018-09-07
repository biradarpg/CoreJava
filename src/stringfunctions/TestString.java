package src.stringfunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/*How to Reverse a String:
 1. using for loop and charAt() method
 2. using StringBuffer class and reverse function

 Interview Questions:
 //Reverse a String
 //Difference between String and StringBuffer
 //Do we have reverse function in String?

 * */
public class TestString {
	String str = "Selenium";
	String rev = "";
	String a = "hello";
	String b = "world";
	int t = 0;

	@BeforeMethod
	public void beforeMeth() {
		System.out.println("--------------------------------------------------------------");
	}

	@AfterMethod
	public void afterMeth() {
		System.out.println("*************************************************************************");
	}

	@Test(enabled = false)
	public void reverseString() {
		StringBuffer sbr = new StringBuffer();
		sbr.append(str);
		System.out.println(sbr.reverse());

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
		System.out.println("the values of a and b bfore swaping");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		System.out.println("Now  a is " + a);
		b = a.substring(0, (a.length() - b.length()));
		System.out.println(a.length() + "    " + (a.length() - b.length()));
		System.out.println(b.length());
		a = a.substring(b.length(), (a.length()));
		System.out.println("After Swaping");
		System.out.println("Value of a " + a);
		System.out.println("Value of B " + b);
		/*
		 * print 1 23
		 * 
		 * 
		 * 
		 * 
		 */
		int t = 1;
		for (int i = 1; i < 15; i++) {
			for (int j = 0; j < i; j++) {
				t = j + i;
				System.out.print(j + i);
			}

			System.out.println();
		}

		/// Amstrong number
		for (int k = 1; k < 1000; k++) {
			int num = k;
			int num1 = k;
			int sum = 0;
			while (num > 0) {
				int a = num % 10;
				sum = (sum + (a * a * a));
				num = num / 10;
			}
			if (num1 == sum) {
				System.out.println("Amstromg");
				System.out.println("Num " + num1 + " Sum" + sum);
			}

		}

		// print prime number
		for (int j = 2; j < 100; j++) {
			int p = j;
			boolean flag = false; //
			for (int i = 2; i <= Math.sqrt(p); i++) {
				if ((p % i) == 0) {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println(p + "is not Prime NUmber");
			} else {
				System.out.println(p + "is  prime");
			}

		}
		int sum = 0;
		for (int i = 1; i < 30; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	@Test
	public void duplicate() {
//<<<<<<< HEAD
		String names[] = { "java", "php","java", "javascript", "ruby", "python", "c",
				"java", "c++", "c" };
		ArrayList<String> duplicateList=new ArrayList<String>();
		ArrayList<String> uniqueList=new ArrayList<String>();
		
		String duplicate[]=new String[names.length];
		String unique[]=new String[names.length];
		String dup="";
		int cnt=0;
		int cnt1=0;
		String uni="";
		// using nested for loop
		int flag=0;
		for (int i = 0; i < names.length; i++){
			int c=0;
			for (int j = 0; j < names.length; j++){
				
				if(i!=j){							
				if (names[i] == names[j]) {
					if(!duplicateList.contains(names[i])){
					duplicateList.add(names[i]);
					dup=names[i];
					c++;
					flag=1;
				    }
				 else {
					flag=1;
				 }
		    	}
			}
		}
			duplicate[cnt++]=dup;			
			if(flag==0) {
			unique[cnt1++]=names[i];
			uniqueList.add(names[i]);
			}
			flag=0;
		}
		for(String un:uniqueList)
			System.out.println("Unique   "+un);
		System.out.println(uniqueList.size()+"  ++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Duplicate item "+Arrays.deepToString(duplicateList.toArray()));
		System.out.println("unique item "+Arrays.deepToString(uniqueList.toArray()));
//=======
		String names1[] = { "java", "php", "java", "javascript", "ruby", "python", "c", "java", "c++", "c" };
		ArrayList<String> duplicateList1 = new ArrayList<String>();
		ArrayList<String> uniqueList1 = new ArrayList<String>();

		String duplicate1[] = new String[names1.length];
		String unique1[] = new String[names1.length];
		String dup1 = "";
		int cnt11 = 0;
		int cnt111 = 0;
		String uni1 = "";
		// using nested for loop
		int flag1 = 0;
		for (int i = 0; i < names1.length; i++) {
			int c = 0;
			for (int j = 0; j < names1.length; j++) {

				if (i != j) {
					if (names1[i] == names1[j]) {
						if (!duplicateList1.contains(names1[i])) {
							duplicateList1.add(names1[i]);
							dup1 = names1[i];
							c++;
							flag1 = 1;
						} else {
							flag1 = 1;
						}
					}
				}
			}
			duplicate1[cnt111++] = dup1;
			if (flag1 == 0) {
				unique1[cnt111++] = names1[i];
				uniqueList1.add(names1[i]);
			}
			flag1 = 0;
		}
		for (String un : uniqueList1)
			System.out.println("Unique   " + un);
		System.out.println(uniqueList1.size() + "  ++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Duplicate item " + Arrays.deepToString(duplicateList1.toArray()));
		System.out.println("unique item " + Arrays.deepToString(uniqueList1.toArray()));
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f
		// using Set
		Set<String> store = new HashSet<String>();
		for (String name : names1) {
			if (store.add(name) == false) {
//<<<<<<< HEAD
				//dup[cnt++]=name;
				System.out.println(name + "  Is duplicate element");
			}else {
				//uni[cnt1++]=name;
			}
				
		}
		for(String dp:duplicate1)
		System.out.println("Duplicate ---> "+dp);
		for(int i=0;i<unique1.length;i++)
			System.out.println("Unique ---> "+unique1[i]);
//=======
				// dup[cnt++]=name;
				System.out.println(name + "  Is duplicate element");
			}else

	{
		// uni[cnt1++]=name;
	}

	}
	for(String dp:duplicate)System.out.println("Duplicate ---> "+dp);for(
	int i = 0;i<unique.length;i++)System.out.println("Unique ---> "+unique[i]);
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f
	// 3rd type
	System.out.println("*****************************************************");
	Map<String, Integer> storeMap = new HashMap<String, Integer>();for(
	String name:names)
	{
		Integer count = storeMap.get(name);
		if (count == null) {
			storeMap.put(name, 1);
		} else {
			storeMap.put(name, ++count);
		}
	}
	Set<Entry<String, Integer>> entrySet = storeMap.entrySet();for(
	Entry<String, Integer> entry:entrySet)
	{
		if (entry.getValue() > 1) {
			System.out.println("The Duplicate values is " + entry.getKey());
//<<<<<<< HEAD
		} else {
			System.out.println("Unique value is " + entry.getKey());
		}

	}System.out.println("******************************************************");
//=======
	}
	else{System.out.println("Unique value is "+entry.getKey());}

	}System.out.println("********************************************************");
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f
	}

	@Test
	public void largestSmallest() {
		int nums[] = { 102, -16, 0, 1, 4, -4, 67, 90, 50, 100, -2, -18, 101 };
		int large = nums[0];
		int small = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > large) {
				large = nums[i];
			} else if (nums[i] < small) {
				small = nums[i];
			}
		}
		System.out.println("larget number is " + large);
		System.out.println("Smalleaat is " + small);
	}

	/*
	 * <<<<<<< HEAD =======
	 */
	@Test
	public void twoLargNumbersInArray() {
		int nums[] = { 102, -16, 0, 1, 4, -4, 67, 90, 50, 100, -2, -18, 101 };
		int large1 = Integer.MIN_VALUE;
		int large2 = Integer.MIN_VALUE;
		System.out.println("Minimum Value of integer is " + large1);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > large1) {
				// large2=large1;
				large1 = nums[i];
			} else if (nums[i] > large2) {
				large2 = nums[i];
			}
		}
		System.out.println("larget number is " + large1);
		System.out.println("Second Largest number is " + large2);
	}
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f

	@Test
	public void stringManipulation() {
		String str = "The rains have started and sanju is wet";
		String str1 = "The rains have started and sanju is wet";
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s') + 1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.intern());
		String s = "   world ";
		System.out.println(s.trim());
		System.out.println(s.concat(str1));
		String t = str1.concat(s);
		System.out.println(t);
		System.out.println("-----------------------------");
		System.out.println(t.replace("t", "c"));
		System.out.println(s);
		String s1[] = str.split(" ");
		for (String c : s1)
			System.out.println(c);
	}
	// reverse string using recursion

	@Test(priority = 1, dataProvider = "Authentication")
	public void revString(String str) {
		// this.str=str;
		int n = str.length();
		// String rev="";
		str.substring(1);
		rev += str.charAt(n - 1);
		String str2;
		str2 = str.substring(0, n - 1);
		if ((n - 1) > 0) {
			revString(str2);
		} else {
			System.out.println(rev);
		}
	}

	@Test
	public void palindromTest() {
		String str = "malayalam";

		StringBuffer sbr = new StringBuffer(str);
		if ((sbr.reverse().toString()).equals(str)) {
//<<<<<<< HEAD
			System.out.println("Revesrse String  " + sbr.reverse() + " Actual string " + str);
//=======
			System.out.println("Revesrse String  " + sbr.reverse() + " Actual string " + str);
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f

		} else {
			System.out.println("String is not palindrome");

		}

	}

	@DataProvider(name = "Authentication")
//<<<<<<< HEAD

//=======
//>>>>>>> eab87807215fd472400c8ce41025c28283a3518f
	public static Object[][] credentials() {
		Object data[][] = new Object[1][1];
		data[0][0] = "selenium";
		return data;

		// return new Object[][]
		// { { "testuser_1", "Test@123" }};
	}
}