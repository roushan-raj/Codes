
public class Q4_Jethalal_and_Chocolate {
	
	public static int noOfShops(int i, int l) {
		return (int) (Math.pow(2, l) - i);
	}

	public static void main(String[] args) {
		System.out.println(noOfShops(2, 3));
		System.out.println(noOfShops(1, 2));
		System.out.println(noOfShops(0, 0));
		System.out.println(noOfShops(1, 0));
	}
}
