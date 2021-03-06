
public class Q37_Maximum_Subarray {
	
	public static int maxSubArraySum(int a[], int size) {
		
	    int maxh = a[0];
	    int maxk = a[0];
 
	    for (int i = 1; i < size; i++){
	    	
	    	maxk = Math.max(a[i], maxk + a[i]);
	        maxh = Math.max(maxh, maxk);
	    }
    	return maxh;
    }

	public static void main(String[] args) {
		int [] arr = {3, -1, 2};
		int size = arr.length;
		
		System.out.println(maxSubArraySum(arr, size));
	}

}
