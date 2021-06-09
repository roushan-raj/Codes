
public class Q5_Method2_MostOptimal_Day2 {
	
	public int buySellStocks(int[]arr) {
		int n = arr.length;
		int maxi = Integer.MAX_VALUE;
		int profit = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] < maxi)
				maxi = arr[i];
			
			int diff = arr[i] - maxi;
			profit = Math.max(profit, diff);
		}
		return profit;
	}

	public static void main(String[] args) {
		 
		Q5_Method2_MostOptimal_Day2 ob = new Q5_Method2_MostOptimal_Day2();
		int [] arr = new int[] {7,1,5,3,6,4,9};
		System.out.println(ob.buySellStocks(arr));
	}

}









