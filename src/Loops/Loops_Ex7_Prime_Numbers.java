public class Loops_Ex7_Prime_Numbers {
    public static void main(String[] args) {
        int i = 0;
        int number = 0;

        //define empty string
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;

            for (number = i; number >= 1; number--) {
                if (i % number == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //append the prime number to the string
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 100 are:");
        System.out.println(primeNumbers);
    }
}
