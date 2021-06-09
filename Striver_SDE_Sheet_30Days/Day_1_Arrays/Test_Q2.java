
public class Test_Q2 {
	
	public void sortArray(int [] nums) {
		int n = nums.length;
		int low = 0;
		int mid = 0;
		int high = n-1;
		int temp;
		
		while (mid<=high) {
			if (nums[mid]==0) {
				temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			
			}
			
			else if (nums[mid]==1) {
				mid++;
				
			}
			
			else if (nums[mid]==2) {
			temp = nums[mid];
			nums[mid] = nums[high];
			nums[high] = temp;
			high--;
		
			}
		}	
	}
	
	public void printArray(int [] nums) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		 
		Test_Q2 ob = new Test_Q2();
		int [] nums = new int[] {0,1,1,0,1,2,1,2,0,0,0,1};
		ob.sortArray(nums);
		ob.printArray(nums);

	}

}
