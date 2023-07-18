import java.util.Scanner;
public class Sum_Even_Odd_from_User_Input {
    public static void main(String[] args) {

        // initialize empty array with length 3
        int arrayLength = 3 ;
        int[] array = new int[arrayLength] ;

        System.out.println("Enter integer number: ");
        Scanner scan = new Scanner(System.in) ;

        for (int i = 0 ; i < arrayLength ; i++){
            // add numbers from user input to array
           array[i] = scan.nextInt() ;
        }
        scan.close() ;

        int sumOdd = 0 ;
        int sumEven = 0 ;

        for (int number : array){
            if (number % 2 == 0){
                sumEven += number ;
            } else {
                sumOdd += number ;
            }
        }
        //System.out.println(Arrays.toString(array));
        System.out.println("Even numbers sum is: " + sumEven);
        System.out.println("Odd numbers sum is: " + sumOdd);
    }
}
