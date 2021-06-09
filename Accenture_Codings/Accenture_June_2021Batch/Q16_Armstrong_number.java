
public class Q16_Armstrong_number {
	
	public static String checkArmstrong(int n) {
		int num = n;
		
		int digit = 0;
		while(num != 0) {
			digit++;
			num = num / 10;
		}
		
		
		int val = n;
		int sum = 0;
		while(val != 0) {
			int rem = val%10;
			sum = sum + (int)Math.pow(rem, digit);
			val = val / 10;
		}
		
//		if(sum == n) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
		if(sum == n) {
			return "yes";
		}
		else {
			return "no";
		}
		
	}

	public static void main(String[] args) {
		
		int n = 1634;
		System.out.println(checkArmstrong(n));
		
	}
}
