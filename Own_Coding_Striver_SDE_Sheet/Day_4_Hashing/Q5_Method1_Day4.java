
public class Q5_Method1_Day4 {
	
	public int xorSubArray(int [] arr, int x) {
		int n = arr.length;
		//int xor = 0;
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int xor = arr[i] ^ arr[j];
				if(xor == x) {
					//System.out.print(arr[i]+" "+arr[j]);
					count = count + 1;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		 
		Q5_Method1_Day4 ob = new Q5_Method1_Day4();
		int [] arr = new int [] {4,2,2,6,4};
		//int [] arr = new int [] {5,6,7,8,9};
		System.out.print("Total no.of such sub-array with XOR : "+ob.xorSubArray(arr, 6));
	}
}
