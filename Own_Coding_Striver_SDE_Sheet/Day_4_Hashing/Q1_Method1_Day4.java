
public class Q1_Method1_Day4 {
	
	public void twoSum(int[]arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			int remain = x - arr[i];
			for(int j=i; j<arr.length; j++) {
				if(remain == arr[j]) {
					System.out.print("Two numbers are present at index: "+i+","+j);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		 
		Q1_Method1_Day4 ob = new Q1_Method1_Day4();
		int [] arr = new int [] {2,6,5,8,11};
		ob.twoSum(arr, 17);

	}
}
