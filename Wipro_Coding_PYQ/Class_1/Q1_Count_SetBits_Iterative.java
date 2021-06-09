
public class Q1_Count_SetBits_Iterative {
	
	public int countSetBits(int n) {
		if(n == 0)
			return 0;
		else {
			return (n&1) + countSetBits(n>>1);
		}
	}

	public static void main(String[] args) {
		Q1_Count_SetBits_Iterative ob = new Q1_Count_SetBits_Iterative();
		int i = 9;
		System.out.println(ob.countSetBits(i));
	}
}
