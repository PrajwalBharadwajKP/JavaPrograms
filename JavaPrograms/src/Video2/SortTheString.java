package Video2;

public class SortTheString {
	public static void main(String[] args) {
		String str="rock";
		char[] str2=str.toCharArray();
		for(int i=0;i<str2.length;i++) {
			for(int j=i+1;j<str2.length;j++) {
				if(str2[i]>(str2[j])) {
				char temp=str2[i];
				str2[i]=str2[j];
				str2[j]=temp;
				}
			}
		}
		System.out.println(str2);	
	}
}