
public class Q2a_Method1_MostOptimal_Day8 {
	
	////////////// When Finish time is already sorted ////////////////
	
	public int maxActivitySelector(int[] start, int[] finish) {
		int n = start.length;
		
		int i=0;
		System.out.print(i+" ");
		int count = 1;
		
		for(int j=1; j<n; j++) {
			if(start[j] >= finish[i]) {
				count++;
				i = j;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return count;	
	}

	public static void main(String[] args) {
		
		Q2a_Method1_MostOptimal_Day8 ob = new Q2a_Method1_MostOptimal_Day8();
		int [] start = new int [] {1, 3, 0, 5, 8, 5};
		int [] finish = new int [] {2, 4, 6, 7, 9, 9};
//		int [] start = new int []  {1,2,3,4,7,8,9,9,11,12};
//		int [] finish = new int [] {3,5,4,7,10,9,11,13,12,14};
		System.out.println("Maximum no.of work: "+ob.maxActivitySelector(start, finish));
	}
}
