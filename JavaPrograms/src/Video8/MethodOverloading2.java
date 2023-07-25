package Video8;

public class MethodOverloading2 {
	public void print(int i) {
		System.out.println(i);
	}
	public void print(double d) {
		System.out.println(d);
	}
	public void print(char c) {
		System.out.println(c);
	}
	public static void main(String[] args) {
		MethodOverloading2 mo1=new MethodOverloading2();
		mo1.print(0);
		mo1.print('e');
		mo1.print(6.5);
	}
}