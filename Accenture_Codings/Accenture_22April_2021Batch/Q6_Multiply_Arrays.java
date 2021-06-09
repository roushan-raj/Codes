
public class Q6_Multiply_Arrays {
	
	public static void arrayMultiplication(int [] arr1, int [] arr2) {
		if(arr1.length == 0 || arr2.length == 0) {
			return;
		}
		
		int mul = 0;
		for(int i=0; i<arr1.length; i++) {
			mul = mul + (arr1[i] * arr2[arr1.length - 1 -i]);
		}
		System.out.println(mul);
	}

	public static void main(String[] args) {
		int [] arr1 = {22,7,1,-5,5,-2};
		int [] arr2 = {4,-1,21,12,10,-3};
		arrayMultiplication(arr1, arr2);
	}
}
