import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter gender: ");
        String gender = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        System.out.print("Enter height in inches: ");
        int height = input.nextInt();

        System.out.print("Enter weight in pounds: ");
        int weight = input.nextInt();

        HealthProfile profile = new HealthProfile(firstName, lastName, gender,
                                                  month, day, year, height, weight);

        int currentYear = 2025;  

      
        System.out.println("\n--- Health Profile ---");
        System.out.println("Name: " + profile.getFirstName() + " " + profile.getLastName());
        System.out.println("Gender: " + profile.getGender());
        System.out.println("Date of Birth: " + profile.getMonth() + "/" + profile.getDay() + "/" + profile.getYear());
        System.out.println("Height (inches): " + profile.getHeight());
        System.out.println("Weight (pounds): " + profile.getWeight());
        System.out.println("Age: " + profile.getAge(currentYear));
        System.out.printf("BMI: %.2f\n", profile.getBMI());
        System.out.println("Maximum Heart Rate: " + profile.getMaxHeartRate(currentYear));
        System.out.println("Target Heart Rate Range: " + profile.getTargetHeartRate(currentYear));

        input.close();
    }
}
