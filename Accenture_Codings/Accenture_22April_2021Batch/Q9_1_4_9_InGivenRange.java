
public class Q9_1_4_9_InGivenRange {
	
	public static int findNumbers(int n, int m) {
		if(m < n) {
			return -1;
		}
		
		int count = 0, temp, last_digit;
		
		for(int i=n; i<=m; i++) {
			temp = i;
			boolean flag = false;
			
			while(temp > 0) {
				last_digit = temp % 10;
				if(last_digit == 0 || last_digit == 2 || last_digit == 3 || last_digit == 5 
						|| last_digit == 6 || last_digit == 7 || last_digit == 8) {
					flag = true;
					break;
				}
				temp = temp / 10;
			}
			if(flag == false) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(findNumbers(100, 200));
	}
}
