
public class Count_Set_Bits {
	
	// Brian's Kernighan’s Algorithm
	
	public int countSetBits(int n) {
		
		int count = 0;
		while(n>0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Count_Set_Bits ob = new Count_Set_Bits();
		int n = 15;
		System.out.println("No.of Set bits in "+n+" is: "
		                          +ob.countSetBits(n));
	}
}
