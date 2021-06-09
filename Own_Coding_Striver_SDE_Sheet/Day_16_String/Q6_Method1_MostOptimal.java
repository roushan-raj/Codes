
public class Q6_Method1_MostOptimal {
	
	public int compareVersions(String ver1, String ver2) {
		String [] s1 = ver1.split("\\.");
		String [] s2 = ver2.split("\\.");
		
		int maxLength = Math.max(s1.length, s2.length);
		
		for(int i=0; i<maxLength; i++) {
			int v1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
			int v2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;
			
			if(v1 > v2) {
				return 1;
			}
			else if (v1 < v2) {
				return -1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Q6_Method1_MostOptimal ob = new Q6_Method1_MostOptimal();
		String version1 = "7.00001";
		String version2 = "7.01";
		System.out.println(ob.compareVersions(version1, version2));
	}
}
