
public class Q54_GCD_Of_Array {
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		return gcd(b, a%b);
	}
	
	public static int findGcd(int[]arr) {
		int res = arr[0];
		for(int i=1; i<arr.length; i++) {
			res = gcd(res, arr[i]);
			
			if(res == 1)
				return 1;
		}
		return res;
	}

	public static void main(String[] args) {
		
		int [] arr = new int[] {2, 4, 8};
		System.out.println(findGcd(arr));

	}
}
