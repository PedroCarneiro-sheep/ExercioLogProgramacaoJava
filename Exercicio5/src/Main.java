import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("A program that reads the employee's number, hours worked, hourly rate, and calculates the salary.\n");

        System.out.println("Enter the employee number: ");
        int number = sc.nextInt();
        System.out.println("Enter the hours worked: ");
        double hours = sc.nextDouble();
        System.out.println("Enter the hourly rate: ");
        double rate = sc.nextDouble();

        double salary = hours * rate;

        System.out.println("Number the employee is: " + number);
        System.out.printf("Salary the employee is: %.2f", salary);

        sc.close();

    }
}