
public class Throttling_Gateway_AmazonOA {
	
	public static int transactions(int [] arr) {
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i > 2 && arr[i] == arr[i-3]) {
				ans++;
			}
			else if(i > 19 && (arr[i] - arr[i-20]) < 10) {
				ans++;
			}
			else if(i > 59 && (arr[i] - arr[i-60]) < 60) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int [] arr = new int[]  {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11};
		System.out.println(transactions(arr));
	}
}
