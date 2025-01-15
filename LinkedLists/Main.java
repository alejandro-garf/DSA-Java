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
        

    }

}