public class Q4_Method2_Day11 {

	// Shivangi's Code for this question
	
	public static int findElement(int [] arr , int k) {
		int n = arr.length;
		int minIdx =-1;
		if(arr[0] < arr[n-1]) {
			minIdx = 0;
		}
		else {
			for(int i=1; i< arr.length-1 ; i++ ) {
				if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
					minIdx = i;
				}
			}
		}
		if(minIdx==-1) {
			minIdx = n-1;
		}
		//int noOfRotations = (arr.length - minIdx)%arr.length;
		
		if(k < arr[n-1]) {
			int start = minIdx;
			int end = n-1;
			while(start <= end ) {
				int mid = (start+end)/2;
				if(arr[mid] == k) return mid;
				
				else if(arr[mid] < k) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return -1;
		}
		else {
			int start = 0;
			int end = minIdx-1;
			while(start <= end ) {
				int mid = (start+end)/2;
				if(arr[mid] == k) return mid;
				
				else if(arr[mid] < k) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return -1;
		}

	}
	public static void main(String[] args) {
		int [] a = new int[] {4,6,8,11,12,15,19,20,2};
		System.out.println(findElement(a , 8));
	}
}