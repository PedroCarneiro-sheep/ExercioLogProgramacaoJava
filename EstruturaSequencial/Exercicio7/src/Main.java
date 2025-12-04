import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("A program that reads three double-precision floating-point values: A, B, and C.");

        System.out.println("Enter value A: ");
        double a = sc.nextDouble();
        System.out.println("Enter value B: ");
        double b = sc.nextDouble();
        System.out.println("Enter value C: ");
        double c = sc.nextDouble();

        System.out.println("a) The area of the right triangle that has A as its base and C as its height.");
        double areaTriangle = (a * c) / 2;
        System.out.printf("R: %.3f \n", areaTriangle);

        System.out.println("b) The area of a circle with radius C. (pi = 3.14159)");
        double pi = 3.14159;
        double areaCicle = pi * (c * c);
        System.out.printf("R: %.3f \n", areaCicle);

        System.out.println("c) The area of the trapezoid that has A and B as bases and C as height.");
        double areaTrapezoid = ((a + b) * c) / 2;
        System.out.printf("R: %.3f \n", areaTrapezoid);

        System.out.println("d) the area of the square that has side B.");
        double areaSquare = b * b;
        System.out.printf("R: %.3f \n", areaSquare);

        System.out.println("The area of the rectangle that has sides A and B.");
        double areaRectangle = a * b;
        System.out.printf("R: %.3f \n", areaRectangle);

        sc.close();

    }
}