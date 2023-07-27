package Video19;

public class RemoveBracketAndNumber {
	public static void main(String[] args) {
		String s="java[12]selenium";
		String s1="";
		char[] str = s.toCharArray();
		for(int i=0;i<str.length;i++) {
			if(str[i]>=65 && str[i]<=90 || str[i]>=97 && str[i]<=122)
				s1=s1+str[i];
		}
		System.out.println(s1);
	}
}