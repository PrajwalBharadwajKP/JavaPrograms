package Video3;

public class LargestNumberInArray {
	public static void main(String[] args) {
		int[] arr= {9,1,26,56,23,34};
		int large=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large)
				large=arr[i];
		}
		System.out.println("Largest number is: "+large);
	}
}