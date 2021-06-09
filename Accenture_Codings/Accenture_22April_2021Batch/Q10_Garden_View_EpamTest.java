import java.util.ArrayList;
import java.util.List;

public class Q10_Garden_View_EpamTest {
	
	public static void gardenView(int [] arr) {
		if(arr.length == 0)
			return;
		
		List<Integer> ls = new ArrayList<>();
		ls.add(arr.length - 1);
		int curr = arr[arr.length - 1];
		
		for(int i=arr.length-2; i>=0; i--) {
			if(curr < arr[i]) {
				curr = arr[i];
				ls.add(i);
			}
		}
		
		for(int i=ls.size()-1; i>=0; i--) {
			System.out.println(ls.get(i));
		}
	}

	public static void main(String[] args) {
		int [] arr = {4,3,2,1};
		gardenView(arr);
	}
}
