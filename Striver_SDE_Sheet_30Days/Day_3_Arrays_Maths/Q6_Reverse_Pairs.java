import java.util.ArrayList;

public class Q6_Reverse_Pairs {
	
	// this is the function merges two sorted arrays and return 
	// Reverse pairs count "cnt" in the arrays
	public int merge(int arr[], int low, int mid, int high) {
		int cnt = 0;
		int j = mid + 1;
		
		for (int i = low; i <= mid; i++) {
			while ( j <= high && arr[i] > 2*(long)arr[j]){
				System.out.println(arr[i] +" "+arr[j]);
				j++;
			}
			cnt += (j - (mid + 1));
		}
		
		ArrayList <Integer> temp = new ArrayList<>();
		int left = low, right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left++]);
			}
			 else {
				temp.add(arr[right++]);
			}
		}
		
		while (left <= mid) 
			temp.add(arr[left++]);
	
		while (right <= high)
			temp.add(arr[right++]);
		
	    for (int i = low; i<= high; i++) {
			arr[i] = temp.get(i-low);
	   }
	    return cnt;
	}
	
	int mergeSort(int arr[], int low, int high) {
		
		if (low >= high) 
			return 0;
			
			int mid = (low + high) / 2;
			
			int inv = mergeSort(arr, low, mid);
			inv += mergeSort(arr, mid + 1, high);
			inv += merge(arr, low, mid, high);
		
		    return inv ;
	}
	
	public int reversePairs (int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		 
		Q6_Reverse_Pairs ob = new Q6_Reverse_Pairs();
		int arr[] = new int [] {40, 25, 19, 12, 9, 6, 2};
		int ans = ob.mergeSort(arr, 0, arr.length - 1);
		System.out.println("Number of reverse pairs found is : " + ans);
		
	}

}
