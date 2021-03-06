import java.util.*;
public class Q8_Prime_Num_FInd_Nth_Prime_Num {
    
    public static void findNthPrime(int n) {
    	helper();
    	System.out.println(p_list.get(n-1));
    }
     
    static int MAX_SIZE = 100005;
    
    static ArrayList<Integer> p_list = new ArrayList<Integer>();
   
    static void helper(){
        
        boolean [] prime = new boolean[MAX_SIZE];
         
        for(int i = 0; i < MAX_SIZE; i++)
        	prime[i] = true;
         
        for (int p = 2; p * p < MAX_SIZE; p++) {
            
            if (prime[p] == true){
                
                for (int i = p * p; i < MAX_SIZE; i += p)
                	prime[i] = false;
            }
        }

        for (int p = 2; p < MAX_SIZE; p++)
	        if (prime[p] == true)
	        	p_list.add(p);
    	}

	public static void main(String[] args) {
		
		int n = 5;
		findNthPrime(n);
	}
}
