
public class Q20_Balls_Required_Remaining {
	
	public static int findBalls(int [] arr, int n) {
		
		int rem = 0;
		for(int i=0; i<n; i++) {
			rem = rem +  Math.abs((i+1)*(i+1) - arr[i]);
		}
		return rem;
	}

	public static void main(String[] args) {
		int [] arr = {0, 3, 5};
		
		System.out.println(findBalls(arr, arr.length));
	}
}
