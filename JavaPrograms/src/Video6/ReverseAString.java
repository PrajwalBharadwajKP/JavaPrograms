package Video6;

public class ReverseAString {
	public static void main(String[] args) {
		String str="automation";
		String[] str2 = str.split("");
		String str3 = "";
		for(int i=0;i<str2.length;i++)
			str3=str2[i]+str3;
		System.out.println(str3);
	}
}