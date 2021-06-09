
public class Q5_Kadanes_Algorithm_Maximum_Sum_of_Subarray {
	
	public int maxSubArray(int [] nums) {
		int sum = 0;
		int maxi = nums[0];
		for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
			if(sum > maxi) maxi = sum;
			if(sum < 0) sum = 0; 
		}
		return maxi;
	}

	public static void main(String[] args) {
		 
		Q5_Kadanes_Algorithm_Maximum_Sum_of_Subarray ob = new Q5_Kadanes_Algorithm_Maximum_Sum_of_Subarray();
		int [] nums = new int [] {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Maximum sum of Subarray is : " + ob.maxSubArray(nums));

	}

}
