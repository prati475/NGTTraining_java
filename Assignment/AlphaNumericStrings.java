package assignment;

import java.util.Scanner;

public class AlphaNumericStrings {

	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        String inputString;

	        
	        System.out.println("Enter a string :");
	        inputString = sc.nextLine();

	        
	        System.out.println("Following integers are found in the string : ");

	        
	        for (char ch : inputString.toCharArray()) {
	            
	            if (Character.isDigit(ch)) {
	                System.out.print(ch + " ");
	            }
	        }

	    }

	}

