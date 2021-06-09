import java.util.*;
public class TCS_Digital_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = 1;
		for(int i=0; i<=3; i++) {
			number = number*n;
		}
		sc.close();
		
		String inputNum = String.valueOf(n);
		String number_S = String.valueOf(number);
		
		int number_S_len  = number_S.length();
		
		int nLen = (int) Math.log10(n)+1;
		
		String lastDigits = number_S.substring(number_S_len-nLen, number_S_len);
		
		if(inputNum.equals(lastDigits)) {
			System.out.println("true");
		}
		else {
		    System.out.println("false");
		}
	}
}
