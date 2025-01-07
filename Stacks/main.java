import java.util.Stack;
public class main{
    public static void main(String[] args) {
     
        Stack<String> stack = new Stack<String>();


        stack.push("Disaster");
        stack.push("APT");
        stack.push("Falling Down");
        stack.push("Careless Whisper");

        System.out.println(stack);

        //stack.pop(); //Don't need to list an object becaise pop will always remove the top most method from the stack

        // pop returns the value of the object that I popped, so I can then assign it to a variable 
        String Favsong = stack.pop();
        System.out.println(Favsong);

        System.out.println(stack);

        // Peek method "peeks" at what object is at the top of the stack without changing anything
        System.out.println(stack.peek());

        // Search Method
        stack.push("Careless Whisper");
        System.out.println(stack.search("APT"));
        System.out.println(stack.search("Falling Down"));
        System.out.println(stack.search("Disaster"));
        System.out.println(stack.search("Careless Whisper"));

        System.out.println(stack.search("Hola"));

        // Run out of memory by creating too many objects in stack

        for(int i = 0; i < 100000000; i++){
            stack.push("Let you down");
        }

    }
}

// Good for backtracking algoritmns
 