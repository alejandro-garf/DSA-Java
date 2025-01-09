import java.util.LinkedList;
import java.util.Queue;

public class main{

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("First Place");
        queue.offer("Second Place");
        queue.offer("Third Place");
        queue.offer("Fourth Place");
        queue.offer("Fifth Place");

        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.contains("First Place"));
        System.out.println(queue.contains("Sah dude"));

        queue.poll();

        System.out.println(queue);
        System.out.println(queue.peek());

    }
}