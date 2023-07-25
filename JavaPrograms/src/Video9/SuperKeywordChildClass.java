package Video9;

public class SuperKeywordChildClass extends SuperKeywordParentClass{
	int i=0;
	void m1() {
		System.out.println("child class m1");
	}
	void m2() {
		int i=45;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
		this.m1();
		super.m1();
	}
	public static void main(String[] args) {
		SuperKeywordChildClass k=new SuperKeywordChildClass();
		k.m2();	
	}
}