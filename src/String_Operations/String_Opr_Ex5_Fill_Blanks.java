import java.util.Scanner;

public class String_Opr_Ex5_Fill_Blanks {
    public static void main(String[] args) {

        String example = "My name is ____. I am ___ years old and I am teacher at “________” school." ;

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in) ;
        String name = input.next() ;

        System.out.println("Enter your age: ");
        int age = input.nextInt() ;

        System.out.println("Enter your school name: ");
        String schoolName = input.next() ;

        input.close() ;

        System.out.println(String.format("My name is %s. I am %s years old and I am teacher at “%s” school.",
                name, age, schoolName)) ;
    }
}
