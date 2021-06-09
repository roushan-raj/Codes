
//////////////// Solving with time complexity of O(n) ///////////////////
//////////////// Solving with space complexity of O(1) //////////////////

import java.util.Vector;

public class Q3_2nd_optimal_Soln_SUM_and_SUM_sq_Repeat_and_Missing_Number {
	
	static Vector<Integer> repeatedNumber(int[] A)  
    { 
        int len = A.length; 
        int Sum_N = (len * (len + 1)) / 2; 
        int Sum_NSq = (len * (len + 1) *  
                         (2 * len + 1)) / 6; 
        int missingNumber = 0, repeating = 0; 
  
        for (int i = 0; i < A.length; i++)  
        { 
            Sum_N -= A[i]; 
            Sum_NSq -= A[i] * A[i]; 
        } 
  
        missingNumber = (Sum_N + Sum_NSq /  
                                 Sum_N) / 2; 
        repeating = missingNumber - Sum_N; 
        Vector<Integer> ans = new Vector<>(); 
        ans.add(repeating); 
        ans.add(missingNumber); 
        return ans; 
    } 

	public static void main(String[] args) {
		 
		int[] v = { 4, 3, 6, 2, 1, 6, 7 }; 
        Vector<Integer> res = repeatedNumber(v); 
        for (int x : res)  
        { 
            System.out.print(x + " "); 
        } 

	}

}
