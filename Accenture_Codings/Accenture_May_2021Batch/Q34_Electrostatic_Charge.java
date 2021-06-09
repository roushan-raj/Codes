
public class Q34_Electrostatic_Charge {
	
	public static int calculate(int arr[], String str, int n) {
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'P') {
				sum = sum + arr[i];
			}
			else {
				sum = sum - arr[i];
			}
		}
		
		return sum * 100;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {4, 6, 8, 3, 5, 2};
		String str = "PPNPNP";
		int n = arr.length;
		
		System.out.println(calculate(arr, str, n));
	}

}
