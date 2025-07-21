public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int height; // in inches
    private int weight; // in pounds

    public HealthProfile(String firstName, String lastName, String gender,
                         int month, int day, int year, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }

  
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }
    public void setYear(int year) { this.year = year; }
    public void setHeight(int height) { this.height = height; }
    public void setWeight(int weight) { this.weight = weight; }

   
    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public int getMaxHeartRate(int currentYear) {
        return 220 - getAge(currentYear);
    }

    public String getTargetHeartRate(int currentYear) {
        int max = getMaxHeartRate(currentYear);
        int low = (int)(max * 0.5);
        int high = (int)(max * 0.85);
        return low + " - " + high;
    }

    public double getBMI() {
        return (weight * 703.0) / (height * height);
    }
}
