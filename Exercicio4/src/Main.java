import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("This program reads four values (a, b, c, d), " +
                           "multiplies the values 'a' and 'b', multiplies " +
                           "the values 'c' and 'd', and subtracts the results " +
                           "by stating the difference between them.");

        System.out.println("Enter value A: ");
        int a = sc.nextInt();
        System.out.println("Enter value B: ");
        int b = sc.nextInt();
        System.out.println("Enter value C: ");
        int c = sc.nextInt();
        System.out.println("Enter value D: ");
        int d = sc.nextInt();

        int difference = (a * b - c * d);
        System.out.println("The difference between them is " + difference);

        sc.close();
        
    }
}