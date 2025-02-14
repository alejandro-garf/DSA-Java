
public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Methods

    // Adds Object Data
    public void add(Object data){
        if (size >= capacity){    // checks if we're at capacity and if we are it will grow the array
            grow();
        }
        array[size] = data; // the array at index of the last item 
        size++; // increase our size by one
    }

    // Inserts Object Data at specefic index 
    public void insert(int index, Object data){
        if (size >= capacity){
            grow();
        }
        for (int i = size - 1; i > index; i--){
            array[i] = array[i - 1]; //Will shift all the elements to the right to make room for the insertion
        }
        array[index] = data;
        size++;
    }

    // delets object data
    public void delete(Object data){

    }

    //search
    public int search(Object data){
        return -1;
    }

    // grows array
    public void grow(){

    }

    // Shrinks array
    public void shrink(){

    }

    // Returns true if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // No idea lol, String?
    public String toString() {

        String string = " "; // intialize empty string

        // iterrates through the array
        for(int i = 0; i < capacity; i++ ){
            string += array[i] + ", ";    //not sure what it is doing here
        }

        if (string != ""){
            string = "[" + string.substring(0, string.length() - 2) + "]"; //gets ride of the comma at the end and encapuslates in square brackets
        }
        else {
            string = "[]";
        }
        return string;
    }


}