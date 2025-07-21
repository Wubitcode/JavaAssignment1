import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.printf("The largest number is: %d%n", largest);
    }
}
