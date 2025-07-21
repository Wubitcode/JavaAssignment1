public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee employee1 = new Employee("Alice", "Johnson", 3000.00);
        Employee employee2 = new Employee("Bob", "Smith", 2500.00);

        // Display original yearly salaries
        System.out.println("Yearly salary of " + employee1.getFirstName() + ": $" + employee1.getYearlySalary());
        System.out.println("Yearly salary of " + employee2.getFirstName() + ": $" + employee2.getYearlySalary());

        // Give each employee a 10% raise
        employee1.giveRaise();
        employee2.giveRaise();

        // Display updated yearly salaries
        System.out.println("\nAfter 10% raise:");
        System.out.println("Yearly salary of " + employee1.getFirstName() + ": $" + employee1.getYearlySalary());
        System.out.println("Yearly salary of " + employee2.getFirstName() + ": $" + employee2.getYearlySalary());
    }
}
