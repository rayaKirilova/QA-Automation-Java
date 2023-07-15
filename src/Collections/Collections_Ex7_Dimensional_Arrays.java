public class Collections_Ex7_Dimensional_Arrays {
    public static void main(String[] args) {

        int[][] dimensionalArray = new int[5][5] ;

        for (int i = 1 ; i <= dimensionalArray.length ; i++){
            for (int k = 1 ; k <=
                    dimensionalArray[0].length ; k++){
                System.out.print(i + " | " + k + "\n");
            }
        }
    }
}
