public class Date {
    private int day;
    private int month;
    private int year;

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

    public String DisplayDate(){
        return "date entered: " + this.month + "/" + this.day + "/" + this.year;
    }
}
