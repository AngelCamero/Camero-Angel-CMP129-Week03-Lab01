public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    private String getMonthName() {
        String [] months = {
            "January", "February", "March", "April", "May", "June", "July", 
            "August", "September", "October", "November", "December"
        };
        return months[this.month - 1];
        
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void DisplayDate(){
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }
    public void Format2(){
        System.out.println(getMonthName() + " " + getDay() + ", " + getYear());
    }
    public void lastFormat() {
        System.out.println(getDay() + " " + getMonthName() + " " + getYear());
    }

}
