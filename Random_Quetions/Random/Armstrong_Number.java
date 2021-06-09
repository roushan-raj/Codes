import java.util.*;
public class Armstrong_Number {
	
	public void armStrong(int n1, int n2) {
		if(n1<0 || n2<0) {
			System.out.println("Invalid Input");
		}
		
		int result;
		for(int i=n1; i<=n2; i++) {
			result = 0;
			int p = i;
			int temp1 = i; int temp2 = i;
			
			int n = 0;
			while(temp1 > 0) {
				n++;
				temp1 = temp1 / 10;
			}
			
			while(temp2 != 0) {
				int digit = temp2 % 10;
				result = result + (int) Math.pow(digit, n);
				temp2 = temp2/10;
			}
			
			if(result == p) {
				System.out.print(p+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Armstrong_Number ob = new Armstrong_Number();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number n1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number n2: ");
		int n2 = sc.nextInt();
		sc.close();
		
		ob.armStrong(n1, n2);
	}
}
