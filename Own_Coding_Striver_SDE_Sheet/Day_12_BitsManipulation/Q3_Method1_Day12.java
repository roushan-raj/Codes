
public class Q3_Method1_Day12 {
	
	public int divide(int p, int q) {
		int count = 0;
		while(p>=q) {
			p = p-q;
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		Q3_Method1_Day12 ob = new Q3_Method1_Day12();
		System.out.println(ob.divide(15, 2));
	}
}
