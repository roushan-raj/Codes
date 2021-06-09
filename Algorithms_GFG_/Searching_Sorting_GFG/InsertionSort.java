
/////////////////// Time Complexity = O(n^2) ///////////////////

public class InsertionSort {
	
	void insertionSort(int arr[], int n) {
		
		int i, j;
		for (i=1; i<n; i++) {
			int key = arr [i];
			 j = i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
	}
	
	void printArray(int arr[], int n) {
		System.out.println("Sorted Array :");
		for (int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");	
		}
		
	}
	
	public static void main (String args[]) {
		
		int arr[] = {5,9,3,7,22,15};
		int n = arr.length;
		InsertionSort ob = new InsertionSort();
		ob.insertionSort(arr, n);
		ob.printArray(arr, n);
	}

}
