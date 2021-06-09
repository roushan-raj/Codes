//import java.util.*;
public class test {
	
//	public static boolean check(String str) {
//		if(str.getClass().getSimpleName() == "String")
//			return true;
//		return false;
		
//		if(str.getType().equals("String"))
//			return true;
//		return false;
		
//		if(str.getType() == String)
//			return true;
//		return false;
		
//		if(str instanceof String) 
//			return true;
//		return false;
			
//	}
	
//	public void tryCatchFinally() {
//		try {
//			int arr [] = new int[] {1,2,3};
//			System.out.println(arr[4]);
//		}
//		catch(Exception e){
//			System.out.println("Element is not present");
//		}
//		finally {
//			System.out.println("i will always run");
//		}
//	}
	
//	public static void badMethod() {
//		throw new Error();
//	}
	float area1 = 0;
	float area2 = 0;
	public float areaTriangle(float b1, float h1, float b2, float h2) {
		area1 = (b1*h1)/2;
		area2 = (b2*h2)/2;
		float maxArea = Math.max(area1, area2);
		return maxArea;
	}

	public static void main(String[] args) {
		test ob = new test();
		System.out.println(ob.areaTriangle(34,45,23,30));
//		String str = "nifty";
//		System.out.println(check(str));
		
//		List<Boolean> list = new ArrayList<>();
//		list.add(true);
//		list.add(Boolean.parseBoolean("False"));
//		list.add(Boolean.TRUE);
//		System.out.print(list.size());
//		System.out.print(list.get(1) instanceof Boolean);
		
		//ob.tryCatchFinally();
		
//		try {
//			System.out.println("A");
//			badMethod();
//			System.out.println("B");
//		} 
//		catch(Exception ex){
//			System.out.println("C");
//		}
//		finally {
//			System.out.println("D");
//		}
	}
}
