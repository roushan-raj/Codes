package apnikaksha;

import java.util.Scanner;

public class StringAnagramMethod2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the 1st String");
	    String a = sc.nextLine();
	    
	    System.out.println("Enter the 2nd String");
	    String b = sc.nextLine();
	    
	    boolean isAnagram = true;
	    
	    int al[] = new int [256];
	    int bl[] = new int [256];
	    
	    for (char c: a.toCharArray()) {
	    	int index = (int) c;
	    	al[index]++	;    
	    }
	    
	    for (char c: b.toCharArray()) {
	    	int index = (int) c;
	    	bl[index]++;
	    }
	    
	    for(int i = 0; i<256; i++) {
	    	if(al[i] != bl[i]) {
	    	isAnagram = false;
	    	break;
	      }

	    }
	
	    if(isAnagram) {
	    	System.out.println("Anagram");
	    }
	    else {
	    	System.out.println("Not Anagram");
	    }
	    
	}
}
