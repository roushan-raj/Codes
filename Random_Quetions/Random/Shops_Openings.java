
public class Shops_Openings {
	
	public void shops(int [] nums) {
		int n = nums.length;
		int count =0;
		
		for(int i=0; i<n; i++) {
			if(Math.sqrt(i) == Math.floor(Math.sqrt(i))) {
				count++;
			}
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		Shops_Openings ob = new Shops_Openings();
		int[]nums = new int[] {79,77,54,81,48,34,25,16};
		ob.shops(nums);
	}
}
