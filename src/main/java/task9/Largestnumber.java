package task9;
	import java.util.Scanner;

	public class Largestnumber {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();
	        int largestNumber = findLargestNumber(num1, num2, num3);

	        System.out.println("The largest number is: " + largestNumber);
	        scanner.close();
	    }

	    private static int findLargestNumber(int a, int b, int c) {
	        int largest = a;

	        if (b > largest) {
	            largest = b;
	        }

	        if (c > largest) {
	            largest = c;
	        }

	        return largest;
	    }
	}


