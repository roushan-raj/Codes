
public class Q2_MajorityElement_N_by_2_Times {
	
	public static int majorityElements(int [] arr) {
		int n = arr.length;
		
		int count = 0;
		int element = 0;
		
		for(int i=0; i<n; i++) {
			if(count == 0) {
				element = arr[i];
			}
			
			if(element == arr [i]) {
				count ++;
			}
			else {
				count --;
			}
		}
		return element;
	}

	public static void main(String[] args) {
		
		int [] arr = {1,2,1};
		System.out.println(majorityElements(arr));
	}
}
