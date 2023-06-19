import java.util.Scanner;

public class Even_or_Odd_Number {
    public static void main(String[] args) {

        // message
        System.out.print("Please, type a number: ") ;

        Scanner input = new Scanner(System.in) ;
        int number = input.nextInt();

        int remainder = number % 2 ;

        String result = (remainder == 0) ? "The number is even." : "The number is odd." ;

        System.out.println(result) ;
    }
}
