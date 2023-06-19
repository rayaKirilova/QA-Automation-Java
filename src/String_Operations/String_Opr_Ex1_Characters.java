import java.util.Scanner;

public class String_Opr_Ex1_Characters {
    public static void main(String[] args) {

        System.out.println("Type a word: ");
        Scanner scan = new Scanner(System.in) ;
        String inputString = scan.next() ;
        scan.close();

        for (int i = 0 ; i < inputString.length() ; i++){
            System.out.println(inputString.charAt(i))  ;
        }
    }
}
