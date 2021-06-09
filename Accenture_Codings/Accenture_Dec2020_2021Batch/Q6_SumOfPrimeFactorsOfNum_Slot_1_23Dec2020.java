
public class Q6_SumOfPrimeFactorsOfNum_Slot_1_23Dec2020 {
	
	public static int sumOfPrimeFactorsOfNum(int num) {
		int i = 2;
		
		int sum = 0;
		
		int currentFactor = -1;
		
		while(num > 1) {
			if(num % i == 0) {
				if(i != currentFactor) {
					sum = sum + i;
					currentFactor = i;
					System.out.print(i+" "+"\n");
				}
				num = num/i;
			}
			else {
				i++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfPrimeFactorsOfNum(315));
	}
}
