package task9;

	public class numberpattern {
	    public static void main(String[] args) {
	        int input = 4;
	        generatePattern(input);
	    }

	    private static void generatePattern(int n) {
	        int currentNumber = 1;

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(currentNumber++ + " ");
	            }
	            System.out.println();
	        }
	    }
	}



