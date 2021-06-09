package apnikaksha;
import java.util.Scanner;


public class ScannerUserInput {

	public static void main(String[] args) {
		//int p; float r; float t; double amount;
		Scanner kb=new Scanner(System.in);
		
		/*System.out.println("Enter the value of x");
		int x=kb.nextInt();
		System.out.println(x);
		
		
		System.out.println("Enter the value of y");
		double y=kb.nextDouble();
		System.out.println(y);
		
	    System.out.print("Enter the value of String");
	    String str=kb.nextLine();
	    System.out.println(str);*/
		
		System.out.println("Enter principle amount");
		int p=kb.nextInt();
		
		System.out.println("Enter rate of interest");
		float r=kb.nextFloat();
		
		System.out.println("Enter time duration");
		float t=kb.nextFloat();
		
		double amount=((p*r*t)/100);
		System.out.println("Total calculated amount :" +amount);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
		
		

	}

}
