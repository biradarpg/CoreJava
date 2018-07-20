
public class SplitString {

	public static void main(String[] args) {
		SplitString st=new SplitString();
		String s = "Count, the number,, of commas.";
		int numberOfCommas = s.replaceAll("[^,]","").length();
		int n=st.count(s, ",");
		System.out.println("commas in user defined function  "+n+"  Using Split functionn "+numberOfCommas);
		

	}
	
	public int count(String input, String countString){
		  return input.split("\\Q"+countString+"\\E", -1).length - 1;
		}

}
