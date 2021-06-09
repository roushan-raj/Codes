
public class Q1_Count_SetBits_Recursive {
	
	public int countAetBits(int n) {
		int count = 0;
		while(n>0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Q1_Count_SetBits_Recursive ob = new Q1_Count_SetBits_Recursive();
		int i = 6;
		System.out.println(ob.countAetBits(i));
	}
}
