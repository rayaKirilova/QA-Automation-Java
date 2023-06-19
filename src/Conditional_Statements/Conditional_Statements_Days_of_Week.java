import java.util.Scanner;

public class Conditional_Statements_Days_of_Week {
    public static void main(String[] args) {

        // user message
        System.out.print("Please, type a number from 1 to 7 :  ");

        // scanner for user input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // closing scanner for user input
        input.close();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number.");
        }
    }
}
