import java.util.Locale;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate and write its respective factorial.\n");

        System.out.println("Enter the number of factors: ");
        int n = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println("Value final: " + fat);

        sc.close();
    }
}