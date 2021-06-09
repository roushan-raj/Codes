
public class Q4_Method1_Day12 {
	
	public void powerSet(int [] arr) {
		int size = arr.length;
		int n = (int) Math.pow(2, size);
		
		System.out.print("{}");
		for(int i=0; i<n; i++) {
			for(int j=0; j<size; j++) {
				
				if((i & (1<<j)) != 0) {
					System.out.print(arr[j]+",");	
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q4_Method1_Day12 ob = new Q4_Method1_Day12();
		int [] arr = new int[] {1,2,3};
		ob.powerSet(arr);
	}
}
