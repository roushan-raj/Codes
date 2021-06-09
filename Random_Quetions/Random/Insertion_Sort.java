
public class Insertion_Sort {
	
	public void insertionSort(int[]arr) {
		int n = arr.length;
		
		// edge case
		if(n == 0 || arr == null) {
			return;
		}
		// main logic
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		// print sorted array
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		Insertion_Sort ob = new Insertion_Sort();
		int[] arr = new int[] {12,54,7,23,78,2,9};
		ob.insertionSort(arr);
	}
}
