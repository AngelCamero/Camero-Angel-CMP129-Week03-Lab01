import java.util.Scanner;
public class EmployeeTest {
    String name;
    int idNumber;
    String department;
    String position;

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your ID number: ");
        int idNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the name of the department you work in: ");
        String department = scanner.nextLine();

        System.out.print("Please enter the name of your position: ");
        String position = scanner.nextLine();


        Employee employee = new Employee(name, idNumber, department, position);
        System.out.println();

        employee.displayInfo();
        scanner.close();
    }
}
