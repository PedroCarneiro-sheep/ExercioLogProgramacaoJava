import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Here you will enter two values, and after that we will show you the sum of the values. \n");

        System.out.println("Enter value 1:");
        double value1 = sc.nextDouble();
        System.out.println("Enter value 2:");
        double value2 = sc.nextDouble();

        double soma = value1 + value2;

        System.out.printf("The sum of the values follows: %.2f", soma);

    }
}