public class Loops_Ex3_Aprtment_Number {
    public static void main(String[] args) {

        int numberOfFloors = 5;
        int numberOfAppartments = 8;

        for (int i = 1; i <= numberOfFloors; i++) {
            for (int k = 1; k <= numberOfAppartments; k++) {
                if (i == 2 && k == 5) {
                    System.out.println(String.format("We reached apartment number %s on floor number %s. Bye!", k, i));
                    continue;
                }
                System.out.println(String.format("This is floor number %s and apartment number %s.", i, k));
            }
        }
    }
}
