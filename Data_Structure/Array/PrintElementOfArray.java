import java.util.Scanner;

public class PrintElementOfArray {
	
	public void printArray(int arr[]) {
		int n = arr.length;
		System.out.println("Input array is : ");
		for (int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
 
	public static void main(String[] args) {
		 
		PrintElementOfArray array = new PrintElementOfArray();
		
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

	}

}
