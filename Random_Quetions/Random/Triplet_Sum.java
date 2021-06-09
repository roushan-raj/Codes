import java.util.*;
public class Triplet_Sum {
	
	public static void triplet(int[] nums, int sum) {
		int len = nums.length;
		boolean flag = false;
		Arrays.sort(nums);
		
		for(int i=0; i<len-2; i++) {
			for(int j=i+1; j<len-1; j++) {
				for(int k=j+1; k<len; k++) {
					if(nums[i] + nums[j] + nums[k] == sum) {
						flag = true;
						System.out.print(nums[i] +" "+ nums[j] +" "+ nums[k]);
						break;
					}
				}
			}
		}
		if(flag == false) {
			System.out.println("No Triplet Found");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int n = sc.nextInt();
		int [] nums = new int[n];
		System.out.println("Enter elements of Array: ");
		for(int i=0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter Sum Value: ");
		int sum = sc.nextInt();
		sc.close();
		
	    triplet(nums, sum);
	}
}
