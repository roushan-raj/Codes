import java.util.Arrays;

public class Q4_Method1 {
	
	public void mergeTwoArrays(int [] arr1, int [] arr2) {
		int [] mergedArray = new int [arr1.length+arr2.length] ; 
		
		for (int i=0; i<arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		for (int i=0; i<arr2.length; i++) {
			mergedArray[arr1.length+i] = arr2[i];
		}
		Arrays.sort(mergedArray);
		
		for (int i=0; i<arr1.length+arr2.length; i++) {
			if (i < arr1.length) {
		     	arr1[i] = mergedArray[i];
			} else 
				arr2[i-arr1.length] =  mergedArray[i];
		}
		
		System.out.print("First Array is : ");
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Second Array is : ");
		for (int i=0; i<arr2.length; i++) {
			System.out.print( arr2[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		Q4_Method1 ob = new Q4_Method1();
		int [] arr1 = new int [] {1,4,7,8,10};
		int [] arr2 = new int [] {2,3,9};
		ob.mergeTwoArrays(arr1, arr2);

	}

}
