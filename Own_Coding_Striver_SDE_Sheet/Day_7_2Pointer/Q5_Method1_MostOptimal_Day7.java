
public class Q5_Method1_MostOptimal_Day7 {
	
	public int maxContineous_1_s(int[]arr, int k) {
		int n = arr.length;
		if(n == 0)
			return 0;
		
		int i=0;
		int j=0;
		
		while(i<n) {
			if(arr[i] == 0) k--;
			if(k<0) {
				if(arr[j] == 0) {
					k++;
				}
				j++;
			}
			i++;
		}
		return i-j;
	}

	public static void main(String[] args) {
		
		Q5_Method1_MostOptimal_Day7 ob = new Q5_Method1_MostOptimal_Day7();
		int [] arr = new int [] {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println(ob.maxContineous_1_s(arr, 2));
	}
}
