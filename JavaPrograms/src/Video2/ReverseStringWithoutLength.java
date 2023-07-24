package Video2;

public class ReverseStringWithoutLength {
	public static void main(String[] args) {
		int count=0;
		String str="java";
		char[] str2 = str.toCharArray();
		for(char ch:str2)
			count++;
		for(int i=count-1;i>=0;i--)
			System.out.print(str2[i]);
	}
}