
public class MergeSort {
	
	public void merge(int[]arr, int l, int mid, int r) {
		int n1 = mid+1-l;
		int n2 = r-mid;
		int[]a1 = new int[n1];
		int[]b1 = new int[n2];
		
		for(int i=0; i<n1; i++) {
			a1[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			b1[j] = arr[mid+1+j];
		}
		
		int i=0; int j=0; int k=l;
		
		while(i<n1 && j<n2) {
			if(a1[i] < b1[j]) {
				arr[k] = a1[i];
				k++; i++;
			}
			else {
				arr[k] = b1[j];
				k++; j++;
			}
		}
		
		while(i<n1) {
			arr[k] = a1[i];
			k++; i++;
		}
		while(j<n2) {
			arr[k] = b1[j];
			k++; j++;
		}
	}
	
	public void mergeSort(int[]arr, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}
	
	public void display(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		MergeSort ob = new MergeSort();
		//int[]arr = new int [] {6,3,8,4,2,9,1};
		int[] arr = new int [] {102,4,100,1,101,32};
		ob.mergeSort(arr, 0, arr.length-1);
		ob.display(arr);
	}

}
