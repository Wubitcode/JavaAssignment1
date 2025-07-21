import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeNumber = 1;

        while (employeeNumber <= 3) {
            System.out.print("Enter hours worked for employee " + employeeNumber + ": ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate for employee " + employeeNumber + ": ");
            double rate = input.nextDouble();

            double pay;

            if (hours <= 40) {
                pay = hours * rate;
            } else {
                double overtime = hours - 40;
                pay = 40 * rate + overtime * rate * 1.5;
            }

            System.out.printf("Gross pay for employee %d is: $%.2f%n%n", employeeNumber, pay);
            employeeNumber++;
        }

        input.close();
    }
}


