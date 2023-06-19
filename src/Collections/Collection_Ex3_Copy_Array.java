import java.util.ArrayList;
import java.util.List;

public class Collection_Ex3_Copy_Array {
    public static void main(String[] args) {

        String[] toys = {"bear", "doll", "ball", "truck", "duck", "bunny"};
        List<String> myNewToysList = new ArrayList<String>();

        int length = toys.length;

        for (int i = 0; i < length; i++) {
            myNewToysList.add(toys[i]);
        }
        System.out.print("My toy list is: ");
        System.out.println(myNewToysList);
    }
}
