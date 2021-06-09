
public class Separate_Prime_and_NonPrimes {
	
	public void primeNonPrimeSeperator(int [] nums) {
		int n = nums.length;
		int [] prime = new int [1000];
		int [] nonprime = new int [1000];
		
		for(int i=0; i<n; i++) {
			int m = nums[i];
			
			boolean flag = false;
			for(int j=2; j<m; j++) {
				if(m == 2) {
					prime[i] = nums[i];
					break;
				}
				if(nums[i] % j == 0) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				prime[i] = nums[i];
			}
			else {
				nonprime[i] = nums[i];
			}
		}
		
		for(int i=0; i<prime.length; i++) {
			if(prime[i] != 0)
				System.out.print(prime[i]+" ");
		}
		
		for(int i=0; i<nonprime.length; i++) {
			if(nonprime[i] != 0)
				System.out.print(nonprime[i]+" ");
		}
	}

	public static void main(String[] args) {
		Separate_Prime_and_NonPrimes ob = new Separate_Prime_and_NonPrimes();
		int [] nums = new int [] {2,9,5,3,14,80,17};
		ob.primeNonPrimeSeperator(nums);
	}
}
