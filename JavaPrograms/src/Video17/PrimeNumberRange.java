package Video17;

public class PrimeNumberRange {
	public static void main(String[] args) {
		int num=40;
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					count ++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
}