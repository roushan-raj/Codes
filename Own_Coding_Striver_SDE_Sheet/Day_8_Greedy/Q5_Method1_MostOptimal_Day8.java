import java.util.*;

public class Q5_Method1_MostOptimal_Day8 {
	
	///////////////// When time intervals are given ////////////////////
	
	public int minRailway(float[][]trainTime) {
		//int n = trainTime.length;
		Arrays.sort(trainTime, Comparator.comparing((float[]itr) -> itr[1]));
		
		PriorityQueue<Float> heap = new PriorityQueue<Float>();
		
		int count = 0;
		for(float [] itr : trainTime) {
			if(heap.isEmpty()) {
				count++;
				heap.offer(itr[1]);
				
			} else {
				
				if(itr[0] >= heap.peek()) {
					heap.poll();
					
				} else {
					count++;
				}
				
				heap.offer(itr[1]);
			}	
		}
		return count;
	}

	public static void main(String[] args) {
		
		Q5_Method1_MostOptimal_Day8 ob = new Q5_Method1_MostOptimal_Day8();
		float [][] trainTime = new float[][] {{9.00f,9.10f},{9.40f,12.00f},{9.50f,11.20f},{11.00f,11.30f},{15.00f,19.00f},{18.00f,20.00f}};
		System.out.println(ob.minRailway(trainTime));
	}
}
