package task9;
	import java.util.Scanner;
	
		public class HotelTariff {
		    public static void main(String[] args) {
		        // Create a Scanner object to read input
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of months: ");
		        int months = scanner.nextInt();

		        System.out.print("Enter the room rent per day: ");
		        double roomRent = scanner.nextDouble();

		        System.out.print("Enter the number of days stayed: ");
		        int daysStayed = scanner.nextInt();
		        double totalTariff = calculateTariff(months, roomRent, daysStayed);
		        System.out.printf("The total hotel tariff is: $%.2f%n", totalTariff);
		        scanner.close();
		    }

		    
		    private static double calculateTariff(int months, double roomRent, int daysStayed) {
		        boolean isPeakSeason = (months >= 4 && months <= 6) || (months >= 11 && months <= 12);
		       
		        if (isPeakSeason) {
		            roomRent *= 1.20;
		        }

		        return roomRent * daysStayed;
		    }
		}
