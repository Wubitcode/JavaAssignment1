
public class DateTest {
    public static void main(String[] args) {
        // Create Date object with example date
        Date date = new Date(7, 21, 2025);

        // Display the date
        System.out.print("The date is: ");
        date.displayDate();

        // Change the date
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2025);

        // Display the updated date
        System.out.print("The updated date is: ");
        date.displayDate();
    }
}


