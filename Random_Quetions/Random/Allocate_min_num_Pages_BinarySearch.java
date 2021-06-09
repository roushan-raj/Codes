
public class Allocate_min_num_Pages_BinarySearch {
	
	public static int findPages(int[]a,int n,int m)
    {
        if(m > n){
            return -1;
        }
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        int res = -1;
        
        for(int i=0; i<n; i++){
            low = Math.max(low, a[i]);
            high = high + a[i];
        }
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(isValid(a, n, m, mid) == true){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    
    public static boolean isValid(int[] a, int n, int m, int mid){
        int student = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum+a[i];
            
            if(sum > mid){
                student ++;
                sum = a[i];
                
                if(student > m){
                    return false;
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		int [] arr = new int [] {12,34,67,90};
		System.out.println(findPages(arr, arr.length, 2));
	}
}
