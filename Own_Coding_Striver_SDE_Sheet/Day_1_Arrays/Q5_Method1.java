
public class Q5_Method1 {
	
	public int maxSum(int [] arr) {
		
	    int n = arr.length;
		int maxi = 0;
		
		for(int i=0; i<n-1; i++) {
			for (int j=i; j<n; j++) {
				int sum = 0;
				for (int k=i; k<=j; k++) {
					sum = sum + arr[k];
					maxi = Math.max(maxi, sum);
				}	
			}
		}
		return maxi;
	}			

	public static void main(String[] args) {
		 
		Q5_Method1 ob = new Q5_Method1();
		int [] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ob.maxSum(arr));

	}

}
