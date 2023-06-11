import java.util.Scanner;

public class Conditional_Statements_Ex3_Divisible_by_2_or_6 {
    public static void main(String[] args) {

        // message fot the user
        System.out.print("Type a number: ") ;

        // initialize scanner for user input
        Scanner scan = new Scanner(System.in) ;
        int number = scan.nextInt() ;

        // closing scanner for user input
        scan.close();

        if (number % 2 == 0){
            System.out.println(String.format("The number %s is divisible by 2 without remainder.", number));
            if (number % 6 == 0){
                System.out.println(String.format("The number %s is divisible by 6 without remainder.", number));
            } else {
                System.out.println(String.format("The number %s is not divisible by 6.", number));
            }
        } else {
            System.out.println(String.format("The number %s is not divisible by 2.", number));
        }
    }
}
