
public class Q4_Inversion_of_Array {
	
	// this is the function merges two sorted arrays and return 
	// inversion count in the arrays
	public int merge(int arr[], int temp[], int left, int mid, int right) {
		int i,j,k;
		int inv_count = 0;
		
		i = left;       // i ---- is the index for left sub-array
		j = mid;      // j ---- is the index for right sub-array
		k = left;      // k ---- is the index for resultant merged sub-array
		while((i <= mid - 1) && (j <= right)) {
			
			// if left element is smaller then right element, so we
			// simply copied down the element 
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}  else {
				
				// if right element is smaller then left then, then we will
				// copied down all elements and will add all then no.of elements 
				// from i to mid that is 'mid-i' to inv_count
				temp[k++] = arr[j++];
				inv_count = inv_count + (mid - i);
			}
		}
		
		while (i <= mid - 1) 
			temp[k++] = arr[i++];
	
		while (j <= right)
			temp[k++] = arr[j++];
		
	    for (i = left; i<= right; i++)
			arr[i] = temp[i];
		
	    return inv_count;
	}
	
	int mergeSort(int arr[], int temp[], int left, int right) {
		int mid, inv_count = 0;
		if (right > left) {
			
			mid = (right + left) / 2;
			
			inv_count += mergeSort(arr, temp, left, mid);
			inv_count += mergeSort(arr, temp, mid + 1, right);
			inv_count += merge(arr, temp, left, mid + 1, right);
		}
		return inv_count;
	}

	public static void main(String[] args) {
		 
		Q4_Inversion_of_Array ob = new Q4_Inversion_of_Array();
		int arr[] = new int [] {5, 3, 2, 4, 1};
		int n = arr.length;
		int temp[] = new int [n];
		int ans = ob.mergeSort(arr, temp, 0, arr.length - 1);
		System.out.println("Number of inversions found is : " + ans);
		
	}

}
