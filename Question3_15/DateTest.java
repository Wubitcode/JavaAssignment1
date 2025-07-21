public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(8, 21, 2025);
        System.out.println("The date is: " + date1.displayDate());

        Date date2 = new Date(15, 10, 2025); // Invalid month
        System.out.println("The date is: " + date2.displayDate());
    }
}

