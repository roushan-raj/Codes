
public class Q25_Elevator_Balancing {
	
	private static void elevator(int[] arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		if(sum % 2 == 0) {
			System.out.println(sum/2);
		}
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3};
		
		elevator(arr);
		
	}
}
