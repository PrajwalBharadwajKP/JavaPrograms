package Video8;

public class NonStaticInsideNonStatic {
	int i=8;
	void m1() {
		System.out.println("hello");
	}
	void m2() {
		System.out.println(i);
		System.out.println(StaticInsideNonStatic.i);
		StaticInsideNonStatic sis=new StaticInsideNonStatic();
		System.out.println(sis.i);
		System.out.println(this.i);
		m1();
		StaticInsideNonStatic.m1();
		sis.m1();
		this.m1();
	}
}