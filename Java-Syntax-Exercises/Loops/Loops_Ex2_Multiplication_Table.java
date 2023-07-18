import java.util.Scanner;

public class Loops_Ex2_Multiplication_Table {
    public static void main(String[] args) {

        // message
        System.out.print("Please, type a number from 1 to 10: ");

        // initialize scanner
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // closing scanner input
        input.close();

        for (int i = 1; i <= number; i++) {
            int result = i * number ;

            System.out.println(String.format("%s * %s = %s", i, number, result));
        }
    }
}
