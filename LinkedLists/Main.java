import java.util.LinkedList;

public class Main{

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();

        // Treat it like a stack
        linkedlist.push("A");
        linkedlist.push("V");
        linkedlist.push("Q");

        System.out.println(linkedlist);

        linkedlist.pop();
        System.out.println(linkedlist);


        // Treat it like a Qeue
        LinkedList<String> linkylist = new LinkedList<String>();
        linkylist.offer("G");
        linkylist.offer("A");
        linkylist.offer("F");

        System.out.println(linkylist);

        linkylist.poll();
        System.out.println(linkylist);

        // LinkedList
        LinkedList<String> linklist = new LinkedList<String>();
        linklist.offer("G");
        linklist.offer("A");
        linklist.offer("F");

        linklist.add(2, "R");
        System.out.println(linklist);
        linklist.remove("R");
        System.out.println(linklist); 
        linklist.remove(0);
        System.out.println(linklist);
    }

}