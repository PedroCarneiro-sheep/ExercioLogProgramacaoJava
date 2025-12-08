import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double price1 = 4.0;
        double price2 = 4.5;
        double price3 = 5.0;
        double price4 = 2.0;
        double price5 = 1.5;

        System.out.printf("|CODE------SPECIFICATION-------PRICE|\n");
        System.out.printf("------------------------------------|\n");
        System.out.printf("|1---------Cachorro Quente----U$%.2f|\n", price1);
        System.out.printf("|2---------X-Salada-----------U$%.2f|\n", price2);
        System.out.printf("|3---------X-Bacon------------U$%.2f|\n", price3);
        System.out.printf("|4---------Torrada simples----U$%.2f|\n", price4);
        System.out.printf("|5---------Refrigerante-------U$%.2f|\n", price5);

        System.out.println("Enter the code you want:");
        int code = sc.nextInt();
        System.out.println("Now the quantity:");
        int quantity = sc.nextInt();
        double total = 0;

        if (code == 1) {
            total = quantity * price1;
        } else if (code == 2) {
            total = quantity * price2;
        }  else if (code == 3) {
            total = quantity * price3;
        } else if (code == 4) {
            total = quantity * price4;
        } else if (code == 5) {
            total = quantity * price5;
        }

        System.out.printf("the total value is U$%.2f", total);
    }
}