import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;

        System.out.println("Please, type a number: ");

        int number = input.nextInt();
        input.close();

        for (int i = 1; i <= number ; i++){
            System.out.println(i) ;
        }
    }
}
