package Video8;

public class MethodOverloading1 {
	public void print(int i) {
		System.out.println(i);
	}
	public void print(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	public void print(int i, int j, int k) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	public static void main(String[] args) {
		MethodOverloading1 mo1=new MethodOverloading1();
		mo1.print(0);
		mo1.print(1,2);
		mo1.print(3,4,5);
	}
}