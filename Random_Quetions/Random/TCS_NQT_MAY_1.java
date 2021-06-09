import java.util.Scanner;

public class TCS_NQT_MAY_1 {
	
    public static void count(String str, char ch) {
		
		if(str.length() < 2) {
			System.out.println(-1);
			return;
		}
	    
		if(str.length() >=2 && str.length() <= 50) {
			int count = 0;
			
			if(str.charAt(0) == str.charAt(str.length()-1)) {
				for(int i=0; i<str.length(); i++) {
					if(str.charAt(i) == ch) {
						count++;
					}
				}
				System.out.println(count);
			}
			else {
				System.out.println("0");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		sc.close();
		count(str, ch);
	}
}
