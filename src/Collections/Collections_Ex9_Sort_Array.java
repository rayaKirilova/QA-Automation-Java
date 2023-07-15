import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Ex9_Sort_Array {
    public static void main(String[] args) {

        int[] intArray = {20, 70, 99, 600, 709, 805};
        Arrays.sort(intArray);

        for (int number : intArray) {
            System.out.print(number + " ");
        }
    }
}
