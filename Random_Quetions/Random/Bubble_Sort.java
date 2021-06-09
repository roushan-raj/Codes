
public class Bubble_Sort {
	
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		if(n == 0 || arr == null) {
			return;
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int k=0; k<n; k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		Bubble_Sort ob = new Bubble_Sort();
		int arr[] = new int[] {21,4,56,23,7,5};
		ob.bubbleSort(arr);
	}
}
