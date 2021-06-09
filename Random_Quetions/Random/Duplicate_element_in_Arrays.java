
public class Duplicate_element_in_Arrays {
	
	public int find_Duplicate(int[]arr) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			res = res^arr[i];
			//System.out.print(res+" ");
		}
		return res;
	}

	public static void main(String[] args) {
		Duplicate_element_in_Arrays ob = new Duplicate_element_in_Arrays();
		int [] arr = new int[] {1,1,2,3,2};
		System.out.println(ob.find_Duplicate(arr));
	}
}
