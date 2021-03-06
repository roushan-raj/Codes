import java.util.*;
public class Q12_Remove_Duplicate_From_Array {
	
	public static int findUnique(int [] arr, int n) {
		
		HashSet<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			set.add(arr[i]);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			list.add(it.next());
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		int [] arr = {11, 14, 15, 13, 13, 20};
		int n = arr.length;
		
		System.out.println(findUnique(arr, n));
	}

}
