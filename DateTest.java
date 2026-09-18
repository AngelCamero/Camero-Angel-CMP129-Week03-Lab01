import java.util.Scanner;
public class DateTest {
    int day;
    int month;
    int year;
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the month: ");
        int m = scanner.nextInt();
        while (m > 12 || m < 1) {
            System.out.print("Invalid month. Please enter a valid month: ");
            m = scanner.nextInt();
        }
            System.out.print("Please enter The day: ");
            int d = scanner.nextInt();
        while (d < 1 || d > 31) {
            System.out.print("invalid day. please enter a valid day: ");
            d = scanner.nextInt();
        }
        System.out.print("Please enter the year: ");
        int y = scanner.nextInt();

        Date Daate = new Date(m, d, y);
        System.out.println();
        Daate.DisplayDate();
        Daate.Format2();
        Daate.lastFormat();
        scanner.close();
    }
}