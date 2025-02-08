import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
    public static ArrayList<String> event = new ArrayList<>();
    public static ArrayList<String> time = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    private static int hour, minute;

    public Schedule() {
        event.add("2 Minute Hate");
        time.add("11:00");
    }

    public static void printSchedule() {
        System.out.println("\nCurrent Schedule: ");

        for(int i = 0; i < event.size(); i++) {
            System.out.println("Time: " + time.get(i) + "\t\tEvent: " + event.get(i));
        }
    }

    public static void modifySchedule() {
        boolean valid = false;

        while(!valid) {
            System.out.print("\nEnter Hour: ");
            try {
                hour = Integer.parseInt(scan.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Time!");
            }
        }
        valid = false;
        while(!valid) {
            System.out.print("Enter Minute: ");
            try {
                minute = Integer.parseInt(scan.nextLine());
                valid = true;
                if(minute > 60) {
                    hour += (minute/60);
                    minute %= 60;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Time!");
            }
        }
        time.add(hour + ":" + minute);
        System.out.print("Enter Event: ");
        event.add(scan.nextLine());
    }
}
