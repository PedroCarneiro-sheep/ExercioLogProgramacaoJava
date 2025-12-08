import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("A program that reads two integer values " +
                "(A and B) and says 'They are multiples' or 'They are " +
                "not multiples', indicating whether the values read are multiples of each other.");

        System.out.println("Enter the value of A:");
        int a = sc.nextInt();
        System.out.println("Enter the value of B:");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("They are multiples!");
        } else  {
            System.out.println("They are not multiples!");
        }
    }
}