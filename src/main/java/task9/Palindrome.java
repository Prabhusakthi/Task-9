package task9;
import java.util.Scanner;

	public class Palindrome  {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        boolean isPalindrome = checkPalindrome(inputString);

	        
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }

	    private static boolean checkPalindrome(String str) {
	        str = str.toLowerCase();

	        str = str.replaceAll("\\s", "");

	        int length = str.length();
	        int forwardIndex = 0;
	        int backwardIndex = length - 1;
        for (; forwardIndex < backwardIndex; forwardIndex++, backwardIndex--) {
	        
	           if (str.charAt(forwardIndex) != str.charAt(backwardIndex)) {
	                return false; // Not a palindrome
	            }
	        }
	        return true;
	    }
	}



