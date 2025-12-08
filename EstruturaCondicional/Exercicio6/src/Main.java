import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Program that reads any value and says if it is within the following intervals ([0,25], (25,50], (50,75], (75,100]).");

        System.out.println("Enter the number: ");
        double num = sc.nextDouble();

        if (num < 0.0 || num > 100.0) {
            System.out.println("Out of Range");
        } else if (num <= 25.0) {
            System.out.println("The number is between the range 0 and 25.");
        } else if (num <= 50.0) {
            System.out.println("The number is between the range 25 and 50.");
        } else if (num <= 75.0) {
            System.out.println("The number is between the range 50 and 75.");
        }  else {
            System.out.println("The number is between the range 75 and 100.");
        }

        sc.close();
    }
}
