
public class Q1_Method3_MostOptimal {
	
	public int duplicateNum(int [] arr) {
		int slow = arr[0];
		int fast = arr[0];
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
			
		} while(slow != fast);
		
		fast = arr[0];
		
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		return slow;
	}

	public static void main(String[] args) {
		 
		Q1_Method3_MostOptimal ob = new Q1_Method3_MostOptimal();
		int [] arr = new int [] {2,5,9,6,9,3,8,9,7,1};
		System.out.println(ob.duplicateNum(arr));

	}

}
