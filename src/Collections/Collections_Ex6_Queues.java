import java.util.LinkedList;
import java.util.Queue;

public class Collections_Ex6_Queues {
    public static void main(String[] args) {

        Queue<String> carsQueue = new LinkedList<String>() ;

        carsQueue.add("Toyota") ;
        carsQueue.add("Volvo") ;
        carsQueue.add("Opel") ;
        carsQueue.add("Kia") ;

        System.out.println(carsQueue);
        System.out.println(carsQueue.peek());
        System.out.println(carsQueue.remove());
        System.out.println(carsQueue);
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue);

    }
}
