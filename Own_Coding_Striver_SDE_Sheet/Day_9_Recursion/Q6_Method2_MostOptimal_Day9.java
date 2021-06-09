import java.util.ArrayList;
import java.util.List;
public class Q6_Method2_MostOptimal_Day9 {
	
	 public String getPermutation(int n, int k) {
	        int block_size = 1;
	        List<Integer> remain_nums = new ArrayList<>();
	        for(int i=1; i<n; i++) {
	            block_size = block_size * i;
	            remain_nums.add(i);
	        }
	        remain_nums.add(n);
	        
	        String ans = "";
	        k = k - 1;      // coz of 0 based indexing
	        
	        while(true) {
	            ans = ans + remain_nums.get(k / block_size);
	            remain_nums.remove(k / block_size);
	            if(remain_nums.size() == 0) {
	                break;
	            }
	            
	            k = k % block_size;
	            block_size = block_size / remain_nums.size();
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		Q6_Method2_MostOptimal_Day9 ob = new Q6_Method2_MostOptimal_Day9();
		System.out.println(ob.getPermutation(4, 9));
	}
}
