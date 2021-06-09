package apnikaksha;
import java.util.Scanner;
public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		Scanner kb=new Scanner(System.in);
		int dayOfWeek;
		System.out.println("Enter the number of day");
		dayOfWeek = kb.nextInt();
		
		switch(dayOfWeek)
		{
		case 1:
			System.out.println("It is my Holiday");
			break;
			
		case 2:
			System.out.println("it my working day");
			break;
			
		case 3:
			System.out.println("My football playing day");
			break;
			
		case 4:
			System.out.println("My zym day");
			break;
			
		default:
			System.out.println("I don't know this date");
		  
		}	
	}

}
