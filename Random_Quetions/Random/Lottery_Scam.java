
public class Lottery_Scam {
	
public static int lotteryScam(String [] arr) {
		
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			String curr = arr[i];
			
			if(curr.length() < 10) {
				continue;
			}
			
			if(curr.length() >= 10 && curr.length() <= 12) {
	
				char first = curr.charAt(0);
				char second = curr.charAt(1);
				char third = curr.charAt(2);
				
				if(first < 65 || first > 90 || second < 65 || second > 90 || third < 65 || third > 90) {
					continue;
				}
				
				if((first == second) || (second == third) || (third == first)) {
					continue;
				}
				
				if(curr.charAt(3) >= 65 && curr.charAt(3) <= 90 || curr.charAt(4) >= 65 && curr.charAt(4) <= 90) {
					continue;
				}
				
				if(curr.charAt(curr.length() - 1) < 65 || curr.charAt(curr.length() - 1) > 90) {
					continue;
				}			
				
				String str_year = curr.substring(3, 7);
				int num_year = Integer.valueOf(str_year);
				
				if(num_year < 1900 || num_year > 2019) {
					continue;
				}
				
				String value = curr.substring(7, curr.length() - 1);
				int num_value = Integer.valueOf(value);
				
				if(num_value == 10 || num_value == 20 || num_value == 50 || num_value == 100 || num_value == 200 || 
						                  num_value == 500 || num_value == 1000) {
					ans = ans + num_value;
				}
				else {
					continue;
				}
		    }
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String [] lottery = {"A201550B", "ABB19991000Z", "XYZ200019Z", "ERF200220", "SCD203010F"};
		//String [] lottery = {"ABC2000500Z", "BCD200110B", "BE2002200C", "ACA2003500H"};
		System.out.println(lotteryScam(lottery));
	}
}
