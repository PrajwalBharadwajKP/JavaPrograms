package Video4;

public class ConcatArray {
	public static void main(String[] args) {
		int[] arr1= {9,3,6,22,46,87};
		int[] arr2= {23,56,56,34,23,56,67,32,3,6,1};
		int[] arr3= new int[arr1.length+arr2.length];
		int count=0;
		for(int ar:arr1)
			arr3[count++]=ar;
		for(int ar:arr2)
			arr3[count++]=ar;
		for(int ar:arr3)
			System.out.println(ar);
		for(int i=0;i<arr3.length;i++) {
			for(int j=i+1;j<arr3.length;j++) {
				if(arr3[i]>arr3[j]) {
					int temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
			}
		}
		System.out.println("==================================================");
		for(int ar:arr3)
			System.out.println(ar);
	}
}