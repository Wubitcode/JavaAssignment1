import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        int digit1 = number / 10000;
        int digit2 = (number / 1000) - (digit1 * 10);
        int digit3 = (number / 100) - (digit1 * 100 + digit2 * 10);
        int digit4 = (number / 10) - (digit1 * 1000 + digit2 * 100 + digit3 * 10);
        int digit5 = number - (digit1 * 10000 + digit2 * 1000 + digit3 * 100 + digit4 * 10);

       System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5);
    }
}
