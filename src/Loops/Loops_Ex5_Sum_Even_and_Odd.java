import java.util.Scanner;

public class Loops_Ex5_Sum_Even_and_Odd {
    public static void main(String[] args) {

        int[] integerArray = {123, 345, 678, 909, 321, 654, 789} ;
        // even : 678, 654 ; sum: 1332
        // sum odd: 2487

        System.out.println("Sum of the even and odd numbers of array [123, 345, 678, 909, 321, 654, 789]") ;
        int sumOdd = 0 ;
        int sumEven = 0 ;

        for (int number : integerArray){
            if (number % 2 == 0){
                sumEven += number ;
            } else {
                sumOdd += number ;
            }
        }
        System.out.println("Even numbers sum is: " + sumEven);
        System.out.println("Odd numbers sum is: " + sumOdd);
    }
}
