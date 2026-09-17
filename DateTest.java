public class DateTest {
    
}
import java.util.Scanner;
public class DateTest {
    Date d1 = new Date();
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int day;
        int year;
        System.out.print("Please enter the month: ");
        int m = scanner.nextInt();
        if (m > 12 || m < 1) {
            System.out.print("Invalid month.");
        }
        else {
            System.out.print("Please enter The day: ");
            day = scanner.nextInt();
            }
            int d = day;
        if (d > 31 || d < 1){
            System.out.print("Invalid day.");
        }
        else {
            System.out.print("Please enter the year: ");
            year = scanner.nextInt();
        }
        System.out.print(d1.DisplayDate());
        }
    }
}
