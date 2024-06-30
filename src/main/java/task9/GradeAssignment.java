package task9;
	import java.util.Scanner;

	public class GradeAssignment {
	    public static void main(String[] args) {
	     
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the marks scored by the student: ");
	        int marks = scanner.nextInt();

	        char grade = assignGrade(marks);
	        System.out.println("Grade: " + grade);
	        scanner.close();
	    }

	    private static char assignGrade(int marks) {
	    	if  (marks==100) {
	    		return 'S';
	    	}
	        if (marks >= 90 && marks <= 99) {
	            return 'A';
	        } else if (marks >= 80 && marks <= 89) {
	            return 'B';
	        } else if (marks >= 70 && marks <=79) {
	            return 'C';
	        } else if (marks >= 60 && marks <=69) {
	            return 'D';
	        } else if (marks >= 50 && marks <=59) {
	            return 'E';
	        } else if (marks < 50 && marks >= 0) {
	            return 'F';
	        } else {
	            return 'I'; 
	        }
	    }
	}



