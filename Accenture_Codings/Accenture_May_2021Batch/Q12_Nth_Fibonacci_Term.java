
public class Q12_Nth_Fibonacci_Term {
	
	public static int nthFibonacci(int num) {
		int a = 0;
		int b = 1;
		int sum = 0;
		
		if(num == 1) {
			return 0;
		}
		if(num == 2) {
			return 1;
		}
		
		int count = 2;
		while(count <= num) {
			sum = a+b;
			a = b;
			b = sum;
			count++;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(nthFibonacci(9));
	}
}
