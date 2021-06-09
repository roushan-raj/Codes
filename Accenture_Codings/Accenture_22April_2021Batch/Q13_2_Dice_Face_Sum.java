
public class Q13_2_Dice_Face_Sum {
	
	public static int diceSum(int num) {
		int count = 0;
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j == num) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(diceSum(8));
	}
}
