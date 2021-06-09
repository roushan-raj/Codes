import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//////////////////This code is not much understandable ///////////////////
////////////////Solving with time complexity of O(nlogn) + 0(n) //////////////////////
/////////////// Solving with space complexity of O(n) in worst case //////////////////

public class Q6_Merge_Overlapping_Subintervals {
	
    public int[][] merge(int[][] intervals) {
    	List <int[]> res = new ArrayList<>();
    	
    	if(intervals.length == 0 || intervals == null) {
    		return res.toArray(new int [0][]);
    	}
    	Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
    	
    	int start = intervals [0][0];
    	int end = intervals [0][1];
    	
    	for(int [] i : intervals) {
    		if (i[0] <= end) {
    			end = Math.max(end, i[1]);
    		}
    		else {
    			res.add(new int [] {start, end});
    			start = i[0];
    			end = i[1];
    		}
    	}
    	res.add(new int[] {start, end});
    	return res.toArray(new int [0][]);
    }
    
    public void printArray(int [][] intervals) {
		for(int i=0; i<intervals.length; i++) {
			System.out.print(intervals[i] + " ");
		}
		System.out.println();
	}
    

	public static void main(String[] args) {
		 
		Q6_Merge_Overlapping_Subintervals ob = new Q6_Merge_Overlapping_Subintervals();
		int [][] intervals = new int [][] {{1,3},{2,6},{8,10},{15,18}};
		//System.out.println("Merge Intervals are : " + ob.merge(intervals));
		ob.merge(intervals);
		ob.printArray(intervals);

	}

}
