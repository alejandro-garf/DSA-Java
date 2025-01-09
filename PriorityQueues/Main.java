import java.util.*;

public class Main{

    public static void main(String[] args) {

        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(1.5);
        queue.offer(2.9);
        queue.offer(4.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue);

        

    }
}