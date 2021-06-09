
public class Quick_sort {
	
	public int partition(int[] arr, int l, int r) {
		
		int pivot = arr[r];
		int i = l-1;
		
		for(int j=l; j<r; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, r);    // here r means pivot element
		return i+1;
	}
	
	public void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void quickSort(int arr[], int l, int r) {
		
		if(l<r) {
			
			int pi = partition(arr, l, r);
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
		}
	}
	
	public void display(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Quick_sort ob = new Quick_sort();
		int arr[] = new int [] {5,4,3,2,1,11,45,34};
		int n = arr.length;
		ob.quickSort(arr, 0, n-1);
		ob.display(arr);
	}
}
