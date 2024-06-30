package task9;
	public class StarPattern {
	    public static void main(String[] args) {
	        int input = 5;
	        generatePattern(input);
	    }

	    private static void generatePattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (i == j || j == n - i + 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


