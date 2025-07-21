public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1; 
        }
        this.day = day;
        this.year = year;
    }
    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
}
