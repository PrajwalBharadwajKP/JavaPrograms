package Video9;

public class ThisStatement {
	public ThisStatement(int i) {
		this('a');
		System.out.println("Integer");
	}
	public ThisStatement(char c) {
		this("Hello");
		System.out.println("Character");
	}
	public ThisStatement(String s) {
		this(3.5);
		System.out.println("String");
	}
	public ThisStatement(double d) {
		System.out.println("Double");
	}
	public static void main(String[] args) {
		ThisStatement ts=new ThisStatement(1);
	}
}