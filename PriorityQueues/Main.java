import java.util.*;

public class Main{

    public static void main(String[] args) {

        Queue<Double> queue = new PriorityQueue <>(Collections.reverseOrder()); //When using Priority Queues with Numbers, they will be ordered in ascending order    
                                                                                // Collections.reverseOrder() makes them go in descending order

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