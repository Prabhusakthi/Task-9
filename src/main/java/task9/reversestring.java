package task9; 
	import java.util.Scanner;

	public class reversestring {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        String reversedString = reverseString(inputString);

	        System.out.println("Reversed String: " + reversedString);

	        scanner.close();
	    }
	    private static String reverseString(String str) {
	        StringBuilder reversedBuilder = new StringBuilder();

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedBuilder.append(str.charAt(i));
	        }
	        return reversedBuilder.toString();
	    }
	}

