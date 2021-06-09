public class Dutch_National_Flag{
	public void sort(int[]arr) {
		int n = arr.length;
		int low = 0, mid = 0, high = n-1;	
		while(mid<=high) {		
			if(arr[mid] == 0) {         // mid == 0, swap(arr, low, mid)
				swap(arr, low, mid);   
				low++; mid++;           // increment low & mid
				
			} else if(arr[mid] == 1) {  // mid == 1, increment mid
				mid++;                  // increment mid
				
			} else if(arr[mid] == 2) {  // mid == 2, swap(arr, mid, high)
				swap(arr, mid, high);
				high--;                 // decrement high
			}
		}
		for(int k=0; k<n; k++) {        // printing sorted array
			System.out.print(arr[k]+" ");
		}
	}
	public void swap(int [] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		Dutch_National_Flag ob = new Dutch_National_Flag();
		int [] arr = new int[] {0,1,1,0,1,2,1,2,0,0,0,1};
		ob.sort(arr);
	}
}
