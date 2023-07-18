public class Loops_Ex6_Reversed_Numbers {
    public static void main(String[] args) {

        int number = 12345 ;
        int remainder = 0 ;

        String result = "" ;

        while (number != 0){
            remainder += number % 10;
            //
            number /= 10 ;
        }

        System.out.println(remainder) ;
    }
}
