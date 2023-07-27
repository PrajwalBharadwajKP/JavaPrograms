package Video21;

public class PrimeNumberInRange {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		for(int i=num1;i<=num2;i++) {
			int count = 0;
			for(int j=1;j<=num2;j++) {
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
}