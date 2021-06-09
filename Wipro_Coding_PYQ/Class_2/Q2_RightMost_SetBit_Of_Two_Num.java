
public class Q2_RightMost_SetBit_Of_Two_Num {
	
	public static int getRightMostSetBit(int n) {
		if(n == 0)
			return 0;
		return (int) ((Math.log10(n & -n)) / Math.log10(2) + 1);
	}
	public static int posOdRightMostSetBitAfterXOR(int n, int m) {
		return getRightMostSetBit(n^m);
	}

	public static void main(String[] args) {
		System.out.println(posOdRightMostSetBitAfterXOR(11, 9));
		System.out.println(posOdRightMostSetBitAfterXOR(52, 4));
	}
}
