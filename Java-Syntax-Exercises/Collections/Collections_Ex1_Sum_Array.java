import java.util.Scanner;

public class Collections_Ex1_Sum_Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8} ;
        int totalSum = 0 ;

        for (int i = 0 ; i < array.length ; i++){
            totalSum += array[i] ;
        }
        System.out.println(totalSum);
    }
}
