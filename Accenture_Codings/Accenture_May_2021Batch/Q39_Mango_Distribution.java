
public class Q39_Mango_Distribution {
	
	public static int helper(int upper, int lower){
        int ans = 1;
 
        if (lower > upper - lower)
        	lower = upper - lower;
 
        for (int i = 0; i < lower; ++i) {
            ans = ans * (upper - i);
            ans = ans / (i + 1);
        }
        return ans;
    }
    
    public static int distribution(int mango, int people) {
 
        int ways = helper(people + mango - 1, people - 1);
        return ways;
    }

	public static void main(String[] args) {
		
		int mango = 1;
		int people = 12;
		System.out.println(distribution(mango, people));
		
	}
}
