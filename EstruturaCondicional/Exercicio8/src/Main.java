import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Income tax calculation.\n");
        System.out.println("|Income                   |Income tax");
        System.out.println("------------------------------------");
        System.out.println("|U$0.00 to U$2000.0.      |Free");
        System.out.println("|U$2000.01 to U$3000.00   |8%");
        System.out.println("|U$3000.01 to U$4500.00   |18%");
        System.out.println("|above U$4500.01          |28%");

        System.out.println("What is your salary?");
        double salary = sc.nextDouble();
        double tax = 0.0;

        if (salary <= 2000.00) {
            System.out.println("Free");
        } else if (salary <= 3000.00) {
            tax = (salary - 2000.0) * 0.08;
            System.out.printf("With an 8%% rate, the value will be U$%.2f", tax);
        } else if (salary <= 4500.00) {
            tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("With an 18%% rate, the value will be U$%.2f", tax);
        } else {
            tax = (salary - 4500.0) * 0.28 + 1500 * 0.18 + 1000.0 * 0.08;
            System.out.printf("With an 28%% rate, the value will be U$%.2f", tax);
        }

        sc.close();
    }
}