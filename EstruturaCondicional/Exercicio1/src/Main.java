import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("A program that reads an integer and then determines whether that number is negative or not.");

        System.out.println("Enter a positive or negative number:");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("It is a positive number.");
        } else if (num < 0) {
            System.out.println("It is a negative number.");
        } else  {
            System.out.println("It is a non-negative number.");
        }

    }
}