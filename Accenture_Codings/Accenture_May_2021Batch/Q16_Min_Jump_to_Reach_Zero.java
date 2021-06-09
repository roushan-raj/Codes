
public class Q16_Min_Jump_to_Reach_Zero {
	
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
