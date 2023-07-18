import java.util.Scanner;

public class Conditional_Statements_Ex4_Days_of_Week {
    public static void main(String[] args) {

        // user message
        System.out.print("Please, type a short name for day of the week: ");

        // scanner for user input
        Scanner input = new Scanner(System.in);
        String day = input.next();

        // closing scanner for user input
        input.close();

        switch (day) {
            case "Mon":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            case "Wed":
                System.out.println("Wednesday");
                break;
            case "Thu":
                System.out.println("Thursday");
                break;
            case "Fri":
                System.out.println("Friday");
                break;
            case "Sat":
                System.out.println("Saturday");
                break;
            case "Sun":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}

