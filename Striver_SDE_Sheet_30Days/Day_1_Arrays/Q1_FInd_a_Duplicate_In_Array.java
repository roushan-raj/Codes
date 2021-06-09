///////////////////////////////////////////////////////////////////////////////////
// There is only one duplicate number in the array, it could repeat more than once //
//////////////// Solve with space complexity of O(1) /////////////////
//////////////// Solve with time complexity of O(n) //////////////////
//////// Must not modify the given array, i.e can't apply sorting //////
/////////////////////////////////////////////////////////////////////
////// Solving with linked list, with hare & tortoise method, i.e concept of ///////
////////////////// movement of Fast and slow pointers /////////////////////////

public class Q1_FInd_a_Duplicate_In_Array {
	
	public int findDuplicate(int [] nums) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			 slow = nums[slow];
			 fast = nums[nums[fast]];
		} while(slow != fast);
		
		fast = nums[0];
		while(slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}

	public static void main(String[] args) {
		 
		Q1_FInd_a_Duplicate_In_Array ob  = new Q1_FInd_a_Duplicate_In_Array();
		//int [] nums = new int[] {1,3,4,2,2};
		//int [] nums = new int[] {3,1,3,4,2};
		int [] nums = new int[] {2,5,9,6,9,3,8,9,7,1};
		System.out.println("Duplicate number is :- " + ob.findDuplicate(nums));

	}

}
