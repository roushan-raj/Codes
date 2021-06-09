
public class Q5_Method2_MostOptimal_Day12 {
	
	public int msb(int n) {
		int k = (int) (Math.log(n) / Math.log(2));
		return 1<<k;
	}

	public static void main(String[] args) {
		Q5_Method2_MostOptimal_Day12 ob = new Q5_Method2_MostOptimal_Day12();
		System.out.println(ob.msb(16));
	}
}
