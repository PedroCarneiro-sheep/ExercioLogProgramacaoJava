import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits to be entered:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter value 1:");
            double v1 = sc.nextDouble();
            System.out.println("Enter value 2:");
            double v2 = sc.nextDouble();
            System.out.println("Enter value 3:");
            double v3 = sc.nextDouble();
            double average = ((v1 * 2.0) + (v2 * 3.0) + (v3 * 5.0)) / 10.0;

            System.out.printf("Average is %.1f\n", average);
        }

        sc.close();
    }
}