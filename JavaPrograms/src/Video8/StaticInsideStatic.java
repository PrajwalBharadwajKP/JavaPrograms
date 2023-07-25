package Video8;

public class StaticInsideStatic {
	static int i=8;
	static void m1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(StaticInsideStatic.i);
		StaticInsideStatic sis=new StaticInsideStatic();
		System.out.println(sis.i);
		m1();
		StaticInsideStatic.m1();
		sis.m1();
	}
}