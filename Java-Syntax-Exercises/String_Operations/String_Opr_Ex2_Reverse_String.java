import java.util.Scanner;

public class String_Opr_Ex2_Reverse_String {
    public static void main(String[] args) {

        String[] text = {"EVIL", "STAR"} ;

        String firstWord = text[0] ;
        String secondWord = text[1] ;

        for (int j = secondWord.length() - 1 ; j >= 0 ; j--){
            System.out.println(secondWord.charAt(j))  ;
        }
        System.out.println() ;

       for (int i = firstWord.length() - 1  ; i >= 0 ; i--){
            System.out.println(firstWord.charAt(i))  ;
        }
    }
}
