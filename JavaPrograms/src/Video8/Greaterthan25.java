package Video8;

public class Greaterthan25 {
	public static void main(String[] args) {
		int[] arr= {31,24,45,16,57,88};
		int great=0, less=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>25)
				great++;
			else
				less++;
		}
		System.out.println("Greater than 25: "+great);
		System.out.println("Lesser than 25: "+less);
	}
}