import java.util.*;
public class TechMahindra_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		for(int i=0; i<n-1; i++) {
			sum = sum + Math.abs(arr[i+1] - arr[i]); 
		}
		System.out.println(sum);
	}
}
