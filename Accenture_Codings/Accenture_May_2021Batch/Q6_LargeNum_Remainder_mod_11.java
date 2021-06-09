
public class Q6_LargeNum_Remainder_mod_11 {
	
	public static int mod(String str) {
		int len = str.length();
		
		int num, rem = 0;
		for(int i=0; i<len; i++) {
			num = rem * 10 + (str.charAt(i) - '0');
			rem = num % 11;
		}
		return rem;
	}

	public static void main(String[] args) {
		
		System.out.println(mod("121"));
	}
}
