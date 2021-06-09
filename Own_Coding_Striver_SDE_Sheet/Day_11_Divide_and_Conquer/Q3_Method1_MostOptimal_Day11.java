
public class Q3_Method1_MostOptimal_Day11 {
	
	public int findElememt(int [] nums) {
	int l = 0;
	int r = nums.length-1;
	
	while(l<r) {
		int mid = l + (r-l)/2;
		if(mid % 2 == 0) {
			if(nums[mid] == nums[mid+1])
				l = mid+2;
			else if(nums[mid] == nums[mid-1])
				r = mid-2;
			else
				return nums[mid];
		} else {
			if(nums[mid] == nums[mid-1])
				l = mid+1;
			else
				r = mid-1;
		}
	  }
	   return nums[l];
	}
	

	public static void main(String[] args) {
		Q3_Method1_MostOptimal_Day11 ob = new Q3_Method1_MostOptimal_Day11();
		int [] nums = new int[] {1,1,2,2,3,3,4,4,5,6,6,7,7};
		System.out.println(ob.findElememt(nums));
	}
}
