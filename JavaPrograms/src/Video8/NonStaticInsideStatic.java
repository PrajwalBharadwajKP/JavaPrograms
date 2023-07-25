package Video8;

public class NonStaticInsideStatic {
	int i=8;
	void m1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println(StaticInsideNonStatic.i);
		StaticInsideNonStatic sis=new StaticInsideNonStatic();
		System.out.println(sis.i);
		StaticInsideNonStatic.m1();
		sis.m1();
	}
}