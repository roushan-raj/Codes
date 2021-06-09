import java.util.*;
public class Q4_Method2_MostOptimal {
	
	public void subSets(int index, int sum, int [] arr, int n, ArrayList<Integer> sumSubsets) {
		if(index == n) {
			sumSubsets.add(sum);
			return;
		}
		
		subSets(index+1, sum+arr[index], arr, n, sumSubsets);
		
		subSets(index+1, sum, arr, n, sumSubsets);
		
	}
	
	public ArrayList<Integer> sumOfSubsets(int [] arr, int n){
		ArrayList<Integer> sumSubsets = new ArrayList<>();
		subSets(0, 0, arr, n, sumSubsets);
		Collections.sort(sumSubsets);
		return sumSubsets;
	}

	public static void main(String[] args) {
		Q4_Method2_MostOptimal ob = new Q4_Method2_MostOptimal();
		int [] arr = new int [] {2,3};
		System.out.println(ob.sumOfSubsets(arr, arr.length));
	}
}
