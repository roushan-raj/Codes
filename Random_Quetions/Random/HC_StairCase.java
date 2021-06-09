
public class HC_StairCase {
	
	static void miniMaxSum(int[] arr) {
	    
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE; 
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        for(int j=0; j<arr.length; j++){
            minEle = Math.min(minEle, arr[j]);
            maxEle = Math.max(maxEle, arr[j]);
        }
      
        System.out.print((sum-maxEle) +" "+ (sum-minEle));
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(78%5);
	}
}
