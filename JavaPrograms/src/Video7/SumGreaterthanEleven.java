package Video7;

public class SumGreaterthanEleven {
	public static void main(String[] args) {
		int[] arr= {3,4,5,6,7,8};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]>=11) {
					System.out.println("Pair is: "+arr[i]+" and "+arr[j]);
					count++;
				}
			}
		}
		System.out.println("Total number of pairs that are possible are "+count);
	}
}