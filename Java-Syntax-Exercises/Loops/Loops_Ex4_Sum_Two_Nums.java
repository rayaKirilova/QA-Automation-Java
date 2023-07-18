import java.util.Scanner;

public class Loops_Ex4_Sum_Two_Nums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        // empty string for user input
        String input = "" ;

        int sum = 0 ;

        do {
            System.out.println("Please, type first number: ");
            int firstNum = scan.nextInt() ;

            System.out.println("Please, type second number: ");
            int secondNum = scan.nextInt() ;

            sum = firstNum + secondNum ;
            System.out.println("The sum of first and second number is: " + sum);

            System.out.println("Would you like to continue? Enter 'Yes' or 'No'");
            input = scan.next() ;

            if (input.equalsIgnoreCase("no")){
                System.out.println("Thank you and have a nice day!");
            }

        } while (input.equalsIgnoreCase("Yes")) ;

        // closing scanner
        scan.close();
    }
}
