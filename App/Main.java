import java.util.Scanner;
import java.lang.Thread;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String password;
    static Schedule schedule = new Schedule();

    public static void main(String[] args) {
        System.out.println("----------[BIG BROTHER BUDDY APP]----------");
        signUp();
        prompt();
    }

    public static void signUp() {
        System.out.print("Initiating Sign In Process\nEnter Your Name: ");
        name = scan.nextLine();
        System.out.print("Enter your password: ");
        password = scan.nextLine();
    }

    public static void prompt() {
        int choice;
        while(true) {
            System.out.println("Greetings " + name + ", What would you like to do today?\n(1) - Schedule\n(2) - Quote\n(3) - Two Minutes Hate\n(4) - Quit");
            choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:
                    schedule.printSchedule();
                    String mod;
                    System.out.println("Would you like to modify your schedule? ");
                    mod = scan.nextLine();
                    char temp = mod.toLowerCase().charAt(0);
                    if(temp == 't' || temp == 'y' || temp == '0' || temp == 'v' || temp == 's') {
                        schedule.modifySchedule();
                        schedule.printSchedule();
                        prompt();
                    }
                    break;
                case 2:
                    System.out.println(Quote.bigBrotherQuote());
                    prompt();
                case 3:
                    try {
                        for(int i = 0; i < 10; i++) {
                            System.out.println("DOWN WITH GOLDSTEIN!");
                            Thread.sleep(500);
                        }
                    } catch (Exception e) {
                        System.out.println("DOWN WITH BIG BROTHER!");
                    }
                    break;
                default:
                    System.out.println("We hope to see you again!");
                    System.exit(0);
            }
        }
    }
}
