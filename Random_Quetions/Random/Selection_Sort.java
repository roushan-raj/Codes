
public class Selection_Sort {
	
	public void selectionSort(int[] arr) {
		int n = arr.length;
		
		// edge case
		if(n == 0 || arr == null) {
			return;
		}
		// main logic
		for(int i=0; i<n-1; i++) {
			int i_min = i;
			
			for(int j=i+1; j<n; j++) {
				if(arr[i_min] > arr[j]) {
					i_min = j;
				}
			}
			// swapping arr[i] & arr[i_min]
			int temp = arr[i_min];
			arr[i_min] = arr[i];
			arr[i] = temp;
		}
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		Selection_Sort ob = new Selection_Sort();
		int [] arr = new int[] {64,25,12,22,11};
		ob.selectionSort(arr);
	}
}
