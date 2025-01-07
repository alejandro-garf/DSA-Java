import java.util.Stack;
public class main{
    public static void main(String[] args) {
     
        Stack<String> stack = new Stack<String>();


        stack.push("Disaster");
        stack.push("APT");
        stack.push("Falling Down");
        stack.push("Careless Whisper");

        System.out.print(stack);

        stack.pop(); //Don't need to list an object becaise pop will always remove the top most method from the stack

        System.out.print(stack);
    }
}