
public class Q2_Type3_Day2 {
	
	public void pascalTriangleRowValue(int r) {
		
		int [] arr = new int [r];
		arr[0] = 1;
		arr[r-1] = 1;
		int res = 1;
		
		for (int i=1; i<r-1; i++) {
			res = res * (r-i) / i;
			arr[i] = res;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		 
		Q2_Type3_Day2 ob = new Q2_Type3_Day2();
		ob.pascalTriangleRowValue(5);
	}
}
