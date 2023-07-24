package Video4;

public class ConvertUpperToLowerAndViceVersa {
	public static void main(String[] args) {
		String str="HelLoAndWelcOme";
		String str3="";
		String str4="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				str.toLowerCase();
				str3=str3+str.toLowerCase().charAt(i);
			}
			else {
				str.toUpperCase();
				str4=str4+str.toUpperCase().charAt(i);
			}
		}
		System.out.println(str3);
		System.out.println(str4);
	}
}