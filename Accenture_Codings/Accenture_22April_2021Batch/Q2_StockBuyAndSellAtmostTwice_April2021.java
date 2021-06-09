
class Q2_StockBuyAndSellAtmostTwice_April2021 { 
	
	static void maxProfitAfterTwoTransactions(int price [], int n) {
		int profit = 0;
		
		for(int i=1; i<price.length; i++) {
			int sub = price[i] - price[i-1];
			if(sub > 0) {
				profit = profit + sub;
			}
		}
		System.out.println(profit);
	}
	
    static int maxProfit(int price[], int n) { 
       
        int profit[] = new int[n]; 
        for (int i=0; i<n; i++) 
            profit[i] = 0; 
       
        int max_price = price[n-1]; 
        for (int i=n-2;i>=0;i--) { 
          
            if (price[i] > max_price) 
                max_price = price[i]; 
       
        
            profit[i] = Math.max(profit[i+1], max_price-price[i]); 
        } 
       
        int min_price = price[0]; 
        for (int i=1; i<n; i++) { 
          
            if (price[i] < min_price) 
                min_price = price[i]; 
       
            profit[i] = Math.max(profit[i-1], profit[i] + (price[i]-min_price)); 
        } 
        int result = profit[n-1]; 
        return result; 
    } 
  
  
    public static void main(String args[]) { 
        int price[] = {10,5,22,65,8,75,90,80}; 
        int n = price.length; 
        System.out.println("Maximum Profit = "+ maxProfit(price, n)); 
        maxProfitAfterTwoTransactions(price, n);
    } 
}