public class String_Opr_Ex3_Count_Occurence {
    public static void main(String[] args) {

        String sentence = "Maggie is an engineer. Gilbert is an artist.";
        int length = sentence.length(); // 44

        int counter = 0;

        for (int i = 0; i < length - 1; i++) {
            char first = sentence.charAt(i);
            char second = sentence.charAt(i + 1);
            String occurence = String.format("%s%s", first, second);

            if (occurence.equalsIgnoreCase("gi")) {
                counter++;
            }
        }
         System.out.println(counter);
    }
}

