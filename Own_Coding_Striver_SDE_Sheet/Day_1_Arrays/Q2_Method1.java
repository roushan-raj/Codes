import java.util.Arrays;

public class Q2_Method1 {
	
	public void arrange0_1_2(int[]arr) {
		Arrays.sort(arr);
	}
	
	public void display(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		Q2_Method1 ob = new Q2_Method1();
		int [] arr = new int [] {0,1,1,0,1,2,1,2,0,0,0,1};
		ob.arrange0_1_2(arr);
		ob.display(arr);

	}

}
