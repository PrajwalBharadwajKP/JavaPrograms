package Video6;

public class OccuranceOfWord {
	public static void main(String[] args) {
		String str="javaseleniumjavaeclipsejavatestngjava";
		int count=0;
		for(int i=0;i<str.length()-3;i++) {
		if(str.substring(i,i+4).equals("java"))
			count++;
		}
		System.out.println("java occurs "+count+" times");
	}
}