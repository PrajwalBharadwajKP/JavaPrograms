package Video2;

public class RemoveSpaces {
	public static void main(String[] args) {
		String str="java programming language";
		String[] str2 = str.split("");
		String str3="";
		for(int i=0;i<str2.length;i++) {
			if(str2[i].equals(" "))
				continue;
			else
				str3=str3+str2[i];
		}
		System.out.println(str3);
	}
}