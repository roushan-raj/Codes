import java.util.Scanner;

public class Q2_Type2_Day2 {
	
	
	public float pascalTriangle(int r, int c) {
		int R = r-1;
		int C = c-1;
		float res = 1;
		for(int i=1; i<=C; i++ ) {
			res = res * (R-C+i) / (i);
		}
		return res;
	}

	public static void main(String[] args) {
		
		Q2_Type2_Day2 ob = new Q2_Type2_Day2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row : ");
		int Row = sc.nextInt();
		System.out.print("Enter the Column : ");
		int Col = sc.nextInt();
		sc.close();
		
		System.out.print(ob.pascalTriangle(Row, Col));
		

	}

}
