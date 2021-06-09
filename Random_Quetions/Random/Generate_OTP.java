import java.util.Random;
public class Generate_OTP {
	
	public char[] OTP(int len) {
		
		
		String caps_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_Letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*/?<>";
		
		String range = caps_Letters + small_Letters + numbers + symbols;
		
		// using Random Class to generate OTP
		Random rnd = new Random();
		char[] OTP = new char [len];
		
		for(int i=0; i<len; i++) {
			OTP[i] = range.charAt(rnd.nextInt(range.length()));
		}
		return OTP;
	}

	public static void main(String[] args) {
		Generate_OTP ob = new Generate_OTP();
		int OTP_length = 12;
		for(int i=0; i<20; i++) {
			System.out.print("Your "+OTP_length+" digit One Time Password is: ");
			System.out.println(ob.OTP(OTP_length));
		}
	}
}
