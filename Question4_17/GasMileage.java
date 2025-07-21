import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallons;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("\nEnter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        if (totalGallons != 0) {
            double totalMpg = totalMiles / totalGallons;
            System.out.printf("Total miles per gallon: %.2f%n", totalMpg);
        } else {
            System.out.println("No data was entered.");
        }

        input.close();
    }
}
