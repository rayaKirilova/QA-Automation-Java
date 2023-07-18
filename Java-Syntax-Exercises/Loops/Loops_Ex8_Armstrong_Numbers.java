import java.util.Scanner;

public class Loops_Ex8_Armstrong_Numbers {
    public static void main(String[] args) {

        System.out.println("Type an integer number: ");

        Scanner scan = new Scanner(System.in);
        int initialNumber = scan.nextInt();
        int number = initialNumber ;

        scan.close();

        int remainder = 0;
        int totalSum = 0;

        while (initialNumber != 0) {
            remainder = initialNumber % 10;
            int powerNum = remainder * remainder * remainder;
            totalSum += powerNum;
            initialNumber /= 10;
        }

        if (totalSum == number) {
            System.out.println(String.format("The number %s is an Armstrong number.", number));
        } else {
            System.out.println(String.format("The number %s is not an Armstrong number.", number));
        }
    }
}
