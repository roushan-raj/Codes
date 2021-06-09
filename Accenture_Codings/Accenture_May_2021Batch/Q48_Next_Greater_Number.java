import java.util.*;

public class Q48_Next_Greater_Number {
	
	static String ans = "";
	
	public static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
 
    public static String findNext(String str, int n) {
    	
    	char [] ar = new char [str.length()];
    	
    	for(int i=0; i<n; i++) {
    		ar[i] = str.charAt(i);
    	}
    			
        int i;
         
        for (i = n - 1; i > 0; i--){
        	
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
      
        if (i == 0){
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;
             
            for (int j = i + 1; j < n; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }
 
            swap(ar, i - 1, min);

            Arrays.sort(ar, i, n);
            
            for (i = 0; i < n; i++)
               ans = ans + ar[i];
        }
        return ans;
    }

	public static void main(String[] args) {
		String str = "1234567849876554321";
		System.out.println(findNext(str, str.length()));
		
	}
}
