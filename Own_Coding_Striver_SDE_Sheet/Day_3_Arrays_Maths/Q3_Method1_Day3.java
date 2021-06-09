
public class Q3_Method1_Day3 {
	
	public int majority(int[]arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int ele = arr[i];
			int count = 0;
			for(int j=0; j<n; j++) {
				if (ele == arr[j])
					count = count+1;
				if (count > n/2)
					return arr[j];
			}		
		}
		return -1;
	}

	public static void main(String[] args) {
		 
		Q3_Method1_Day3 ob = new Q3_Method1_Day3();
		int [] arr = new int[] {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
		System.out.print(ob.majority(arr));

	}

}
