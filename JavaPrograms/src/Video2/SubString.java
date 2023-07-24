package Video2;

public class SubString {
	public static void main(String[] args) {
		String str="welcome";
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String str2 = str.substring(i,j+1);
				System.out.println(str2);
				count++;
			}
		}
		System.out.println("Number of subString asr: "+count);
	}
}