
public class Inversions_in_Array {
	
	public int merge(int[]arr, int l, int mid, int r) {
		int inv = 0;
		int n1 = mid-l+1;
		int n2 = r - mid;
		int[]a1 = new int[n1];
		int[]b1 = new int[n2];
		
		for(int i=0; i<n1; i++) {
			a1[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			b1[j] = arr[mid+1+j];
		}
		
		int i = 0; int j = 0; int k = l;
		
		while(i<n1 && j<n2) {
			if(a1[i] < b1[j]) {
				arr[k] = a1[i];
				k++; i++;
			}
			else {
				arr[k] = b1[j];
				inv += n1-i;    // important step to notice for inversion
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
		return inv;
	}
	
	public int mergeSort(int[]arr, int l, int r) {
		int  inv = 0;
		if(l<r) {
			int mid = (l+r)/2;
			inv += mergeSort(arr, l, mid);
			inv += mergeSort(arr, mid+1, r);
			
			inv += merge(arr, l, mid, r);
		}
		return inv;
	}

	public static void main(String[] args) {
		 
		Inversions_in_Array ob = new Inversions_in_Array();
		int [] arr = new int [] {3,5,6,9,1,2,7,8};
		System.out.print("Total inversions: "+ob.mergeSort(arr, 0, arr.length-1));
	}
}
