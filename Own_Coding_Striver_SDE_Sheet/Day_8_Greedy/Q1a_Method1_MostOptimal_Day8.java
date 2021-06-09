import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/////////////////// Minimum no.0f meetings room required ////////////////

public class Q1a_Method1_MostOptimal_Day8 {
	
	public int meetingRoom(float[][] intervals) {
		if(intervals == null || intervals.length == 0)
			return 0;
		
		int meetingRoomCount = 0;
		Arrays.sort(intervals, Comparator.comparing((float[] itv) -> itv[0]));
		// Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		
		
		PriorityQueue<Float> heap = new PriorityQueue<Float>();
		
		for(float[] itv : intervals) {
			if(heap.isEmpty()) {
				meetingRoomCount++;
				heap.offer(itv[1]);
				
			} else {
				
				if(itv[0] >= heap.peek()) {
					heap.poll();
					
				} else {
					meetingRoomCount++;
				}
				
				heap.offer(itv[1]);
			}	
		}
		return meetingRoomCount;
	}

	public static void main(String[] args) {
		
		Q1a_Method1_MostOptimal_Day8 ob = new Q1a_Method1_MostOptimal_Day8();
		//float[][] intervals = new float[][] {{5,10}, {21,25}, {15,20}, {11,15}, {22,30}, {30,35}};
		float [][] intervals = new float[][] {{9.00f,9.10f},{9.40f,12.00f},{9.50f,11.20f},{11.00f,11.30f},{15.00f,19.00f},{18.00f,20.00f}};
		System.out.println(ob.meetingRoom(intervals));
	}
}
