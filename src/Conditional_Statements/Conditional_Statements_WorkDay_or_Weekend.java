import java.util.Locale;
import java.util.Scanner;

public class Conditional_Statements_WorkDay_or_Weekend {
    public static void main(String[] args) {

        // user message
        System.out.print("Please, type day of the week: ") ;

        // input scanner
        Scanner input = new Scanner(System.in) ;
        String day = input.next() ;

        // closing scanner for user input
        input.close();

        switch (day.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(String.format("%s is working day.", day.toUpperCase()));
                break ;
            case "saturday":
            case "sunday":
                System.out.println(String.format("%s - it's time for the weekend.", day.toUpperCase()));
                break ;
            default:
                System.out.println("Invalid day of week.");
        }

    }
}
