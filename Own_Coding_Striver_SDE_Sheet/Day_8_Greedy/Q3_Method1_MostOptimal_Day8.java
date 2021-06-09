
public class Q3_Method1_MostOptimal_Day8 {
	
	public int minCoin(int[] arr, int amount) {
		int val = amount;
		int count = 0;
		int i = arr.length-1;
		
//		for(int k=i; k>=0; k--) {
//			if(arr[k] <= amount) {
//				count = count + val/arr[k] ;
//				val = val % arr[k];
//				i = k;
//			}
//		} 
//		return count;
		
		while(val != 0 && i > 0){
           if(arr[i] <= val){
                val = val - arr[i];
                count++;
           }
            else{
                i--;
            }
        }
		return count;
	}

	public static void main(String[] args) {
		Q3_Method1_MostOptimal_Day8 ob = new Q3_Method1_MostOptimal_Day8();
		int [] arr = new int [] {1,2,5,10,20,50,100,200,500,2000};
		//int [] arr = {186,419,83,408};
		System.out.println(ob.minCoin(arr, 49));
	}

}
