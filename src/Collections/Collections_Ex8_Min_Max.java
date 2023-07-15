import java.util.ArrayList;
import java.util.List ;
import java.util.Collections;

public class Collections_Ex8_Min_Max {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100} ;

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE ;

        for (int i = 0 ; i < arrayOfNumbers.length ; i++){
            if (arrayOfNumbers[i] >= maxNum) {
                maxNum = arrayOfNumbers[i] ;
            }
            if (arrayOfNumbers[i] <= minNum) {
                minNum = arrayOfNumbers[i] ;
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);

        List<Integer> listOfNumbers = new ArrayList<Integer>() ;
        listOfNumbers.add(1000) ;
        listOfNumbers.add(2000) ;
        listOfNumbers.add(3000) ;
        listOfNumbers.add(4000) ;
        listOfNumbers.add(5000) ;
        listOfNumbers.add(6000) ;
        listOfNumbers.add(7000) ;

        int maxListValue = Collections.max(listOfNumbers) ;
        int minListValue = Collections.min(listOfNumbers) ;

        System.out.println(maxListValue);
        System.out.println(minListValue);
    }
}
