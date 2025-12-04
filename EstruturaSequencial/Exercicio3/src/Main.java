import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("A program that reads the radius values of a circle and display the area.\n");

        double PI = 3.14159;

        System.out.println("Radius value :");
        double radius = sc.nextDouble();


        double area = PI * (radius * radius);
        System.out.printf("Area value is: %.4f", area);

        sc.close();
    }
}