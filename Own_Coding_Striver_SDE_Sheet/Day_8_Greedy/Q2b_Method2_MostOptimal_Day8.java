import java.util.Arrays;

public class Q2b_Method2_MostOptimal_Day8 {
	
///////////////////// When Finish time is not sorted ///////////////////////
	
	public int maxActivitySelector(int[] start, int[] finish) {
		int n = start.length;
		
		Arrays.sort(start);
		Arrays.sort(finish);
		
		int i = 1;
		int j = 0;
		int maxActivity = 1;
		
		while(i<n && j<n) {
			if(start[i] >= finish[j]) {
				maxActivity++;
				i++;
				j++;
			} else {
				i++;
			}
		}
		return maxActivity;
	}
	
	public static void main(String[] args) {
		
		Q2b_Method2_MostOptimal_Day8 ob = new Q2b_Method2_MostOptimal_Day8();
//		int [] start = new int [] {5, 5, 0, 1, 8, 3};
//		int [] finish = new int [] {7, 9, 6, 2, 9, 4};
		int [] start = new int []  {1,2,3,4,7,8,9,9,11,12};
		int [] finish = new int [] {3,5,4,7,10,9,11,13,12,14};
		System.out.println(ob.maxActivitySelector(start, finish));
	} 
}
