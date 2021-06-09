
public class Q1_Minimum_Jumps_to_Reach_0 {
	
	public static int minJump(int num) {
		int count = 0;
		
		while(num > 0) {
			if(num % 2 == 0) {
				num = num / 2;
				count++;
			}
			else {
				num = num - 1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(minJump(10));
		
	}
}
