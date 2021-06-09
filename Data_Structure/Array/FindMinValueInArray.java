
import java.util.*;

public class FindMinValueInArray {
	
	public void printArray (int [] arr) {
		System.out.println("Input array is : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int minValue (int [] arr) {
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if (arr [i] < min) {
				min  = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		 
		FindMinValueInArray a = new FindMinValueInArray();
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter no.of elements in Array you want : ");
		int n = kb.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++) {
			System.out.print("Add element : ");
			arr [i] = kb.nextInt();
		}
		kb.close();
		
		a.printArray(arr);
		int res = a.minValue(arr);
		System.out.println("Minimum value in array is : " + res);
	}

}
