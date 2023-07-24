package Video1;

public class Print1To10WithoutLoop {
	public static void main(String[] args) {
		m1(1);
	}
	public static void m1(int i) {
		if(i<=10) {
			System.out.println(i);
			m1(i+1);
		}
	}
}