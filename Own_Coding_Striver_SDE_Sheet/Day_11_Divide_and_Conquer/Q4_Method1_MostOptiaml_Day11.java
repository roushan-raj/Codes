
public class Q4_Method1_MostOptiaml_Day11 {
	
	public int findMinElementIndex(int[]arr, int x) {
		int start = 0;
		int end = arr.length-1;
		int n = end;
		int index=Integer.MIN_VALUE;
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[start]<=arr[end]) {
				index= start;
				System.out.println("Index of min element is: "+index);
				break;
			}
			int next = (mid+1)%n;
			int prev = (mid+n-1)%n;
			
			if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) {
			    index = mid;
			    break;
			} 
			if(arr[start]<=arr[mid]) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		
		if(arr[index] == x)
			return index;
		else if(x < arr[arr.length-1])
			return binarySearch(arr, index, arr.length-1, x);
		else 
			return binarySearch(arr, 0, index-1, x);
	}
	
	public int binarySearch(int[]arr, int left, int right, int x) {
		int mid =0;
		while(left<=right) {
			mid = left+(right-left)/2;
			if(arr[mid] == x)
				return mid;
			else if(arr[mid] < x)
				left = mid+1;
			else
				right = mid-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Q4_Method1_MostOptiaml_Day11 ob = new Q4_Method1_MostOptiaml_Day11();
		int arr [] = new int[] {11,12,15,18,2,3,5,8};
		System.out.println("Element Found at index: "
		                               +ob.findMinElementIndex(arr,15));
	}
}


