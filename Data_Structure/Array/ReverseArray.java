import java.util.Scanner;

public class ReverseArray {
	
	public void printArray(int arr[]) {
		int n = arr.length;
		//System.out.println("Input array is : ");
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int[] reverseArray(int [] arr, int start, int end) {
		while (start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
 
	public static void main(String[] args) {
		 
		ReverseArray array = new ReverseArray();
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter no.of elements in Array you want : ");
		int n = kb.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			System.out.print("Add element : ");
			arr [i] = kb.nextInt();
		}
		kb.close();
		
		array.printArray(arr);
		
		array.reverseArray(arr, 0, arr.length-1);
		array.printArray(arr);

	}

}
