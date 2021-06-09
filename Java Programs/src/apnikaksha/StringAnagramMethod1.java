package apnikaksha;

import java.util.Scanner;

public class StringAnagramMethod1 {

	public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the 1st String");
    String a = sc.nextLine();
    
    System.out.println("Enter the 2nd String");
    String b = sc.nextLine();
  
    boolean isAnagram = false;
    boolean visited[] = new boolean[b.length()];
    
    if(a.length() == b.length()) {
     
     for(int i = 0;i<a.length();i++) {
    	char c = a.charAt(i);
    	isAnagram = false;
    	for(int j = 0;j<b.length();j++) {
    		if(b.charAt(j) == c) {
    			isAnagram = true;
    			break;
    		}
    	}
    	if(!isAnagram) {
    		break;
    	}
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
