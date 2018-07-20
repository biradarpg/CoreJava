
public class StrinRevWithRecurssion {
	static String rev="";
	public static void main(String args[]){
		String str="Sel";
		String r=revString(str);
		System.out.println(r);
	}

	public static String revString(String str){
		//this.str=str;
		int n=str.length();
		System.out.println(str);
		
		rev=rev+str.charAt(n-1);
		String str2;
		if((n-1)>0){
		str2=str.substring(0, n-1);
		revString(str2);
		}else{

		System.out.println(rev);
		
		}
		return rev;
		
	}
	public String reverse(String str)
	{
	if ((str==null)||(str. length() <= 1) )
	return str;
	return reverse(str. substring(1)) + str. charAt(0);
	}
}
