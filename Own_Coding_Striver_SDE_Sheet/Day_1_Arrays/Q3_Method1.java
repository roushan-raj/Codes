import java.util.Arrays;

public class Q3_Method1 {
	
	public void repeatMissing(int [] arr) {
		Arrays.sort(arr);
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i-1] == arr[i]) {
				System.out.println("Duplicate number is : " + arr[i]);
			}
			else if (arr[i] == 2 + arr[i-1]) {
				System.out.println("Missing number is : " + i);
			}
		}
	}

	public static void main(String[] args) {
		 
		Q3_Method1 ob = new Q3_Method1();
		int [] arr = new int [] {4,5,6,2,2,1};
		ob.repeatMissing(arr);

	}

}
