import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly investment amount: ");
        double monthlyInvestment = input.nextDouble();

        System.out.print("Enter annual interest rate (as %): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int months = years * 12;
        double futureValue = 0;

        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
        }

        System.out.printf("Future value: $%.2f%n", futureValue);

        input.close();
    }
}

