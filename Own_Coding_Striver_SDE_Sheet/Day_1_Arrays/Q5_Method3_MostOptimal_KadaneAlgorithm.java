
public class Q5_Method3_MostOptimal_KadaneAlgorithm {
	
	public int kadaneAlgorithm(int [] arr) {
		int n = arr.length;
		int maxi = arr[0];
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			sum = sum + arr[i];
			if (sum < 0)
				sum = 0;
			maxi = Math.max(maxi, sum);			
		}
		return maxi;
	}

	public static void main(String[] args) {
		 
		Q5_Method3_MostOptimal_KadaneAlgorithm ob = new Q5_Method3_MostOptimal_KadaneAlgorithm();
		int [] arr = new int [] {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(ob.kadaneAlgorithm(arr));

	}

}










