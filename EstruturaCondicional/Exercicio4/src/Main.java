import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("A program that reads the start and end times of a game " +
                "and calculates the game's duration, knowing that it can start on " +
                "one day and end on another, with a minimum duration of 1 hour and a maximum of 24 hours.");

        System.out.println("Enter your start time: ");
        int startTime = sc.nextInt();
        System.out.println("Enter your end time: ");
        int endTime = sc.nextInt();



        if (startTime < endTime) {
            int duration = endTime - startTime;
            System.out.printf("The game lasted %d hours", duration);
        } else {
             int duration = 24 - startTime + endTime;
            System.out.printf("The game lasted %d hours", duration);
        }
    }
}

