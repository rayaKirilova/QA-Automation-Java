import java.util.Scanner;

public class Conditional_Statements_Ex2_Divisible_by_2_or_3 {
    public static void main(String[] args) {

        // message
        System.out.print("Please, type a number: ") ;

        // initialize scanner
        Scanner input = new Scanner(System.in) ;
        int number = input.nextInt() ;

        // closing scanner
        input.close();

        if (number % 2 == 0){
            System.out.println("The number is divisible by 2 without remainder.");
        } else {
            if (number % 3 == 0){
                System.out.println("The number is divisible by 3 without remainder.");
            }
            System.out.println("The number is not divisible by 2 nor by 3.");
        }
    }
}
