
public class Q20_Moving_Apples_Distributions {
	
	public static int mangoTransfer(int [] arr) {
		int n = arr.length;
		int sum = 0;
		int rem_sum = 0;
		
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
		}
		int avg = (sum / n);
		
		for(int i=0; i<n; i++) {
			rem_sum = rem_sum + Math.abs(arr[i] - avg);
		} 
		return rem_sum/2;
	}

	public static void main(String[] args) {
		
		int arr [] = {2849, 1620, 705, 1, 30};
		System.out.println(mangoTransfer(arr));
	}
}
