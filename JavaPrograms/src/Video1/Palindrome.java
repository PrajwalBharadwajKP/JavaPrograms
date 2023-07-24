package Video1;

public class Palindrome {
	public static void main(String[] args) {
		String str="vivi";
		String[] str2=str.split("");
		String str3="";
		for(int i=str2.length-1;i>=0;i--) {
			str3=str3+str2[i];
		}
		if(str.equals(str3))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}