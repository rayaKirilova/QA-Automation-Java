import java.util.Scanner;

public class Conditional_Statements_Ex1_Positive_or_Negative {
    public static void main(String[] args) {

        // message
        System.out.print("Please, type a number: ") ;

        // initialize scanner
        Scanner input = new Scanner(System.in) ;
        int number = input.nextInt() ;

        // closing scanner
        input.close();

        if (number > 0){
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number zero is neither positive nor negative.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
