package Video8;

public class Driver {
	public static void main(String[] args) {
		SuperClass sc=new SuperClass();
		sc.m1();
		sc.m2();
		SubClass sc1=new SubClass();
		sc1.m1();
		sc1.m2();
		SuperClass sc2=new SubClass();
		sc2.m1();
		sc2.m2();
	}
}