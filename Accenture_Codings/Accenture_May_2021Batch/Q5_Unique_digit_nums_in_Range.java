import java.util.Arrays;

public class Q5_Unique_digit_nums_in_Range {
	
	public static void uniqueDigitNum(int n, int m) {
		for(int i=n; i<=m; i++) {
			int num = i;
			int arr[] = new int [10];
			Arrays.fill(arr, 0);
			
			while(num != 0) {
				if(arr[num%10] == 1) {
					break;
				}
				arr[num%10] = 1;
				num = num / 10;
			}
			if(num == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		uniqueDigitNum(101, 112);
	}
}
