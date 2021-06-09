
public class Q3_Reminder_of_two_numbers {
	
	public static int divideTwoNums(int num, int divisor) {
		if(num == 0 && divisor == 0)
			System.out.println("Not define");
		
		return num - (divisor * (num/divisor));
		
//		int rem = num / divisor;
//		int sub = rem * divisor;
//		return num - sub;
	}

	public static void main(String[] args) {
		System.out.println(divideTwoNums(28, 3));
	}
}
