import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {

        // message
        System.out.print("Type a number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Invalid number");
        }
    }
}
