
public class Q5_Method2_MostOptimal_Day11 {
	
	// Output is wrong but intuition is correct -> TC - O(log(min(n,m)))

	public int findMedian(int[] a , int[] b) {
		int n1=a.length ,n2=b.length;
		int lo=0 , hi=n1;
		while(lo <= hi) {
			int cut1 = lo + (hi-lo)/2;
			int cut2 = (n1+n2)/2 - cut1;
			
			int l1 = cut1==0? Integer.MIN_VALUE : a[cut1-1];
			int l2 = cut2==0? Integer.MIN_VALUE : b[cut2-1];
			int r1 = cut1==n1? Integer.MAX_VALUE : a[cut1];
			int r2 = cut2==n2? Integer.MAX_VALUE : b[cut2];
			
			if(l1>r2) {
				hi = cut1-1;
			}
			else if(l2 > r1) {
				lo = cut1+1;
			}
			else {
				return (n1+n2)%2==0? ( Math.max(l1, l2) + Math.min(r1,r2) ) : Math.min(r1,r2);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Q5_Method2_MostOptimal_Day11 ob = new Q5_Method2_MostOptimal_Day11();
		int[] b = new int[] {1,5,8,10,18,20};
		int [] a = new int[] {2,3,6};
		
		System.out.println(ob.findMedian(a,b));
	}
}