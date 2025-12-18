import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits to be entered:");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Enter value 1:");
            int x = sc.nextInt();
            System.out.println("Enter value 2:");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Impossible division");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}