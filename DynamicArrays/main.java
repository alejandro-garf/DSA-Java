
public class main{

    public static void main(String[] args) {

        //ArrayList<String> arraylist = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray();
       

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");

        dynamicArray.insert(0, "X");

        System.out.println(dynamicArray);
        System.out.println("size" + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());


        

    }
}
