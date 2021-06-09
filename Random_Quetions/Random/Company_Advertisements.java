
public class Company_Advertisements {
	
	public void advertisements(int num) {
		int sum = 0;
		
		while(num>0) {
			int n = num%10;
			
			if(n%2 == 0) {
				sum = sum + n;
			}
			num = num/10;
		}
		System.out.print(sum);
	}

	public static void main(String[] args) {
		Company_Advertisements ob = new Company_Advertisements();
		int n = 258345;
		ob.advertisements(n);
	}
}
