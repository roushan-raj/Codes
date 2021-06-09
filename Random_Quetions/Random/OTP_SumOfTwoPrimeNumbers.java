import java.util.Arrays;

public class OTP_SumOfTwoPrimeNumbers {
	
	public void OTP(int p, int q) {
		int [] nums = new int [q];
		boolean flag = false;
		int m =0;
		
		for(int i=p; i<=q; i++) {
			
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					flag = true;
					break;
				}
			}		
			System.out.println(flag);
			if(flag == false) {
				nums[m] = i;
				m++;
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		Arrays.sort(nums);
		System.out.print(nums[0]+nums[nums.length-1]);
	}

	public static void main(String[] args) {
		OTP_SumOfTwoPrimeNumbers ob = new OTP_SumOfTwoPrimeNumbers();
		ob.OTP(10, 20);
	}
}
