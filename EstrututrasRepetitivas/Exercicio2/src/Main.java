import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of digits to be entered:");
        int n = sc.nextInt();

        int in = 0;
        int out = 0;
        int x = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the value:");
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out", out);

        sc.close();
    }
}