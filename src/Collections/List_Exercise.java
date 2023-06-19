import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Exercise {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();

        System.out.println("Type a word: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        while (!input.equalsIgnoreCase("stop")) {
            myList.add(input);
            System.out.println("Type another word: ");
            input = scan.next();
        }
        System.out.println("Ok. Thank you! ");
        System.out.println(myList) ;

        int len = myList.size() ;
        System.out.println("The size of my list is: " + len);
        myList.remove(len - 1) ;
        System.out.println("My new list is: " + myList);
    }
}
