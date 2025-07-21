import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        double rate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double amount = principal;

        for (int i = 1; i <= years; i++) {
            double interest = amount * (rate / 100);
            amount += interest;
            System.out.printf("Year %d: Interest = $%.2f, Total Amount = $%.2f%n", i, interest, amount);
        }

        input.close();
    }
}

