
public class Main {
	
	public void fun(String str) {
		
		int count = 0;
		int n = str.length();
		int i = 0;
		int j = n-1;
		
		while(i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				count = count + 2;
			}
			   i++;
			   j--;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Main ob = new Main();
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		sc.close();
		ob.fun("alphxxdida");
	}
}
