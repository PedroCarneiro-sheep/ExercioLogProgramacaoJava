import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to read the code of part 1, the number of parts 1, " +
                           "the unit value of each part 1, the code of part 2, the number " +
                           "of parts 2 and the unit value of each part 2. Calculate and " +
                           "display the amount to be paid. \n");

        System.out.println("Enter the part code 1: ");
        int p1 = sc.nextInt();
        System.out.println("Enter the quantity of parts: ");
        double q1 = sc.nextDouble();
        System.out.println("Enter the unit price of the part: ");
        double price1 = sc.nextDouble();
        double unit_price1 = price1 * q1;

        System.out.println("Enter the part code 2: ");
        int p2 = sc.nextInt();
        System.out.println("Enter the quantity of parts: ");
        double q2 = sc.nextDouble();
        System.out.println("Enter the unit price of the part: ");
        double price2 = sc.nextDouble();
        double unit_price2 = price2 * q2;

        double final_price = unit_price1  + unit_price2;

        System.out.printf("Total price of part number " + p1 + " is U$%.2f \n", unit_price1);
        System.out.printf("Total price of part number " + p2 + " is U$%.2f \n", unit_price2);
        System.out.printf("The final price is U$%.2f", final_price);

        sc.close();

    }
}