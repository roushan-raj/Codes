
public class Q1_Position_of_First_SetBit {
	
	public int position(int n) {
		return  (int)  ((Math.log10(n & -n)) / Math.log10(2)) + 1;
	}

	public static void main(String[] args) {
		Q1_Position_of_First_SetBit ob = new Q1_Position_of_First_SetBit();
		System.out.println(ob.position(18));
	}
}
