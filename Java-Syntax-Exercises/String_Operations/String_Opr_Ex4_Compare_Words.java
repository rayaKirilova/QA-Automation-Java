public class String_Opr_Ex4_Compare_Words {
    public static void main(String[] args) {

        String firstWord = "quality";
        String secondWord = "assurance";
        String thirdWord = "quality";

        int firstReturnValue = firstWord.compareTo(secondWord);
        int secondReturnValue = firstWord.compareTo(thirdWord); //  0
        int thirdReturnValue = secondWord.compareTo(thirdWord);

       /* System.out.println(firstReturnValue);
        System.out.println(secondReturnValue);
        System.out.println(thirdReturnValue);
        */

        if (firstReturnValue == 0 || secondReturnValue == 0 || thirdReturnValue == 0) {
            System.out.println(firstWord);
        }
    }
}