import java.util.Arrays;

public class Loops_Ex6_Reversed_Numbers_with_Array {
    public static void main(String[] args) {

        // initialize array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;

        // initialize new array with the same length
        int[] reversedArray = new int[array.length];

        // variable for new array index
        int reversedArrayIndex = 0;

        for (int i = array.length - 1; i >= 0 ; i--){
            reversedArray[reversedArrayIndex] = array[i];
            reversedArrayIndex ++ ;
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}
