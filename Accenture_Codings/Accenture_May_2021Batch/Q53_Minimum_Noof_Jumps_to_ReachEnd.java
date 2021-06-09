
public class Q53_Minimum_Noof_Jumps_to_ReachEnd {
	
	static int minJumps(int arr[], int n) {
        if (n <= 1)
            return 0;
 
        if (arr[0] == 0)
            return -1;
 
      
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;
 
       
        for (int i = 1; i < n; i++) {
           
            if (i == arr.length - 1)
                return jump;
            
            maxReach = Math.max(maxReach, i + arr[i]);
 
            step--;
 
            if (step == 0) {
               
                jump++;
 
                if (i >= maxReach)
                    return -1;
 
                step = maxReach - i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		
		int [] arr = { 1, 3, 6, 1, 0, 9, 8, 7, 6 };
		System.out.println(minJumps(arr, arr.length));
	}
}
