import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("This program reads two values with one decimal place (x and y), " +
                "which should represent the coordinates of a point on a plane. It then " +
                "determines which quadrant the point belongs to, or whether it lies on one " +
                "of the Cartesian axes or at the origin (x = y = 0).");

        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y:");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origin");
        } else if (x == 0.0) {
            System.out.println("y-axis");
        } else if (y == 0.0) {
            System.out.println("x-axis");
        }  else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrant 1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrant 2");
        }  else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrant 3");
        } else {
            System.out.println("Quadrant 4");
        }
        
        sc.close();
    }
}