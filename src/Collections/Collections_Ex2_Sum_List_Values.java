import java.util.ArrayList;
import java.util.List;

public class Collections_Ex2_Sum_List_Values {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<Double>();

        myList.add(1.2);
        myList.add(1.3);
        myList.add(1.4);
        myList.add(1.5);
        myList.add(1.6);
        myList.add(1.7);
        myList.add(1.8);
        myList.add(1.9);
        myList.add(2.1);

        int listSize = myList.size();
        double totalSum = 0;

        for (int i = 0; i < listSize; i++) {
            totalSum += myList.get(i);
        }
        // System.out.println(myList);
        System.out.println(totalSum);
    }
}
