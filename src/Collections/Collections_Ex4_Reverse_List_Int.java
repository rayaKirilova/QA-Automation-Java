import java.util.ArrayList;
import java.util.List;

public class Collections_Ex4_Reverse_List_Int {
    public static void main(String[] args) {

        List<Integer> myIntList = new ArrayList<Integer>() ;
        myIntList.add(1) ;
        myIntList.add(2) ;
        myIntList.add(3) ;
        myIntList.add(4) ;
        myIntList.add(5) ;

        System.out.println(myIntList) ;
        List<Integer> reversedIntList = new ArrayList<Integer>() ;

        for (int i = myIntList.size() - 1; i >=
                0 ; i--){
            reversedIntList.add(myIntList.get(i)) ;
        }
        System.out.println(reversedIntList) ;
    }
}
