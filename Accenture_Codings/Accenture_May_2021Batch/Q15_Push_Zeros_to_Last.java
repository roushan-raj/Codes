import java.util.*;
public class Q15_Push_Zeros_to_Last {
	
	public static List<Integer> pushZerosToLast(int [] arr){
		List<Integer> ls = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			ls.add(arr[i]);
		}
		
		for(int i=0; i<ls.size(); i++) {
			if(ls.get(i) == 0) {
				ls.remove(i);
				ls.add(0);
			}
		}
		return ls;
	}

	public static void main(String[] args) {
		
		int arr [] = {2, 0, 3, 1, 0, 2, 0, 1};
		System.out.println(pushZerosToLast(arr));
	}
}
