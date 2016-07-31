package session4.assignment1;

public class ReverseArray {

	public static void main(String[] args) {

		double[] arr = {4, 5, 0, 10, 32};
		
		System.out.println("Elements of the array are:");
		for(int i=0; i<5; i++)
			System.out.println(arr[i]);
		
		System.out.println("Reverse of the array is:");
		for(int i=4; i>=0; i--)
			System.out.println(arr[i]);
		
	}

}
