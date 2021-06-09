
public class Q3_Remainder_of_Two_Num_With_Loop {
	
	public static int divide(int num, int divisor) {
		if(num == 0 && divisor == 0) {
			return -1;
		}
		int i = 1;
		int p = divisor;
		while(p<=num) {
			p = divisor*i;
			i++;
		}
		p = p - divisor;
		return num - p;
	}

	public static void main(String[] args) {
		System.out.println(divide(12,8));
	}
}
