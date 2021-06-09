
class Airtel_iCode {

	static int minCost(String str) {
	
		int n = str.length();
		char s[] = str.toCharArray();
		int count = 0;

		for (int i = 0; i < n / 2; i++) {

			int left = i;

			int right = n - left - 1;

			while (left < right) {
	
				if (s[left] == s[right]) {
					break;
				}
				else {
					right--;
				}
			}
			if (left == right) {
				return -1;
			}
			else {
				for (int j = right; j < n - left - 1; j++) {
					char t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String s = "abbacc";
		int ans1 = minCost(s);
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		int ans2 = minCost(s);
		if(ans1 > ans2)
		System.out.println(ans1);
		else
		System.out.println(ans2);
	}
}
