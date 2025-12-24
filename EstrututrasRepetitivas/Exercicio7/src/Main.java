import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("A program to read a positive integer N. The program should then display N lines on the screen, " +
                           "starting from 1 to N. For each line, show the line number, then the square and the cube of the value.\n");

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int cube = 0;
        int square = 0;
        for (int i = 1; i <= n; i++) {
            cube = i * i;
            square = i * i * i;
            System.out.printf("%d %d %d\n", i, cube, square);
        }

        sc.close();
    }
}