import java.util.Arrays;

public class Q5a_Method1_MostOptimal_Day8 {
	
	////////////// When arrival & departure array is given ///////////////
	
	public int minRailway(float[] arrival, float[] departure) {
		
		Arrays.sort(arrival);
		Arrays.sort(departure);
		
		int n = arrival.length;
		int needed_plat = 1;
		int i = 1;
		int j = 0;
		
		while (i<n && j<n) {
			if(arrival[i] >= departure[j]) {
				j++;
				i++;
				
			} else {
				needed_plat++;
				i++;
			}
		}
	    return needed_plat;
	}

	public static void main(String[] args) {
		
		Q5a_Method1_MostOptimal_Day8 ob = new Q5a_Method1_MostOptimal_Day8();
		float [] arrival = new float[] {9.00f, 9.40f, 9.50f, 11.00f, 15.00f, 18.00f};
		float [] departure = new float[] {9.10f, 12.00f, 11.20f, 11.30f, 19.00f, 20.00f};
		System.out.println(ob.minRailway(arrival, departure));
	}
}
