
public class main{

    public static void main(String[]args) {

        //ArrayList<String> arraylist = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.capacity);

        DynamicArray dynamiccArray = new DynamicArray(15);
        System.out.println(dynamiccArray.capacity);

    }
}
