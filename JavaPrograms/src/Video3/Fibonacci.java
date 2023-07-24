package Video3;

public class Fibonacci {
	public static void main(String[] args) {
		int first=0;
		int second=1;
		int sum=0;
		int range=8;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<range;i++) {
			sum=first+second;
			System.out.println(sum);
			first=second;
			second=sum;
		}
	}
}