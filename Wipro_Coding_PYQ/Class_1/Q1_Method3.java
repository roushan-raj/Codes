
////////////////// Brian's Kernighan’s Algorithm ///////////////////

public class Q1_Method3 {
	
	int count = 0;
	public int countSetBits(int x) {
		while(x>0) {
			x = x & (x-1);
			count ++;
		}
		return count;
	}

	public static void main(String[] args) {
		Q1_Method3 ob = new Q1_Method3();
		System.out.println(ob.countSetBits(10));
	}
}
